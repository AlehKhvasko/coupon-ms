pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'building...'
                echo"Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
                sh "mvn -DskipTests clean package"
            }
        }
        stage('Install') {
            steps {
                sh "mvn install"
            }
        }
    }
}
