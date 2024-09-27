pipeline {
    agent any // IN THE LECTURE I WILL EXPLAIN THE SCRIPT AND THE WORKFLOW

    environment {
        // Define Docker Hub credentials ID
        DOCKERHUB_CREDENTIALS_ID = '243f7d21-23be-420b-9da9-94949cf7172b'
        // Define Docker Hub repository name
        DOCKERHUB_REPO = 'jukkiss/lecturedemo3'
        // Define Docker image tag
        DOCKER_IMAGE_TAG = 'latest'
    }
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git branch: 'main', url: 'https://github.com/jukkiss/dockerfirst.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                // Build Docker image
                script {
                    docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                // Push Docker image to Docker Hub
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKERHUB_CREDENTIALS_ID) {
                        docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}