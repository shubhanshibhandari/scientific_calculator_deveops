pipeline {

    agent any

    environment {
        PASS = credentials('registry-pass')
        IMAGE="spe-mini-project"
        USER="shubhanshi"

    }

    stages {

        stage('Building jar') {
            steps {
                sh './jenkins/build/mvn.sh mvn -B -DskipTests clean package'
            }

            post {
                success {
                   archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
        }

        stage('Test') {
            steps {
                sh './jenkins/test/mvn.sh mvn test'
            }

            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('building docker image') {
                    steps {
                        sh './jenkins/build/build.sh'
                    }
                }
        stage('Pushing to docker hub && removing the local mage') {
            steps {
                sh './jenkins/push/push.sh'
            }
        }

        stage('Ansible Deploy') {
                    steps {
                        ansiblePlaybook becomeUser: 'null',
                        extras: "-e tag=$BUILD_NUMBER -e user=$USER -e image=$IMAGE",
                        colorized: true,
                        installation: 'Ansible',
                        inventory: 'inventory',
                        playbook: 'deploy-playbook.yml',
                        sudoUser: 'null'
                    }
                }
    }
}
