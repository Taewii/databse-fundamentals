package app.models.dto.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "supplier")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SupplierDto implements Serializable {

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "is-importer")
    private boolean isImporter;

    public SupplierDto() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImporter() {
        return this.isImporter;
    }

    public void setImporter(boolean importer) {
        isImporter = importer;
    }
}
