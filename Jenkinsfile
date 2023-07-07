pipeline{
    agent any
    stages{
        stage("Clean Up"){
            steps{
                deleteDir()
            }
        }
        stage("Clone"){
            steps{
                sh "git clone https://github.com/logx73/billerProject.git"
            }
        }
        stage("Build"){
            steps{
                dir("billerProject"){
                    sh "mvn clean compile"
                }

            }
        }
        stage("Test"){
            stage{
                dir("billerProject"){
                    sh "mvn test"
                }
            }
        }
    }
}