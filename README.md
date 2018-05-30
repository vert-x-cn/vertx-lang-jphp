[![Build Status](https://travis-ci.org/okou19900722/vertx-lang-jphp.svg?branch=master)](http://travis-ci.org/okou19900722/vertx-lang-jphp)
# vertx-lang-jphp
Vert.x JPHP support 

[phpdoc](https://vertx.okou.tk/phpdoc/vertx-jphp/index.html)

### 怎么用 / How to use?

Maven配置 / Maven pom.xml:
```xml
<dependency>
  <groupId>tk.okou</groupId>
  <artifactId>vertx-lang-jphp</artifactId>
  <version>3.6.0-SNAPSHOT</version>
</dependency>
```

Gradle配置 / Gradle build.gradle file:
```groovy
dependencies {
  compile 'tk.okou:vertx-lang-jphp:3.6.0-SNAPSHOT'
}
```

### Hello from Vert.x!

```php
$httpServer = $vertx->createHttpServer();
$httpServer->requestHandler(function ($res) {
    $res->response()->end("Hello from Vert.x!");
});
$httpServer->listen(8998);
```

### 创建Vertx 实例 / Create a Vert.x instance

如果你需要创建Vertx实例，可以按下面的代码创建:

```php
use io\vertx\jphp\core\Vertx;

//create a vertx instance
$vertx = Vertx::vertx();
```

如果你是通过java来deploy一个php模块，那么你通常不需要自己创建，因为有一个全局的$vertx对象可以直接使用

### Verticle

php脚本本身就是一个verticle，但如果你需要像java一样指定一个方法，那么你可以按下面方法：

```php

function vertxStart(){
    //Called when verticle is deployed
}

function vertxStartAsync($future){
    //Called when verticle is deployed
}

function vertxStop($future){
    //Called when verticle is undeployed
}

function vertxStopAsync($future){
    //Called when verticle is undeployed
}

```

当Vert.x 部署这个Verticle脚本时，如果上下文环境中有`vertxStart`方法，会优先调用此方法，否则尝试调用异步的`vertxStartAsync`方法。`vertxStartAsync`方法接收一个`io\vertx\jphp\core\Future`类型的参数，在Verticle部署完成后，需要调用`complete`方法来显式的告诉Vert.x完成。

同理，Vert.x在移除一个Verticle脚本时，优先判断`vertxStop`并执行，如果没有`vertxStop`方法，会尝试调用异步的`vertxStartAsync`方法。`vertxStartAsync`方法也有一个`io\vertx\jphp\core\Future`类型的参数。

### 部署Verticle / Verticle Deployment

你可以使用`php:`前缀或者`.php`后缀来部署一个php verticle

```php
    $vertx->deployVerticle("php:test");
    // 或者
    $vertx->deployVerticle("php:test.php");
    // 或者
    $vertx->deployVerticle("test.php");
```

或者使用java
```java
    import io.vertx.core.Vertx;
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle("php:test");
    // 或者
    vertx.deployVerticle("php:test.php");
    // 或者
    vertx.deployVerticle("test.php");
```

### DataObject
你可以直接创建需要的DataObject对象，比如HttpServerOption:

```php
use io\vertx\jphp\core\http\HttpServerOptions;

$httpServerOptions = new HttpServerOptions();
$httpServerOptions->setPort(8080);
$httpServerOptions->setHost("localhost");
```

当然你也可以直接使用数组，比如`Hello Vert.x!`例子中
```php
$httpServerOptions = [
    "port"  =>  8998,
    "host"  =>  "localhost",
];

$httpServer = $vertx->createHttpServer($httpServerOptions);
$httpServer->requestHandler(function ($res) {
    $res->response()->end("Hello from Vert.x!");
});
$httpServer->listen();
```
![Note](asset/note.png) 注意，DataObject目前只支持类和接口，所以java的api中参数为接口的，php中不支持数组写法，只能创建实现类的对象


;TODO

- [x] 使用vertx-codegen自动生成JPHP的Wrapper类以及php的api文件
- [x] JPHPVerticleFactory和VerticleFactory
- [x] VertxExtension 读取jphp-vertx-extension.properties文件并注册wrapper类
- [ ] 使用vertx-docgen自动生成对应的asciidoc文档
- [ ] 测试
