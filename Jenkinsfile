pipeline {
    agent any
    stages {
       stage('Compile') {
                steps {
                    sh "mvn compile"
                }
            }
        stage('Build') {
            steps {
                echo 'building...'
                echo"Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
                sh "mvn -DskipTests clean package"
            }
        }

    }
}
