
## 执行 build 完成后 push 镜像

mvn clean package docker:build -DpushImage

## 部署应用
kubectl apply -f ci-demo.yaml