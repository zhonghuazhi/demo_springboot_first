package net.cc.demo_springboot_first.web.controller;

import net.cc.demo_springboot_first.domain.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname LicenseController
 * @author: zhonghua.zhi
 * @date: 2019-04-28 17:46
 * @version: 1.0
 * @description: TODO
 */
@RestController
@RequestMapping(value = "v1/organizations/{organizationId}/licenses")
public class LicenseController {

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId) {

        return new License()
                .withId(licenseId)
                .withOrganizationId(organizationId)
                .withProductName("Teleco")
                .withLicenseType("Seat");
    }
}