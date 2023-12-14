

### Screenshot

#### api-gateway

<img src="./img/SCREENSHOT/8.png" width="80%" height="80%"/>

<br>

#### foobar-user-service

[http://localhost:5555/foobar-user-service/welcome](http://localhost:5555/foobar-user-service/welcome)<br>

브라우저 접근 → api-gateway → foobar-user-service (Router 를 통한 접근)

<img src="./img/SCREENSHOT/9.png"/>

<br>



[http://localhost:9991/welcome](http://localhost:9991/welcome)<br>

브라우저 접근 → foobar-user-service (직접 접근)

<img src="./img/SCREENSHOT/10.png"/>

<br>



#### foobar-user-history

생략

<br>



#### admin-dashboard

<img src="./img/SCREENSHOT/1.png" width="70%" height="70%"/>

<br>



<img src="./img/SCREENSHOT/2.png" width="70%" height="70%"/>

<br>



<img src="./img/SCREENSHOT/3.png" width="70%" height="70%"/>

<br>



<img src="./img/SCREENSHOT/4.png" width="70%" height="70%"/>

<br>



<img src="./img/SCREENSHOT/5.png" width="70%" height="70%"/>

<br>



<img src="./img/SCREENSHOT/6.png" width="70%" height="70%"/>

<br>



<img src="./img/SCREENSHOT/7.png" width="70%" height="70%"/>

<br>



### 포트 사용정보

포트번호를 일반적으로 사용하는 8000, 8761 등으로 사용하지 않은 이유는 윈도우에 예약된 포트... 때문에 어쩔수 없이 아래처럼 지정했습니다.. 휴... 맥북을 하나 살까 하고 잠깐 미친생각이 들긴 했는데 일단 충동을 참았습니다. 하하하.<br>

- foobar-user-history
  - port : 9992
- foobar-user-service
  - port : 9991
- spring-cloud
  - admin-dashboard 
    - port : 7776
  - api-gateway
    - port : 5555
  - config-server
    - port : 9999
  - eureka-server
    - port : 8948

<br>



### compose 스케일링

도커컴포즈도 Scaling 을 통해 container 를 여러개 띄울 수 있는데요. 이건 잠깐 쉬었다가 할께요. 휴...

<br>

