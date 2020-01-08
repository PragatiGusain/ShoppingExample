package com.asd

import grails.plugin.springsecurity.annotation.Secured

class DashboardController {

    def springSecurityService

    @Secured("IS_AUTHENTICATED_ANONYMOUSLY")
    def index() {
        [username: springSecurityService.currentUser.username]
    }
}
