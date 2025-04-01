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
                url: 'https://github.com/SaiRamya15/mavenjava.git'
            }
        }
   

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
                
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t your-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d --name mysecondcontainer2 -p 9091:80 your-app'
            }
        }
    }
}
