#!usr/bin/env groovy

def call() {
    sh 'docker system prune -y'
    sh 'docker build -t test19-auto .'
}