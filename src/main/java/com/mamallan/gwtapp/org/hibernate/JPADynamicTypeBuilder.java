package com.mamallan.gwtapp.org.hibernate;

//EclipseLink imports
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.dynamic.DynamicClassLoader;
import org.eclipse.persistence.dynamic.DynamicType;
import org.eclipse.persistence.dynamic.DynamicTypeBuilder;

/**
*
* @author dclarke
* @since EclipseLink 1.2
*/
public class JPADynamicTypeBuilder extends DynamicTypeBuilder {

  public JPADynamicTypeBuilder(Class<?> dynamicClass, DynamicType parentType, String... tableNames) {
      super(dynamicClass, parentType, tableNames);
  }

  public JPADynamicTypeBuilder(DynamicClassLoader dcl, ClassDescriptor descriptor, DynamicType parentType) {
      super(dcl, descriptor, parentType);
  }

  @Override
  protected void configure(ClassDescriptor descriptor, String... tableNames) {
      super.configure(descriptor, tableNames);

      if (descriptor.getCMPPolicy() == null) {
          descriptor.setCMPPolicy(new DynamicIdentityPolicy());
      }
  }
}