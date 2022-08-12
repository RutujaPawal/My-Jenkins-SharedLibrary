def call(){
withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'K8S', namespace: '', serverUrl: '') {
sh "kubectl apply -f eks-deploy-k8s.yaml"
}
