pipeline {

        stages {
                stage('Clone') {
                    steps {
                        git 'https://github.com/TON_USERNAME/TON_REPO.git'
                    }
                }

                stage('Build') {
                    steps {
                        sh 'mvn clean install'
                    }
                }

                stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                }
        }
        post {

            success {
                echo "Build  réussi"

            }
            failure {
                echo "Build  échoué"
            }
            always {
                cleanWs() // nettoyer le workspace après chaque build
            }
        }
        }


}