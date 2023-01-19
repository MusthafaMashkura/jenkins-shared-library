def dast() {
               sh '''
                docker pull owasp/zap2docker-stable
                docker run -dt --name owasp owasp/zap2docker-stable sh
                docker exec owasp mkdir /zap/wrk
 //               docker exec owasp zap-baseline.py -t "${appurl}" -x report.xml -I
                docker exec owasp zap-baseline.py -t http://13.232.140.244:8080/hello-world-maven/ -x report.xml -I
                echo $WORKSPACE
                docker cp owasp:/zap/wrk/report.xml $WORKSPACE/report.xml
                docker stop owasp && docker rm owasp        
               '''
            }
