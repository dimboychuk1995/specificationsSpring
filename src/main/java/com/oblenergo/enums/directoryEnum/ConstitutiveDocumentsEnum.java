package com.oblenergo.enums.directoryEnum;

/**
 * Created by us9522 on 21.02.2017.
 */
public enum ConstitutiveDocumentsEnum {
  NOTFULL("-"),
  ATTORNEY("Довіреності № від року"),
  CERTIFACATE("Свідоцтва про державну реєстрації фізичної особи-підприємця серія № виданого, дата проведення державної реєстрації року, №"),
  LAW("Закону України *Про місцеве самврядування*"),
  STATUTE("Статуту № зареєстрованого від року"),
  PASSPORT("паспорт сереія № виданий року"),
  EXTRACT("Виписка з єдиного державного реєстру фізичної особи-підприємця серія № видана, дата року"),;

  private String constitutiveDocuments;

  private ConstitutiveDocumentsEnum(String constitutiveDocuments){
    this.constitutiveDocuments = constitutiveDocuments;
  }

  public String getConstitutiveDocuments() {
    return constitutiveDocuments;
  }
}
