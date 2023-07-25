#!usr/bin/env groovy

def call() {
    sh 'docker build -t test19-auto .'
}