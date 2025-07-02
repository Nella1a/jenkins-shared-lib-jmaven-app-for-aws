#! /usr/bin/env groovy

def call() {
    echo "Dockerhub login ..."
    withCredentials([usernamePassword(credentialsId:'cred-docker', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
    }
}