package tech.thewithz.oxforddict;

import tech.thewithz.oxforddict.impl.OxfordDictionaryImpl;

public class OxfordDictionaryBuilder {

    private OxfordDictionaryImpl dict;

    public OxfordDictionaryBuilder() {

    }

    public OxfordDictionaryBuilder setCredentials(String app_key, String app_id) {
        dict = new OxfordDictionaryImpl(app_key, app_id);
        return this;
    }

    public OxfordDictionary build() {
        return dict;
    }
}