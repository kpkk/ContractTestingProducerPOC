import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                url("/frauds")
                method(GET())

            }
            response {
                status(200)
                body("[\"pradeep\",\"verified\"]")
            }
        },
        Contract.make {
            request {
                url("/frauds")
                method(GET())

            }
            response {
                status(200)
                body("[\"pradeep\",\"verified\"]")
            }
        }

]