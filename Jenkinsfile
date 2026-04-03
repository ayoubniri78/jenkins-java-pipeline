pipeline {

        stages {
                stage('Clone') {
                    steps {
                        git 'https://github.com/ayoubniri78/jenkins-java-pipeline.git'
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