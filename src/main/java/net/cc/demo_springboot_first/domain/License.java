package net.cc.demo_springboot_first.domain;

/**
 * @classname License
 * @author: zhonghua.zhi
 * @date: 2019-04-28 17:39
 * @version: 1.0
 * @description: TODO
 */
public class License {

    private String id;

    private String organizationId;

    private String productName;

    private String licenseType;

    /**
     * 功能描述:
     *
     * @param id
     * @return: net.cc.demo_springboot_first.domain.License
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-28 17:40
     */
    public License withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * 功能描述:
     *
     * @param organizationId
     * @return: net.cc.demo_springboot_first.domain.License
     * @exception:
     * @author: zhonghua.zhi
     * @date: 2019-04-28 17:41
     */
    public License withOrganizationId(String organizationId){
        this.setOrganizationId(organizationId);
        return this;
    }

    /**
     * 功能描述: 
     *
     * @param productName
     * @return: net.cc.demo_springboot_first.domain.License
     * @exception: 
     * @author: zhonghua.zhi
     * @date: 2019-04-28 17:42
     */
    public License withProductName(String productName){
        this.setProductName(productName);
        return this;
    }
    
    /**
     * 功能描述: 
     *
     * @param licenseType
     * @return: net.cc.demo_springboot_first.domain.License
     * @exception: 
     * @author: zhonghua.zhi
     * @date: 2019-04-28 17:46
     */
    public License withLicenseType(String licenseType){
        this.setLicenseType(licenseType);
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}
