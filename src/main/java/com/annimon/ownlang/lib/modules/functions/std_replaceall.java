package com.annimon.ownlang.lib.modules.functions;

import com.annimon.ownlang.lib.*;

public final class std_replaceall implements Function {
    
    @Override
    public Value execute(Value... args) {
        Arguments.check(3, args.length);
        
        final String input = args[0].asString();
        final String regex = args[1].asString();
        final String replacement = args[2].asString();
        
        return new StringValue(input.replaceAll(regex, replacement));
    }
}