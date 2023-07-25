#!usr/bin/env groovy

def call() {
    sh 'docker system prune --all'
    sh 'docker build -t test19-auto .'
}