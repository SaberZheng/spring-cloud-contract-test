/**
 * @author Amy
 * @date 2019-07-09 17:18
 * @description: 契约
 */

import org.springframework.cloud.contract.spec.Contract
[
        Contract.make {
            description "返回所有顾客"

            request {
                url "/api/customers"
                method GET()
            }

            response {
                status 200
                headers {
                    contentType(applicationJson())
                }
                body("data": [[id: 1L, name: "sam"], [id: 2L, name: "andy"]])
            }
        }
]
