package test2

import com.asd.Role
import com.asd.User
import com.asd.UserRole

class BootStrap {

    def init = { servletContext ->
        Role adminRole = new Role(authority: 'ROLE_ADMIN').save()
        Role userRole = new Role(authority: 'ROLE_USER').save()
        Role managerRole = new Role(authority: 'ROLE_MANAGER').save()

        User admin = new User(username: 'admin', password: 'password').save()
        User user = new User(username: 'user', password: 'password').save()

        new UserRole(user: admin, role: adminRole).save()
        new UserRole(user: user, role: userRole).save()
    }

    def destroy = {
    }
}
