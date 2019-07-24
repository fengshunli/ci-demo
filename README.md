

## 设置tag版本

git tag v1.2

## 查看tag版本

git tag

## 执行 build 完成后 push 镜像

mvn clean package docker:build -DimageVersion=v1.2 -DpushImage

## 部署应用
sed s/{{imageVersion}}/v1.2/g ci-demo.yaml | kubectl apply -f -
