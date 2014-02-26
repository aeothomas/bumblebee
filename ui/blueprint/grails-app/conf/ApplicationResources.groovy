modules = {

    'bootstrap-dummy' {
        resource url: [plugin: 'twitter-bootstrap', dir: 'less', file: 'bootstrap.less'], attrs:[rel: "stylesheet/less", type:'css'] }

    'blueprint' {
        dependsOn 'bootstrap'
        resource url:'less/bootswatch.less', attrs:[rel: "stylesheet/less", type:'css'], disposition: 'head'
    }

    application {
        resource url:'js/application.js'
    }
}