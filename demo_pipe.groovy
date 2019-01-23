node {
stage ('Build') {
sh 'echo Commands to build application'
} s
tage ('Test') {
sh '''
echo Commands to test application
echo Other tests
'''
} s
tage ('Deploy') {
sh 'echo Command to deploy application'
}
}
Declarative pipeline
pipeline {
agent any
stages {
stage('Build'){
steps{
sh "echo Command to build Application"
}
} s
tage('Test'){
steps{
sh "echo Command to test Application"
