#!usr/bin/env groovy

def call(String imageName) {
    sh 'docker system prune --all'
    sh "docker push $imageName"
}