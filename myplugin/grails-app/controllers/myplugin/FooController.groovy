package myplugin

class FooController {

    def index() {
        DaoUtil.checkChanges()
        render "Hello World!"
    }
}
