pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {

                bat 'mvn -f ./my-app/pom.xml package'
                bat 'java -cp %WORKSPACE%/my-app/target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App

            }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }

    }
}
