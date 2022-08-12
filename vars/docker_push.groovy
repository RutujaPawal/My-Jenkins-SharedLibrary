def call(){
  sh "aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/c9x6d1e3"
  sh "docker push public.ecr.aws/c9x6d1e3/docker-image:latest"      
}
