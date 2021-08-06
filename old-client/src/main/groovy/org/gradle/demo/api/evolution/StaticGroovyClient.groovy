package org.gradle.demo.api.evolution

import groovy.transform.CompileStatic

@CompileStatic
class StaticGroovyClient {
    static void main(String[] args) {
        def server = new Server()
        server.name = "lajos"
        println server.name
    }
}