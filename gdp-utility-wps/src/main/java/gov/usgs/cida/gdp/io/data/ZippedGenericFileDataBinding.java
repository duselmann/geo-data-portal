package gov.usgs.cida.gdp.io.data;

import org.n52.wps.io.data.IComplexData;
import org.n52.wps.io.data.binding.complex.GenericFileDataBinding;

/**
 * @author isuftin
 */
public class ZippedGenericFileDataBinding extends GenericFileDataBinding implements IComplexData {

    public ZippedGenericFileDataBinding(ZippedGenericFileData fileData) {
        super(fileData);
    }
    
}
