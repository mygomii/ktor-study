package com.mygomii.plugins

import com.mygomii.routes.customerRouting
import com.mygomii.routes.getOrderRoute
import com.mygomii.routes.listOrdersRoute
import com.mygomii.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
