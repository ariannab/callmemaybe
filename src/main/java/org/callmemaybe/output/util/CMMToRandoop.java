package org.callmemaybe.output.util;

public class CMMToRandoop {
  //    public Type containingClass;
  public String operationSignature;
  public boolean isConstructor;
  public String mustPrecede;
  public String mustFollow;
  public String comment;

  public CMMToRandoop(
      String operationSignature,
      boolean isConstructor,
      String mustPrecede,
      String mustFollow,
      String comment) {
    this.operationSignature = operationSignature;
    this.isConstructor = isConstructor;
    this.mustPrecede = mustPrecede;
    this.mustFollow = mustFollow;
    this.comment = comment;
    //        this.containingClass =
    //                new org.callmemaybe.output.util.Type(
    //                        member.getDeclaringClass().getName(),
    //                        member.getDeclaringClass().getSimpleName(),
    //                        member.getDeclaringClass().isArray());
  }
}
