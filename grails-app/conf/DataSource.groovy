// environment specific settings
environments {
    development {
        grails {
            neo4j {
                type = "embedded"
                location = "C:\\Temp\\neo4j-embedded\\db"
            }
        }
    }
    test {
        grails {
            neo4j {
                type = "embedded"
                location = "C:\\Temp\\neo4j-embedded\\db"
            }
        }
    }
    production {
        grails {
            neo4j {
                type = "embedded"
                location = "C:\\Temp\\neo4j-embedded\\db"
            }
        }
    }
}
