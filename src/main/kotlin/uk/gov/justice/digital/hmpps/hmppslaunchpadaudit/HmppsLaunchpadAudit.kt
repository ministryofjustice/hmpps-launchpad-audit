package uk.gov.justice.digital.hmpps.hmppslaunchpadaudit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HmppsLaunchpadAudit

fun main(args: Array<String>) {
  runApplication<HmppsLaunchpadAudit>(*args)
}
