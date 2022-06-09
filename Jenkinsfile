node{
  stage('SCM Checkout'){
    git 'https://github.com/Olhaaaaa/HomeTask_Maven'
  }
  stage('Compile-Package'){
    sh "mvn clean test -DsuiteXmlFile=testng.xml"
  }
}
