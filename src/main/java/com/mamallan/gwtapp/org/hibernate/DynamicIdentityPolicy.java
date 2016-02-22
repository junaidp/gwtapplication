package com.mamallan.gwtapp.org.hibernate;

//EclipseLink imports
import org.eclipse.persistence.internal.identitymaps.CacheId;
import org.eclipse.persistence.internal.jpa.CMP3Policy;
import org.eclipse.persistence.internal.sessions.AbstractSession;

/**
* Custom CMPPolicy to handle Object[]. The parent class supports only List and
* ID class for composite keys.
*
* @author dclarke
* @since EclipseLink 1.2
*/
public class DynamicIdentityPolicy extends CMP3Policy {

  @Override
  public Object createPrimaryKeyFromId(Object key, AbstractSession session) {
      if (key instanceof Object[]) {
          return new CacheId((Object[])key);
      }
      return super.createPrimaryKeyFromId(key, session);
  }

  @Override
  protected KeyElementAccessor[] initializePrimaryKeyFields(Class keyClass, AbstractSession session) {
      if (keyClass == null && getDescriptor().getPrimaryKeyFields().size() > 1) {
          KeyElementAccessor[] result = super.initializePrimaryKeyFields(null, session);
          this.pkClass = Object[].class;
          return result;
      } else {
          return super.initializePrimaryKeyFields(keyClass, session);
      }
  }

}