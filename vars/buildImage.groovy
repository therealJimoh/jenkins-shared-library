#!usr/bin/env groovy

def call() {
    sh 'docker build -t test2-auto .'
}