package myapp

import myplugin.DaoUtil

class ApppController {

    def index() {
        DaoUtil.checkChanges()
        render "Hello World!"
    }
}
