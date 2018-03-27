/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.script.experimental.api

class ProcessedScriptDataParams : PropertyBagBuilder() {
    companion object {
        val annotations by typedKey<Iterable<Annotation>>()

        val fragments by typedKey<Iterable<ScriptSourceNamedFragment>>()
    }
}

inline fun processedScriptData(from: ChainedPropertyBag = ChainedPropertyBag(), body: ProcessedScriptDataParams.() -> Unit) =
    ProcessedScriptDataParams().build(from, body)