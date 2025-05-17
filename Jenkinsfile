pipeline {
    agent any
    tools {
        maven 'Maven3'  // Ensure Maven is installed in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: "main", 
                credentialsId: 'java', 
                url: 'https://github.com/SaiRamya15/mavenjava.git'
            }
        }
   

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
                
            }
        }

  /*      stage('Build Docker Image') {
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
}*/
         stage('SonarQube Analysis') {
            steps {
                script{
                    bat '''
                            mvn sonar:sonar ^
                              -Dsonar.projectKey=my-maven-app ^
                              -Dsonar.host.url=http://localhost:9000 ^
                              -Dsonar.login=squ_4c861f4b68932a119f73d5ffd385ccd0fc4edee8
                        '''
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}

