pipeline {
    agent any
    tools {
        maven 'Maven3'  // Ensure Maven is installed in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: "main", 
                credentialsId: 'd24121e7-c5e6-413f-a8c4-890f7eeee1fc', 
                url: ''
            }
        }
   

        stage('Build with Maven3') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t your-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run -d -p 8080:8080 your-app'
            }
        }
    }
}
