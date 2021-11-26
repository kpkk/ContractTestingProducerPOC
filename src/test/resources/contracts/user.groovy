import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        urlPath("/users")
        method(GET())
        headers {
            contentType(applicationJson())
        }

    }
    response {

        body('''
            
            {
            “id”:1,
            “Name”: “pradeep”,
            “profession”:”tester”,
            “city”:”Berlin”.       - mandatory
            }

''')
        headers {
            contentType(applicationJson())
            status(200)
        }
    }

}