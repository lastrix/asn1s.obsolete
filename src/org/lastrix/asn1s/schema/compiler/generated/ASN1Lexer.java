/******************************************************************************
 * Copyright (C) 2010-2012 Lastrix                                            *
 * This file is part of ASN1S.                                                *
 *                                                                            *
 * ASN1S is free software: you can redistribute it and/or modify              *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation, either version 2 of the License, or          *
 * (at your option) any later version.                                        *
 *                                                                            *
 * ASN1S is distributed in the hope that it will be useful,                   *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the               *
 * GNU General Public License for more details.                               *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with ASN1S. If not, see <http://www.gnu.org/licenses/>.              *
 ******************************************************************************/

// $ANTLR 3.4 /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g 2012-11-24 19:37:38

package org.lastrix.asn1s.schema.compiler.generated;


import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASN1Lexer extends Lexer {
	public static final int EOF                                   = -1;
	public static final int T__80                                 = 80;
	public static final int T__81                                 = 81;
	public static final int T__82                                 = 82;
	public static final int T__83                                 = 83;
	public static final int T__84                                 = 84;
	public static final int T__85                                 = 85;
	public static final int T__86                                 = 86;
	public static final int T__87                                 = 87;
	public static final int T__88                                 = 88;
	public static final int T__89                                 = 89;
	public static final int T__90                                 = 90;
	public static final int T__91                                 = 91;
	public static final int T__92                                 = 92;
	public static final int T__93                                 = 93;
	public static final int T__94                                 = 94;
	public static final int T__95                                 = 95;
	public static final int T__96                                 = 96;
	public static final int T__97                                 = 97;
	public static final int T__98                                 = 98;
	public static final int T__99                                 = 99;
	public static final int T__100                                = 100;
	public static final int T__101                                = 101;
	public static final int T__102                                = 102;
	public static final int T__103                                = 103;
	public static final int T__104                                = 104;
	public static final int T__105                                = 105;
	public static final int T__106                                = 106;
	public static final int T__107                                = 107;
	public static final int T__108                                = 108;
	public static final int T__109                                = 109;
	public static final int T__110                                = 110;
	public static final int T__111                                = 111;
	public static final int T__112                                = 112;
	public static final int T__113                                = 113;
	public static final int T__114                                = 114;
	public static final int T__115                                = 115;
	public static final int T__116                                = 116;
	public static final int T__117                                = 117;
	public static final int T__118                                = 118;
	public static final int T__119                                = 119;
	public static final int T__120                                = 120;
	public static final int T__121                                = 121;
	public static final int T__122                                = 122;
	public static final int T__123                                = 123;
	public static final int T__124                                = 124;
	public static final int T__125                                = 125;
	public static final int T__126                                = 126;
	public static final int T__127                                = 127;
	public static final int T__128                                = 128;
	public static final int T__129                                = 129;
	public static final int T__130                                = 130;
	public static final int T__131                                = 131;
	public static final int T__132                                = 132;
	public static final int T__133                                = 133;
	public static final int T__134                                = 134;
	public static final int T__135                                = 135;
	public static final int T__136                                = 136;
	public static final int T__137                                = 137;
	public static final int T__138                                = 138;
	public static final int T__139                                = 139;
	public static final int T__140                                = 140;
	public static final int T__141                                = 141;
	public static final int T__142                                = 142;
	public static final int T__143                                = 143;
	public static final int T__144                                = 144;
	public static final int T__145                                = 145;
	public static final int T__146                                = 146;
	public static final int T__147                                = 147;
	public static final int T__148                                = 148;
	public static final int T__149                                = 149;
	public static final int T__150                                = 150;
	public static final int T__151                                = 151;
	public static final int T__152                                = 152;
	public static final int T__153                                = 153;
	public static final int T__154                                = 154;
	public static final int T__155                                = 155;
	public static final int T__156                                = 156;
	public static final int T__157                                = 157;
	public static final int T__158                                = 158;
	public static final int T__159                                = 159;
	public static final int T__160                                = 160;
	public static final int T__161                                = 161;
	public static final int ALL                                   = 4;
	public static final int ASSIGNMENT                            = 5;
	public static final int BIT_STRING                            = 6;
	public static final int BOOLEAN                               = 7;
	public static final int CHOICE                                = 8;
	public static final int CLASS_DEF                             = 9;
	public static final int COMMENT_LINE                          = 10;
	public static final int COMPONENT_TYPE                        = 11;
	public static final int COMPONENT_TYPE_OPTION                 = 12;
	public static final int CONSTRAINT                            = 13;
	public static final int CONSTRAINT_INNER_TYPE                 = 14;
	public static final int CONSTRAINT_PATTERN                    = 15;
	public static final int CONSTRAINT_SIZE                       = 16;
	public static final int CONSTRAINT_TYPE                       = 17;
	public static final int CONSTRAINT_VALUE                      = 18;
	public static final int CONSTRAINT_VALUE_RANGE                = 19;
	public static final int CSTRING                               = 20;
	public static final int ENDPOINT                              = 21;
	public static final int ENUMERATION                           = 22;
	public static final int ENUMERATION_ITEM                      = 23;
	public static final int EXCEPT                                = 24;
	public static final int EXCEPTION_SPEC                        = 25;
	public static final int EXPLICIT                              = 26;
	public static final int EXPORTS                               = 27;
	public static final int EXTENSIBILITY_IMPLIED                 = 28;
	public static final int EXTENSION_ADDITION_ALTERNATIVES_GROUP = 29;
	public static final int EXTENSION_ADDITION_GROUP              = 30;
	public static final int EXTENSION_AND_EXCEPTION               = 31;
	public static final int EXTENSION_END_MARKER                  = 32;
	public static final int FALSE                                 = 33;
	public static final int GLOBAL_MODULE_REFERENCE               = 34;
	public static final int ID                                    = 35;
	public static final int IMPLICIT                              = 36;
	public static final int IMPORTS                               = 37;
	public static final int INT                                   = 38;
	public static final int INTEGER                               = 39;
	public static final int INTERSECTION_ELEMENT                  = 40;
	public static final int MINUS_INFINITY                        = 41;
	public static final int ML_COMMENT                            = 42;
	public static final int MODULE                                = 43;
	public static final int MODULE_IDENTIFIER                     = 44;
	public static final int NAMED_CONSTRAINT                      = 45;
	public static final int NAMED_NUMBER                          = 46;
	public static final int NAMED_TYPE                            = 47;
	public static final int NAME_FORM                             = 48;
	public static final int NAME_NUMBER_FORM                      = 49;
	public static final int NUMBER                                = 50;
	public static final int NUMBER_FORM                           = 51;
	public static final int OCTET_STRING                          = 52;
	public static final int OID                                   = 53;
	public static final int PLUS_INFINITY                         = 54;
	public static final int REAL                                  = 55;
	public static final int REAL_NUMBER                           = 56;
	public static final int SELECTION_TYPE                        = 57;
	public static final int SEQUENCE                              = 58;
	public static final int SEQUENCEOF                            = 59;
	public static final int SET                                   = 60;
	public static final int SETOF                                 = 61;
	public static final int SYMBOL                                = 62;
	public static final int SYMBOLS_FROM_MODULE                   = 63;
	public static final int TAG                                   = 64;
	public static final int TAGGED_TYPE                           = 65;
	public static final int TAGGING_METHOD                        = 66;
	public static final int TAG_NUMBER                            = 67;
	public static final int TRUE                                  = 68;
	public static final int TYPE                                  = 69;
	public static final int TYPE_ASSIGNMENT                       = 70;
	public static final int TYPE_REFERENCE                        = 71;
	public static final int UNION                                 = 72;
	public static final int UNRESTRICTED_CSTRING                  = 73;
	public static final int VALUE                                 = 74;
	public static final int VALUE_ASSIGNMENT                      = 75;
	public static final int VALUE_ID                              = 76;
	public static final int VALUE_REFERENCE                       = 77;
	public static final int VEC                                   = 78;
	public static final int WS                                    = 79;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[]{};
	}

	public ASN1Lexer() {}

	public ASN1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public ASN1Lexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String getGrammarFileName() { return "/home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g"; }

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:6:7: ( '!' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:6:9: '!'
			{
				match('!');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:7:7: ( '(' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:7:9: '('
			{
				match('(');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:8:7: ( ')' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:8:9: ')'
			{
				match(')');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:9:7: ( ',' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:9:9: ','
			{
				match(',');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:10:7: ( '.' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:10:9: '.'
			{
				match('.');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:11:7: ( '..' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:11:9: '..'
			{
				match("..");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:12:7: ( '...' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:12:9: '...'
			{
				match("...");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:13:7: ( ':' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:13:9: ':'
			{
				match(':');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:14:7: ( '::=' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:14:9: '::='
			{
				match("::=");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:15:7: ( ';' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:15:9: ';'
			{
				match(';');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:16:7: ( '<' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:16:9: '<'
			{
				match('<');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:17:7: ( 'ABSENT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:17:9: 'ABSENT'
			{
				match("ABSENT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:18:7: ( 'ALL' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:18:9: 'ALL'
			{
				match("ALL");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:19:7: ( 'APPLICATION' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:19:9: 'APPLICATION'
			{
				match("APPLICATION");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:20:7: ( 'AUTOMATIC' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:20:9: 'AUTOMATIC'
			{
				match("AUTOMATIC");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:21:7: ( 'BEGIN' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:21:9: 'BEGIN'
			{
				match("BEGIN");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:22:7: ( 'BIT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:22:9: 'BIT'
			{
				match("BIT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:23:7: ( 'BMPString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:23:9: 'BMPString'
			{
				match("BMPString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:24:7: ( 'BOOLEAN' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:24:9: 'BOOLEAN'
			{
				match("BOOLEAN");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:25:7: ( 'CHARACTER' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:25:9: 'CHARACTER'
			{
				match("CHARACTER");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:26:8: ( 'CHOICE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:26:10: 'CHOICE'
			{
				match("CHOICE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:27:8: ( 'COMPONENT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:27:10: 'COMPONENT'
			{
				match("COMPONENT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:28:8: ( 'COMPONENTS' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:28:10: 'COMPONENTS'
			{
				match("COMPONENTS");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:29:8: ( 'DEFAULT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:29:10: 'DEFAULT'
			{
				match("DEFAULT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:30:8: ( 'DEFINITIONS' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:30:10: 'DEFINITIONS'
			{
				match("DEFINITIONS");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:31:8: ( 'END' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:31:10: 'END'
			{
				match("END");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:32:8: ( 'ENUMERATED' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:32:10: 'ENUMERATED'
			{
				match("ENUMERATED");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:33:8: ( 'EXCEPT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:33:10: 'EXCEPT'
			{
				match("EXCEPT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:34:8: ( 'EXPLICIT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:34:10: 'EXPLICIT'
			{
				match("EXPLICIT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:35:8: ( 'EXPORTS' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:35:10: 'EXPORTS'
			{
				match("EXPORTS");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:36:8: ( 'EXTENSIBILITY' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:36:10: 'EXTENSIBILITY'
			{
				match("EXTENSIBILITY");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:37:8: ( 'FALSE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:37:10: 'FALSE'
			{
				match("FALSE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:38:8: ( 'FROM' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:38:10: 'FROM'
			{
				match("FROM");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:39:8: ( 'GeneralString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:39:10: 'GeneralString'
			{
				match("GeneralString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:40:8: ( 'GraphicString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:40:10: 'GraphicString'
			{
				match("GraphicString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:41:8: ( 'IA5String' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:41:10: 'IA5String'
			{
				match("IA5String");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:42:8: ( 'IDENTIFIER' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:42:10: 'IDENTIFIER'
			{
				match("IDENTIFIER");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:43:8: ( 'IMPLICIT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:43:10: 'IMPLICIT'
			{
				match("IMPLICIT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:44:8: ( 'IMPLIED' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:44:10: 'IMPLIED'
			{
				match("IMPLIED");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:45:8: ( 'IMPORTS' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:45:10: 'IMPORTS'
			{
				match("IMPORTS");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__119"

	// $ANTLR start "T__120"
	public final void mT__120() throws RecognitionException {
		try {
			int _type = T__120;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:46:8: ( 'INCLUDES' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:46:10: 'INCLUDES'
			{
				match("INCLUDES");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__120"

	// $ANTLR start "T__121"
	public final void mT__121() throws RecognitionException {
		try {
			int _type = T__121;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:47:8: ( 'INTEGER' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:47:10: 'INTEGER'
			{
				match("INTEGER");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__121"

	// $ANTLR start "T__122"
	public final void mT__122() throws RecognitionException {
		try {
			int _type = T__122;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:48:8: ( 'INTERSECTION' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:48:10: 'INTERSECTION'
			{
				match("INTERSECTION");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__122"

	// $ANTLR start "T__123"
	public final void mT__123() throws RecognitionException {
		try {
			int _type = T__123;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:49:8: ( 'ISO646String' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:49:10: 'ISO646String'
			{
				match("ISO646String");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__123"

	// $ANTLR start "T__124"
	public final void mT__124() throws RecognitionException {
		try {
			int _type = T__124;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:50:8: ( 'MAX' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:50:10: 'MAX'
			{
				match("MAX");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__124"

	// $ANTLR start "T__125"
	public final void mT__125() throws RecognitionException {
		try {
			int _type = T__125;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:51:8: ( 'MIN' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:51:10: 'MIN'
			{
				match("MIN");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__125"

	// $ANTLR start "T__126"
	public final void mT__126() throws RecognitionException {
		try {
			int _type = T__126;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:52:8: ( 'MINUS-INFINITY' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:52:10: 'MINUS-INFINITY'
			{
				match("MINUS-INFINITY");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__126"

	// $ANTLR start "T__127"
	public final void mT__127() throws RecognitionException {
		try {
			int _type = T__127;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:53:8: ( 'NumericString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:53:10: 'NumericString'
			{
				match("NumericString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__127"

	// $ANTLR start "T__128"
	public final void mT__128() throws RecognitionException {
		try {
			int _type = T__128;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:54:8: ( 'OBJECT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:54:10: 'OBJECT'
			{
				match("OBJECT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__128"

	// $ANTLR start "T__129"
	public final void mT__129() throws RecognitionException {
		try {
			int _type = T__129;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:55:8: ( 'OCTET' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:55:10: 'OCTET'
			{
				match("OCTET");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__129"

	// $ANTLR start "T__130"
	public final void mT__130() throws RecognitionException {
		try {
			int _type = T__130;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:56:8: ( 'OF' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:56:10: 'OF'
			{
				match("OF");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__130"

	// $ANTLR start "T__131"
	public final void mT__131() throws RecognitionException {
		try {
			int _type = T__131;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:57:8: ( 'OID_VALUE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:57:10: 'OID_VALUE'
			{
				match("OID_VALUE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__131"

	// $ANTLR start "T__132"
	public final void mT__132() throws RecognitionException {
		try {
			int _type = T__132;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:58:8: ( 'OPTIONAL' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:58:10: 'OPTIONAL'
			{
				match("OPTIONAL");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__132"

	// $ANTLR start "T__133"
	public final void mT__133() throws RecognitionException {
		try {
			int _type = T__133;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:59:8: ( 'PATTERN' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:59:10: 'PATTERN'
			{
				match("PATTERN");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__133"

	// $ANTLR start "T__134"
	public final void mT__134() throws RecognitionException {
		try {
			int _type = T__134;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:60:8: ( 'PLUS-INFINITY' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:60:10: 'PLUS-INFINITY'
			{
				match("PLUS-INFINITY");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__134"

	// $ANTLR start "T__135"
	public final void mT__135() throws RecognitionException {
		try {
			int _type = T__135;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:61:8: ( 'PRESENT' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:61:10: 'PRESENT'
			{
				match("PRESENT");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__135"

	// $ANTLR start "T__136"
	public final void mT__136() throws RecognitionException {
		try {
			int _type = T__136;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:62:8: ( 'PRIVATE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:62:10: 'PRIVATE'
			{
				match("PRIVATE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__136"

	// $ANTLR start "T__137"
	public final void mT__137() throws RecognitionException {
		try {
			int _type = T__137;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:63:8: ( 'PrintableString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:63:10: 'PrintableString'
			{
				match("PrintableString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__137"

	// $ANTLR start "T__138"
	public final void mT__138() throws RecognitionException {
		try {
			int _type = T__138;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:64:8: ( 'REAL' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:64:10: 'REAL'
			{
				match("REAL");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__138"

	// $ANTLR start "T__139"
	public final void mT__139() throws RecognitionException {
		try {
			int _type = T__139;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:65:8: ( 'SEQUENCE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:65:10: 'SEQUENCE'
			{
				match("SEQUENCE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__139"

	// $ANTLR start "T__140"
	public final void mT__140() throws RecognitionException {
		try {
			int _type = T__140;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:66:8: ( 'SET' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:66:10: 'SET'
			{
				match("SET");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__140"

	// $ANTLR start "T__141"
	public final void mT__141() throws RecognitionException {
		try {
			int _type = T__141;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:67:8: ( 'SIZE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:67:10: 'SIZE'
			{
				match("SIZE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__141"

	// $ANTLR start "T__142"
	public final void mT__142() throws RecognitionException {
		try {
			int _type = T__142;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:68:8: ( 'STRING' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:68:10: 'STRING'
			{
				match("STRING");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__142"

	// $ANTLR start "T__143"
	public final void mT__143() throws RecognitionException {
		try {
			int _type = T__143;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:69:8: ( 'T61String' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:69:10: 'T61String'
			{
				match("T61String");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__143"

	// $ANTLR start "T__144"
	public final void mT__144() throws RecognitionException {
		try {
			int _type = T__144;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:70:8: ( 'TAGS' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:70:10: 'TAGS'
			{
				match("TAGS");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__144"

	// $ANTLR start "T__145"
	public final void mT__145() throws RecognitionException {
		try {
			int _type = T__145;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:71:8: ( 'TRUE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:71:10: 'TRUE'
			{
				match("TRUE");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__145"

	// $ANTLR start "T__146"
	public final void mT__146() throws RecognitionException {
		try {
			int _type = T__146;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:72:8: ( 'TeletexString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:72:10: 'TeletexString'
			{
				match("TeletexString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__146"

	// $ANTLR start "T__147"
	public final void mT__147() throws RecognitionException {
		try {
			int _type = T__147;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:73:8: ( 'UNION' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:73:10: 'UNION'
			{
				match("UNION");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__147"

	// $ANTLR start "T__148"
	public final void mT__148() throws RecognitionException {
		try {
			int _type = T__148;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:74:8: ( 'UNIVERSAL' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:74:10: 'UNIVERSAL'
			{
				match("UNIVERSAL");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__148"

	// $ANTLR start "T__149"
	public final void mT__149() throws RecognitionException {
		try {
			int _type = T__149;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:75:8: ( 'UTF8String' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:75:10: 'UTF8String'
			{
				match("UTF8String");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__149"

	// $ANTLR start "T__150"
	public final void mT__150() throws RecognitionException {
		try {
			int _type = T__150;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:76:8: ( 'UniversalString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:76:10: 'UniversalString'
			{
				match("UniversalString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__150"

	// $ANTLR start "T__151"
	public final void mT__151() throws RecognitionException {
		try {
			int _type = T__151;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:77:8: ( 'VideotexString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:77:10: 'VideotexString'
			{
				match("VideotexString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__151"

	// $ANTLR start "T__152"
	public final void mT__152() throws RecognitionException {
		try {
			int _type = T__152;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:78:8: ( 'VisibleString' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:78:10: 'VisibleString'
			{
				match("VisibleString");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__152"

	// $ANTLR start "T__153"
	public final void mT__153() throws RecognitionException {
		try {
			int _type = T__153;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:79:8: ( 'WITH' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:79:10: 'WITH'
			{
				match("WITH");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__153"

	// $ANTLR start "T__154"
	public final void mT__154() throws RecognitionException {
		try {
			int _type = T__154;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:80:8: ( '[' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:80:10: '['
			{
				match('[');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__154"

	// $ANTLR start "T__155"
	public final void mT__155() throws RecognitionException {
		try {
			int _type = T__155;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:81:8: ( '[[' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:81:10: '[['
			{
				match("[[");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__155"

	// $ANTLR start "T__156"
	public final void mT__156() throws RecognitionException {
		try {
			int _type = T__156;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:82:8: ( ']' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:82:10: ']'
			{
				match(']');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__156"

	// $ANTLR start "T__157"
	public final void mT__157() throws RecognitionException {
		try {
			int _type = T__157;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:83:8: ( ']]' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:83:10: ']]'
			{
				match("]]");
				if (state.failed) return;


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__157"

	// $ANTLR start "T__158"
	public final void mT__158() throws RecognitionException {
		try {
			int _type = T__158;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:84:8: ( '^' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:84:10: '^'
			{
				match('^');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__158"

	// $ANTLR start "T__159"
	public final void mT__159() throws RecognitionException {
		try {
			int _type = T__159;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:85:8: ( '{' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:85:10: '{'
			{
				match('{');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__159"

	// $ANTLR start "T__160"
	public final void mT__160() throws RecognitionException {
		try {
			int _type = T__160;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:86:8: ( '|' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:86:10: '|'
			{
				match('|');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__160"

	// $ANTLR start "T__161"
	public final void mT__161() throws RecognitionException {
		try {
			int _type = T__161;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:87:8: ( '}' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:87:10: '}'
			{
				match('}');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__161"

	// $ANTLR start "VALUE_ID"
	public final void mVALUE_ID() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:10: ( ( 'a' .. 'z' ) ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:12: ( 'a' .. 'z' ) ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
			{
				if ((input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:23: ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
				loop2:
				do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == '-' || (LA2_0 >= '0' && LA2_0 <= '9') || (LA2_0 >= 'A' && LA2_0 <= 'Z') || (LA2_0 >= 'a' && LA2_0 <= 'z'))) {
						alt2 = 1;
					}


					switch (alt2) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:24: ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:24: ( '-' )?
							int alt1 = 2;
							int LA1_0 = input.LA(1);

							if ((LA1_0 == '-')) {
								alt1 = 1;
							}
							switch (alt1) {
								case 1:
									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:24: '-'
								{
									match('-');
									if (state.failed) return;

								}
								break;

							}


							if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a'
							                                                                                                 && input.LA(1) <= 'z')) {
								input.consume();
								state.failed = false;
							} else {
								if (state.backtracking > 0) {
									state.failed = true;
									return;
								}
								MismatchedSetException mse = new MismatchedSetException(null, input);
								recover(mse);
								throw mse;
							}


						}
						break;

						default:
							break loop2;
					}
				} while (true);


			}


		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUE_ID"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:27: ( ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
				loop4:
				do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if ((LA4_0 == '-' || (LA4_0 >= '0' && LA4_0 <= '9') || (LA4_0 >= 'A' && LA4_0 <= 'Z') || (LA4_0 >= 'a' && LA4_0 <= 'z'))) {
						alt4 = 1;
					}


					switch (alt4) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:28: ( '-' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:28: ( '-' )?
							int alt3 = 2;
							int LA3_0 = input.LA(1);

							if ((LA3_0 == '-')) {
								alt3 = 1;
							}
							switch (alt3) {
								case 1:
									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:463:28: '-'
								{
									match('-');
									if (state.failed) return;

								}
								break;

							}


							if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a'
							                                                                                                 && input.LA(1) <= 'z')) {
								input.consume();
								state.failed = false;
							} else {
								if (state.backtracking > 0) {
									state.failed = true;
									return;
								}
								MismatchedSetException mse = new MismatchedSetException(null, input);
								recover(mse);
								throw mse;
							}


						}
						break;

						default:
							break loop4;
					}
				} while (true);


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:465:6: ( '0' | ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt7 = 2;
			int LA7_0 = input.LA(1);

			if ((LA7_0 == '0')) {
				alt7 = 1;
			} else if ((LA7_0 == '-' || (LA7_0 >= '1' && LA7_0 <= '9'))) {
				alt7 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);

				throw nvae;

			}
			switch (alt7) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:465:8: '0'
				{
					match('0');
					if (state.failed) return;

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:465:14: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:465:14: ( '-' )?
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == '-')) {
						alt5 = 1;
					}
					switch (alt5) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:465:14: '-'
						{
							match('-');
							if (state.failed) return;

						}
						break;

					}


					if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
						input.consume();
						state.failed = false;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return;
						}
						MismatchedSetException mse = new MismatchedSetException(null, input);
						recover(mse);
						throw mse;
					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:465:29: ( '0' .. '9' )*
					loop6:
					do {
						int alt6 = 2;
						int LA6_0 = input.LA(1);

						if (((LA6_0 >= '0' && LA6_0 <= '9'))) {
							alt6 = 1;
						}


						switch (alt6) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
							{
								if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
									input.consume();
									state.failed = false;
								} else {
									if (state.backtracking > 0) {
										state.failed = true;
										return;
									}
									MismatchedSetException mse = new MismatchedSetException(null, input);
									recover(mse);
									throw mse;
								}


							}
							break;

							default:
								break loop6;
						}
					} while (true);


				}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "REAL_NUMBER"
	public final void mREAL_NUMBER() throws RecognitionException {
		try {
			int _type = REAL_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:13: ( INT '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( ( '-' )=> '-' | '+' )? INT )? )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:15: INT '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( ( '-' )=> '-' | '+' )? INT )?
			{
				mINT();
				if (state.failed) return;


				match('.');
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:23: ( '0' .. '9' )+
				int cnt8 = 0;
				loop8:
				do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
						alt8 = 1;
					}


					switch (alt8) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
						{
							if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
								input.consume();
								state.failed = false;
							} else {
								if (state.backtracking > 0) {
									state.failed = true;
									return;
								}
								MismatchedSetException mse = new MismatchedSetException(null, input);
								recover(mse);
								throw mse;
							}


						}
						break;

						default:
							if (cnt8 >= 1) break loop8;
							if (state.backtracking > 0) {
								state.failed = true;
								return;
							}
							EarlyExitException eee =
							new EarlyExitException(8, input);
							throw eee;
					}
					cnt8++;
				} while (true);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:35: ( ( 'e' | 'E' ) ( ( '-' )=> '-' | '+' )? INT )?
				int alt10 = 2;
				int LA10_0 = input.LA(1);

				if ((LA10_0 == 'E' || LA10_0 == 'e')) {
					alt10 = 1;
				}
				switch (alt10) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:36: ( 'e' | 'E' ) ( ( '-' )=> '-' | '+' )? INT
					{
						if (input.LA(1) == 'E' || input.LA(1) == 'e') {
							input.consume();
							state.failed = false;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return;
							}
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}


						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:46: ( ( '-' )=> '-' | '+' )?
						int alt9 = 3;
						int LA9_0 = input.LA(1);

						if ((LA9_0 == '-')) {
							int LA9_1 = input.LA(2);

							if ((synpred1_ASN1())) {
								alt9 = 1;
							}
						} else if ((LA9_0 == '+')) {
							alt9 = 2;
						}
						switch (alt9) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:47: ( '-' )=> '-'
							{
								match('-');
								if (state.failed) return;

							}
							break;
							case 2:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:58: '+'
							{
								match('+');
								if (state.failed) return;

							}
							break;

						}


						mINT();
						if (state.failed) return;


					}
					break;

				}


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL_NUMBER"

	// $ANTLR start "CLASS_DEF"
	public final void mCLASS_DEF() throws RecognitionException {
		try {
			int _type = CLASS_DEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:468:11: ( '--' '#' ( options {greedy=false; } : . )* '\\n' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:468:13: '--' '#' ( options {greedy=false; } : . )* '\\n'
			{
				match("--");
				if (state.failed) return;


				match('#');
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:468:22: ( options {greedy=false; } : . )*
				loop11:
				do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == '\n')) {
						alt11 = 2;
					} else if (((LA11_0 >= '\u0000' && LA11_0 <= '\t') || (LA11_0 >= '\u000B' && LA11_0 <= '\uFFFF'))) {
						alt11 = 1;
					}


					switch (alt11) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:468:53: .
						{
							matchAny();
							if (state.failed) return;

						}
						break;

						default:
							break loop11;
					}
				} while (true);


				match('\n');
				if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS_DEF"

	// $ANTLR start "COMMENT_LINE"
	public final void mCOMMENT_LINE() throws RecognitionException {
		try {
			int _type = COMMENT_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:469:14: ( '--' ( options {greedy=false; } : . )* '\\n' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:469:16: '--' ( options {greedy=false; } : . )* '\\n'
			{
				match("--");
				if (state.failed) return;


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:469:21: ( options {greedy=false; } : . )*
				loop12:
				do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if ((LA12_0 == '\n')) {
						alt12 = 2;
					} else if (((LA12_0 >= '\u0000' && LA12_0 <= '\t') || (LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF'))) {
						alt12 = 1;
					}


					switch (alt12) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:469:52: .
						{
							matchAny();
							if (state.failed) return;

						}
						break;

						default:
							break loop12;
					}
				} while (true);


				match('\n');
				if (state.failed) return;

				if (state.backtracking == 0) { _channel = HIDDEN; }

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT_LINE"

	// $ANTLR start "ML_COMMENT"
	public final void mML_COMMENT() throws RecognitionException {
		try {
			int _type = ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:470:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:470:14: '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");
				if (state.failed) return;


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:470:19: ( options {greedy=false; } : . )*
				loop13:
				do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if ((LA13_0 == '*')) {
						int LA13_1 = input.LA(2);

						if ((LA13_1 == '/')) {
							alt13 = 2;
						} else if (((LA13_1 >= '\u0000' && LA13_1 <= '.') || (LA13_1 >= '0' && LA13_1 <= '\uFFFF'))) {
							alt13 = 1;
						}


					} else if (((LA13_0 >= '\u0000' && LA13_0 <= ')') || (LA13_0 >= '+' && LA13_0 <= '\uFFFF'))) {
						alt13 = 1;
					}


					switch (alt13) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:470:46: .
						{
							matchAny();
							if (state.failed) return;

						}
						break;

						default:
							break loop13;
					}
				} while (true);


				match("*/");
				if (state.failed) return;


				if (state.backtracking == 0) {_channel = HIDDEN;}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:471:5: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:471:7: ( ' ' | '\\t' | '\\n' | '\\r' )
			{
				if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
					input.consume();
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}


				if (state.backtracking == 0) {_channel = HIDDEN;}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	public void mTokens() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:8: ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | ID | INT | REAL_NUMBER | CLASS_DEF | COMMENT_LINE | ML_COMMENT | WS )
		int alt14 = 89;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:10: T__80
			{
				mT__80();
				if (state.failed) return;


			}
			break;
			case 2:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:16: T__81
			{
				mT__81();
				if (state.failed) return;


			}
			break;
			case 3:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:22: T__82
			{
				mT__82();
				if (state.failed) return;


			}
			break;
			case 4:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:28: T__83
			{
				mT__83();
				if (state.failed) return;


			}
			break;
			case 5:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:34: T__84
			{
				mT__84();
				if (state.failed) return;


			}
			break;
			case 6:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:40: T__85
			{
				mT__85();
				if (state.failed) return;


			}
			break;
			case 7:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:46: T__86
			{
				mT__86();
				if (state.failed) return;


			}
			break;
			case 8:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:52: T__87
			{
				mT__87();
				if (state.failed) return;


			}
			break;
			case 9:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:58: T__88
			{
				mT__88();
				if (state.failed) return;


			}
			break;
			case 10:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:64: T__89
			{
				mT__89();
				if (state.failed) return;


			}
			break;
			case 11:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:70: T__90
			{
				mT__90();
				if (state.failed) return;


			}
			break;
			case 12:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:76: T__91
			{
				mT__91();
				if (state.failed) return;


			}
			break;
			case 13:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:82: T__92
			{
				mT__92();
				if (state.failed) return;


			}
			break;
			case 14:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:88: T__93
			{
				mT__93();
				if (state.failed) return;


			}
			break;
			case 15:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:94: T__94
			{
				mT__94();
				if (state.failed) return;


			}
			break;
			case 16:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:100: T__95
			{
				mT__95();
				if (state.failed) return;


			}
			break;
			case 17:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:106: T__96
			{
				mT__96();
				if (state.failed) return;


			}
			break;
			case 18:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:112: T__97
			{
				mT__97();
				if (state.failed) return;


			}
			break;
			case 19:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:118: T__98
			{
				mT__98();
				if (state.failed) return;


			}
			break;
			case 20:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:124: T__99
			{
				mT__99();
				if (state.failed) return;


			}
			break;
			case 21:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:130: T__100
			{
				mT__100();
				if (state.failed) return;


			}
			break;
			case 22:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:137: T__101
			{
				mT__101();
				if (state.failed) return;


			}
			break;
			case 23:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:144: T__102
			{
				mT__102();
				if (state.failed) return;


			}
			break;
			case 24:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:151: T__103
			{
				mT__103();
				if (state.failed) return;


			}
			break;
			case 25:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:158: T__104
			{
				mT__104();
				if (state.failed) return;


			}
			break;
			case 26:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:165: T__105
			{
				mT__105();
				if (state.failed) return;


			}
			break;
			case 27:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:172: T__106
			{
				mT__106();
				if (state.failed) return;


			}
			break;
			case 28:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:179: T__107
			{
				mT__107();
				if (state.failed) return;


			}
			break;
			case 29:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:186: T__108
			{
				mT__108();
				if (state.failed) return;


			}
			break;
			case 30:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:193: T__109
			{
				mT__109();
				if (state.failed) return;


			}
			break;
			case 31:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:200: T__110
			{
				mT__110();
				if (state.failed) return;


			}
			break;
			case 32:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:207: T__111
			{
				mT__111();
				if (state.failed) return;


			}
			break;
			case 33:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:214: T__112
			{
				mT__112();
				if (state.failed) return;


			}
			break;
			case 34:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:221: T__113
			{
				mT__113();
				if (state.failed) return;


			}
			break;
			case 35:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:228: T__114
			{
				mT__114();
				if (state.failed) return;


			}
			break;
			case 36:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:235: T__115
			{
				mT__115();
				if (state.failed) return;


			}
			break;
			case 37:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:242: T__116
			{
				mT__116();
				if (state.failed) return;


			}
			break;
			case 38:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:249: T__117
			{
				mT__117();
				if (state.failed) return;


			}
			break;
			case 39:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:256: T__118
			{
				mT__118();
				if (state.failed) return;


			}
			break;
			case 40:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:263: T__119
			{
				mT__119();
				if (state.failed) return;


			}
			break;
			case 41:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:270: T__120
			{
				mT__120();
				if (state.failed) return;


			}
			break;
			case 42:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:277: T__121
			{
				mT__121();
				if (state.failed) return;


			}
			break;
			case 43:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:284: T__122
			{
				mT__122();
				if (state.failed) return;


			}
			break;
			case 44:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:291: T__123
			{
				mT__123();
				if (state.failed) return;


			}
			break;
			case 45:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:298: T__124
			{
				mT__124();
				if (state.failed) return;


			}
			break;
			case 46:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:305: T__125
			{
				mT__125();
				if (state.failed) return;


			}
			break;
			case 47:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:312: T__126
			{
				mT__126();
				if (state.failed) return;


			}
			break;
			case 48:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:319: T__127
			{
				mT__127();
				if (state.failed) return;


			}
			break;
			case 49:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:326: T__128
			{
				mT__128();
				if (state.failed) return;


			}
			break;
			case 50:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:333: T__129
			{
				mT__129();
				if (state.failed) return;


			}
			break;
			case 51:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:340: T__130
			{
				mT__130();
				if (state.failed) return;


			}
			break;
			case 52:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:347: T__131
			{
				mT__131();
				if (state.failed) return;


			}
			break;
			case 53:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:354: T__132
			{
				mT__132();
				if (state.failed) return;


			}
			break;
			case 54:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:361: T__133
			{
				mT__133();
				if (state.failed) return;


			}
			break;
			case 55:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:368: T__134
			{
				mT__134();
				if (state.failed) return;


			}
			break;
			case 56:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:375: T__135
			{
				mT__135();
				if (state.failed) return;


			}
			break;
			case 57:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:382: T__136
			{
				mT__136();
				if (state.failed) return;


			}
			break;
			case 58:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:389: T__137
			{
				mT__137();
				if (state.failed) return;


			}
			break;
			case 59:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:396: T__138
			{
				mT__138();
				if (state.failed) return;


			}
			break;
			case 60:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:403: T__139
			{
				mT__139();
				if (state.failed) return;


			}
			break;
			case 61:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:410: T__140
			{
				mT__140();
				if (state.failed) return;


			}
			break;
			case 62:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:417: T__141
			{
				mT__141();
				if (state.failed) return;


			}
			break;
			case 63:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:424: T__142
			{
				mT__142();
				if (state.failed) return;


			}
			break;
			case 64:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:431: T__143
			{
				mT__143();
				if (state.failed) return;


			}
			break;
			case 65:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:438: T__144
			{
				mT__144();
				if (state.failed) return;


			}
			break;
			case 66:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:445: T__145
			{
				mT__145();
				if (state.failed) return;


			}
			break;
			case 67:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:452: T__146
			{
				mT__146();
				if (state.failed) return;


			}
			break;
			case 68:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:459: T__147
			{
				mT__147();
				if (state.failed) return;


			}
			break;
			case 69:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:466: T__148
			{
				mT__148();
				if (state.failed) return;


			}
			break;
			case 70:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:473: T__149
			{
				mT__149();
				if (state.failed) return;


			}
			break;
			case 71:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:480: T__150
			{
				mT__150();
				if (state.failed) return;


			}
			break;
			case 72:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:487: T__151
			{
				mT__151();
				if (state.failed) return;


			}
			break;
			case 73:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:494: T__152
			{
				mT__152();
				if (state.failed) return;


			}
			break;
			case 74:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:501: T__153
			{
				mT__153();
				if (state.failed) return;


			}
			break;
			case 75:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:508: T__154
			{
				mT__154();
				if (state.failed) return;


			}
			break;
			case 76:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:515: T__155
			{
				mT__155();
				if (state.failed) return;


			}
			break;
			case 77:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:522: T__156
			{
				mT__156();
				if (state.failed) return;


			}
			break;
			case 78:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:529: T__157
			{
				mT__157();
				if (state.failed) return;


			}
			break;
			case 79:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:536: T__158
			{
				mT__158();
				if (state.failed) return;


			}
			break;
			case 80:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:543: T__159
			{
				mT__159();
				if (state.failed) return;


			}
			break;
			case 81:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:550: T__160
			{
				mT__160();
				if (state.failed) return;


			}
			break;
			case 82:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:557: T__161
			{
				mT__161();
				if (state.failed) return;


			}
			break;
			case 83:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:564: ID
			{
				mID();
				if (state.failed) return;


			}
			break;
			case 84:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:567: INT
			{
				mINT();
				if (state.failed) return;


			}
			break;
			case 85:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:571: REAL_NUMBER
			{
				mREAL_NUMBER();
				if (state.failed) return;


			}
			break;
			case 86:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:583: CLASS_DEF
			{
				mCLASS_DEF();
				if (state.failed) return;


			}
			break;
			case 87:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:593: COMMENT_LINE
			{
				mCOMMENT_LINE();
				if (state.failed) return;


			}
			break;
			case 88:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:606: ML_COMMENT
			{
				mML_COMMENT();
				if (state.failed) return;


			}
			break;
			case 89:
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:1:617: WS
			{
				mWS();
				if (state.failed) return;


			}
			break;

		}

	}

	// $ANTLR start synpred1_ASN1
	public final void synpred1_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:47: ( '-' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:466:48: '-'
		{
			match('-');
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_ASN1

	public final boolean synpred1_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}


	protected    DFA14    dfa14             = new DFA14(this);
	static final String   DFA14_eotS        =
	"\5\uffff\1\50\1\52\2\uffff\22\41\1\133\1\135\5\uffff\1\136\1\uffff" +
	"\1\136\2\uffff\1\143\3\uffff\33\41\1\u0084\23\41\7\uffff\1\136\2" +
	"\uffff\1\41\1\u009e\3\41\1\u00a2\6\41\1\u00aa\16\41\1\u00bb\1\u00bd" +
	"\3\41\1\uffff\11\41\1\u00ca\14\41\2\uffff\1\41\1\uffff\3\41\1\uffff" +
	"\7\41\1\uffff\6\41\1\u00eb\11\41\1\uffff\1\41\1\uffff\3\41\1\uffff" +
	"\6\41\1\u0100\1\41\1\uffff\1\u0102\2\41\1\u0105\1\u0106\7\41\1\u010e" +
	"\1\u010f\1\uffff\3\41\1\u0113\14\41\1\u0120\1\uffff\15\41\1\u012f" +
	"\2\41\1\uffff\3\41\1\uffff\1\41\1\uffff\2\41\2\uffff\1\41\1\u013a" +
	"\5\41\2\uffff\1\u0140\2\41\1\uffff\3\41\1\u0146\4\41\1\u014b\3\41" +
	"\1\uffff\13\41\1\uffff\1\41\1\u015c\1\uffff\7\41\1\u0164\2\41\1" +
	"\uffff\5\41\1\uffff\3\41\1\u016f\1\41\1\uffff\1\41\1\u0172\2\41" +
	"\1\uffff\1\41\1\u0176\6\41\1\u017d\1\u017e\1\41\1\u0180\4\41\1\uffff" +
	"\1\41\1\u0186\1\41\1\u0188\1\u0189\2\41\1\uffff\12\41\1\uffff\2" +
	"\41\1\uffff\2\41\1\u019a\1\uffff\5\41\1\u01a0\2\uffff\1\u01a1\1" +
	"\uffff\4\41\1\u01a6\1\uffff\1\41\2\uffff\1\41\1\u01a9\10\41\1\u01b2" +
	"\1\u01b3\1\u01b4\1\u01b6\2\41\1\uffff\3\41\1\u01bc\1\41\2\uffff" +
	"\4\41\1\uffff\2\41\1\uffff\1\u01c4\1\41\1\u01c6\5\41\3\uffff\1\u01cc" +
	"\1\uffff\1\41\1\u01ce\3\41\1\uffff\1\u01d2\6\41\1\uffff\1\41\1\uffff" +
	"\1\u01da\3\41\1\u01de\1\uffff\1\u01df\1\uffff\3\41\1\uffff\7\41" +
	"\1\uffff\3\41\2\uffff\3\41\1\u01f0\1\u01f1\10\41\1\u01fa\1\u01fb" +
	"\1\u01fc\2\uffff\1\41\1\u01fe\1\u01ff\1\41\1\u0201\2\41\1\u0204" +
	"\3\uffff\1\u0205\2\uffff\1\41\1\uffff\1\41\1\u0208\2\uffff\1\u0209" +
	"\1\u020a\3\uffff";
	static final String   DFA14_eofS        =
	"\u020b\uffff";
	static final String   DFA14_minS        =
	"\1\11\4\uffff\1\56\1\72\2\uffff\1\102\1\105\1\110\1\105\1\116\1" +
	"\101\1\145\2\101\1\165\1\102\1\101\2\105\1\66\1\116\1\151\1\111" +
	"\1\133\1\135\5\uffff\1\56\1\55\1\56\2\uffff\1\56\3\uffff\1\123\1" +
	"\114\1\120\1\124\1\107\1\124\1\120\1\117\1\101\1\115\1\106\1\104" +
	"\1\103\1\114\1\117\1\156\1\141\1\65\1\105\1\120\1\103\1\117\1\130" +
	"\1\116\1\155\1\112\1\124\1\55\1\104\2\124\1\125\1\105\1\151\1\101" +
	"\1\121\1\132\1\122\1\61\1\107\1\125\1\154\1\111\1\106\1\151\1\144" +
	"\1\124\6\uffff\1\0\1\56\2\uffff\1\105\1\55\1\114\1\117\1\111\1\55" +
	"\1\123\1\114\1\122\1\111\1\120\1\101\1\55\1\115\1\105\1\114\1\105" +
	"\1\123\1\115\1\145\1\160\1\123\1\116\2\114\1\105\1\66\2\55\1\145" +
	"\2\105\1\uffff\1\137\1\111\1\124\2\123\1\126\1\156\1\114\1\125\1" +
	"\55\1\105\1\111\2\123\1\105\1\145\1\117\1\70\1\166\1\145\1\151\1" +
	"\110\1\0\1\uffff\1\116\1\uffff\1\111\1\115\1\116\1\uffff\1\164\1" +
	"\105\1\101\1\103\1\117\1\125\1\116\1\uffff\1\105\1\120\1\111\1\122" +
	"\1\116\1\105\1\55\1\162\1\150\1\164\1\124\1\111\1\122\1\125\1\107" +
	"\1\64\1\uffff\1\123\1\uffff\1\162\1\103\1\124\1\uffff\1\117\1\105" +
	"\1\55\1\105\1\101\1\164\1\55\1\105\1\uffff\1\55\1\116\1\164\2\55" +
	"\1\164\1\116\1\105\1\123\1\145\1\157\1\142\1\55\2\0\1\124\1\103" +
	"\1\101\1\55\1\162\1\101\1\103\1\105\1\116\1\114\1\111\1\122\1\124" +
	"\1\103\1\124\1\123\1\55\1\uffff\1\141\1\151\1\162\1\111\1\103\1" +
	"\124\1\104\1\105\1\123\1\66\1\55\1\151\1\124\1\55\1\116\1\122\1" +
	"\60\1\116\1\124\1\141\1\uffff\1\116\1\uffff\1\107\1\162\2\uffff" +
	"\1\145\1\55\1\122\1\164\1\162\1\164\1\154\2\uffff\1\55\1\101\1\124" +
	"\1\uffff\1\151\1\116\1\124\1\55\1\105\2\124\1\101\1\55\1\111\1\123" +
	"\1\111\1\uffff\1\154\1\143\1\151\1\106\1\111\1\104\1\123\1\105\1" +
	"\122\1\105\1\123\1\60\1\143\1\55\1\uffff\1\101\2\116\1\124\1\105" +
	"\1\142\1\103\1\55\1\151\1\170\1\uffff\1\123\1\162\1\163\2\145\1" +
	"\uffff\1\124\1\111\1\156\1\55\1\105\1\uffff\1\116\1\55\1\111\1\124" +
	"\1\uffff\1\124\1\55\1\102\2\123\1\156\1\111\1\124\2\55\1\123\1\55" +
	"\1\103\1\164\1\116\1\123\1\uffff\1\114\1\55\1\106\2\55\1\154\1\105" +
	"\1\uffff\1\156\1\123\1\101\1\151\1\141\1\170\1\123\1\111\1\103\1" +
	"\147\1\uffff\1\122\1\124\1\uffff\1\117\1\105\1\55\1\uffff\1\111" +
	"\2\164\1\147\1\105\1\55\2\uffff\1\55\1\uffff\1\124\1\162\1\106\1" +
	"\164\1\55\1\uffff\1\111\2\uffff\1\145\1\55\1\147\1\164\1\114\1\156" +
	"\1\154\1\123\1\164\1\117\4\55\1\116\1\104\1\uffff\1\114\2\162\1" +
	"\55\1\122\2\uffff\1\111\1\151\1\111\1\162\1\uffff\1\116\1\123\1" +
	"\uffff\1\55\1\162\1\55\1\147\1\123\1\164\1\162\1\116\3\uffff\1\55" +
	"\1\uffff\1\123\1\55\1\111\2\151\1\uffff\1\55\1\117\1\156\1\116\1" +
	"\151\1\111\1\164\1\uffff\1\151\1\uffff\1\55\1\164\1\162\1\151\1" +
	"\55\1\uffff\1\55\1\uffff\1\124\2\156\1\uffff\1\116\1\147\1\111\1" +
	"\156\1\124\1\162\1\156\1\uffff\1\162\1\151\1\156\2\uffff\1\131\2" +
	"\147\2\55\1\124\1\147\1\131\1\151\1\147\1\151\1\156\1\147\3\55\2" +
	"\uffff\1\131\2\55\1\156\1\55\1\156\1\147\1\55\3\uffff\1\55\2\uffff" +
	"\1\147\1\uffff\1\147\1\55\2\uffff\2\55\3\uffff";
	static final String   DFA14_maxS        =
	"\1\175\4\uffff\1\56\1\72\2\uffff\1\125\2\117\1\105\1\130\1\122\1" +
	"\162\1\123\1\111\1\165\1\120\1\162\1\105\1\124\1\145\1\156\1\151" +
	"\1\111\1\133\1\135\5\uffff\1\56\2\71\2\uffff\1\56\3\uffff\1\123" +
	"\1\114\1\120\1\124\1\107\1\124\1\120\2\117\1\115\1\106\1\125\1\124" +
	"\1\114\1\117\1\156\1\141\1\65\1\105\1\120\1\124\1\117\1\130\1\116" +
	"\1\155\1\112\1\124\1\172\1\104\2\124\1\125\1\111\1\151\1\101\1\124" +
	"\1\132\1\122\1\61\1\107\1\125\1\154\1\111\1\106\1\151\1\163\1\124" +
	"\6\uffff\1\uffff\1\71\2\uffff\1\105\1\172\1\114\1\117\1\111\1\172" +
	"\1\123\1\114\1\122\1\111\1\120\1\111\1\172\1\115\1\105\1\117\1\105" +
	"\1\123\1\115\1\145\1\160\1\123\1\116\1\117\1\114\1\105\1\66\2\172" +
	"\1\145\2\105\1\uffff\1\137\1\111\1\124\2\123\1\126\1\156\1\114\1" +
	"\125\1\172\1\105\1\111\2\123\1\105\1\145\1\126\1\70\1\166\1\145" +
	"\1\151\1\110\1\uffff\1\uffff\1\116\1\uffff\1\111\1\115\1\116\1\uffff" +
	"\1\164\1\105\1\101\1\103\1\117\1\125\1\116\1\uffff\1\105\1\120\1" +
	"\111\1\122\1\116\1\105\1\172\1\162\1\150\1\164\1\124\1\111\1\122" +
	"\1\125\1\122\1\64\1\uffff\1\123\1\uffff\1\162\1\103\1\124\1\uffff" +
	"\1\117\1\105\1\55\1\105\1\101\1\164\1\172\1\105\1\uffff\1\172\1" +
	"\116\1\164\2\172\1\164\1\116\1\105\1\123\1\145\1\157\1\142\1\172" +
	"\2\uffff\1\124\1\103\1\101\1\172\1\162\1\101\1\103\1\105\1\116\1" +
	"\114\1\111\1\122\1\124\1\103\1\124\1\123\1\172\1\uffff\1\141\1\151" +
	"\1\162\1\111\1\105\1\124\1\104\1\105\1\123\1\66\1\55\1\151\1\124" +
	"\1\172\1\116\1\122\1\172\1\116\1\124\1\141\1\uffff\1\116\1\uffff" +
	"\1\107\1\162\2\uffff\1\145\1\172\1\122\1\164\1\162\1\164\1\154\2" +
	"\uffff\1\172\1\101\1\124\1\uffff\1\151\1\116\1\124\1\172\1\105\2" +
	"\124\1\101\1\172\1\111\1\123\1\111\1\uffff\1\154\1\143\1\151\1\106" +
	"\1\111\1\104\1\123\1\105\1\122\1\105\1\123\1\172\1\143\1\172\1\uffff" +
	"\1\101\2\116\1\124\1\105\1\142\1\103\1\172\1\151\1\170\1\uffff\1" +
	"\123\1\162\1\163\2\145\1\uffff\1\124\1\111\1\156\1\172\1\105\1\uffff" +
	"\1\116\1\172\1\111\1\124\1\uffff\1\124\1\172\1\102\2\123\1\156\1" +
	"\111\1\124\2\172\1\123\1\172\1\103\1\164\1\116\1\123\1\uffff\1\114" +
	"\1\172\1\106\2\172\1\154\1\105\1\uffff\1\156\1\123\1\101\1\151\1" +
	"\141\1\170\1\123\1\111\1\103\1\147\1\uffff\1\122\1\124\1\uffff\1" +
	"\117\1\105\1\172\1\uffff\1\111\2\164\1\147\1\105\1\172\2\uffff\1" +
	"\172\1\uffff\1\124\1\162\1\106\1\164\1\172\1\uffff\1\111\2\uffff" +
	"\1\145\1\172\1\147\1\164\1\114\1\156\1\154\1\123\1\164\1\117\4\172" +
	"\1\116\1\104\1\uffff\1\114\2\162\1\172\1\122\2\uffff\1\111\1\151" +
	"\1\111\1\162\1\uffff\1\116\1\123\1\uffff\1\172\1\162\1\172\1\147" +
	"\1\123\1\164\1\162\1\116\3\uffff\1\172\1\uffff\1\123\1\172\1\111" +
	"\2\151\1\uffff\1\172\1\117\1\156\1\116\1\151\1\111\1\164\1\uffff" +
	"\1\151\1\uffff\1\172\1\164\1\162\1\151\1\172\1\uffff\1\172\1\uffff" +
	"\1\124\2\156\1\uffff\1\116\1\147\1\111\1\156\1\124\1\162\1\156\1" +
	"\uffff\1\162\1\151\1\156\2\uffff\1\131\2\147\2\172\1\124\1\147\1" +
	"\131\1\151\1\147\1\151\1\156\1\147\3\172\2\uffff\1\131\2\172\1\156" +
	"\1\172\1\156\1\147\1\172\3\uffff\1\172\2\uffff\1\147\1\uffff\1\147" +
	"\1\172\2\uffff\2\172\3\uffff";
	static final String   DFA14_acceptS     =
	"\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\12\1\13\24\uffff\1\117\1\120" +
	"\1\121\1\122\1\123\3\uffff\1\130\1\131\1\uffff\1\5\1\11\1\10\57" +
	"\uffff\1\114\1\113\1\116\1\115\1\124\1\125\2\uffff\1\7\1\6\40\uffff" +
	"\1\63\27\uffff\1\127\1\uffff\1\15\3\uffff\1\21\7\uffff\1\32\20\uffff" +
	"\1\55\1\uffff\1\56\3\uffff\1\64\10\uffff\1\75\40\uffff\1\41\24\uffff" +
	"\1\73\1\uffff\1\76\2\uffff\1\101\1\102\7\uffff\1\112\1\126\3\uffff" +
	"\1\20\14\uffff\1\40\16\uffff\1\62\12\uffff\1\104\5\uffff\1\14\5" +
	"\uffff\1\25\4\uffff\1\34\20\uffff\1\61\7\uffff\1\77\12\uffff\1\23" +
	"\2\uffff\1\30\3\uffff\1\36\6\uffff\1\47\1\50\1\uffff\1\52\5\uffff" +
	"\1\66\1\uffff\1\70\1\71\20\uffff\1\35\5\uffff\1\46\1\51\4\uffff" +
	"\1\65\2\uffff\1\74\10\uffff\1\17\1\22\1\24\1\uffff\1\26\5\uffff" +
	"\1\44\7\uffff\1\100\1\uffff\1\105\5\uffff\1\27\1\uffff\1\33\3\uffff" +
	"\1\45\7\uffff\1\106\3\uffff\1\16\1\31\20\uffff\1\53\1\54\10\uffff" +
	"\1\37\1\42\1\43\1\uffff\1\60\1\67\1\uffff\1\103\2\uffff\1\111\1" +
	"\57\2\uffff\1\110\1\72\1\107";
	static final String   DFA14_specialS    =
	"\140\uffff\1\0\72\uffff\1\2\74\uffff\1\1\1\3\u0131\uffff}>";
	static final String[] DFA14_transitionS = {
	                                          "\2\46\2\uffff\1\46\22\uffff\1\46\1\1\6\uffff\1\2\1\3\2\uffff" +
	                                          "\1\4\1\43\1\5\1\45\1\42\11\44\1\6\1\7\1\10\4\uffff\1\11\1\12" +
	                                          "\1\13\1\14\1\15\1\16\1\17\1\41\1\20\3\41\1\21\1\22\1\23\1\24" +
	                                          "\1\41\1\25\1\26\1\27\1\30\1\31\1\32\3\41\1\33\1\uffff\1\34\1" +
	                                          "\35\2\uffff\32\41\1\36\1\37\1\40",
	                                          "",
	                                          "",
	                                          "",
	                                          "",
	                                          "\1\47",
	                                          "\1\51",
	                                          "",
	                                          "",
	                                          "\1\53\11\uffff\1\54\3\uffff\1\55\4\uffff\1\56",
	                                          "\1\57\3\uffff\1\60\3\uffff\1\61\1\uffff\1\62",
	                                          "\1\63\6\uffff\1\64",
	                                          "\1\65",
	                                          "\1\66\11\uffff\1\67",
	                                          "\1\70\20\uffff\1\71",
	                                          "\1\72\14\uffff\1\73",
	                                          "\1\74\2\uffff\1\75\10\uffff\1\76\1\77\4\uffff\1\100",
	                                          "\1\101\7\uffff\1\102",
	                                          "\1\103",
	                                          "\1\104\1\105\2\uffff\1\106\2\uffff\1\107\6\uffff\1\110",
	                                          "\1\111\12\uffff\1\112\5\uffff\1\113\37\uffff\1\114",
	                                          "\1\115",
	                                          "\1\116\3\uffff\1\117\12\uffff\1\120",
	                                          "\1\121\12\uffff\1\122\20\uffff\1\123\22\uffff\1\124",
	                                          "\1\125\5\uffff\1\126\31\uffff\1\127",
	                                          "\1\130",
	                                          "\1\131",
	                                          "\1\132",
	                                          "\1\134",
	                                          "",
	                                          "",
	                                          "",
	                                          "",
	                                          "",
	                                          "\1\137",
	                                          "\1\140\3\uffff\11\44",
	                                          "\1\137\1\uffff\12\141",
	                                          "",
	                                          "",
	                                          "\1\142",
	                                          "",
	                                          "",
	                                          "",
	                                          "\1\144",
	                                          "\1\145",
	                                          "\1\146",
	                                          "\1\147",
	                                          "\1\150",
	                                          "\1\151",
	                                          "\1\152",
	                                          "\1\153",
	                                          "\1\154\15\uffff\1\155",
	                                          "\1\156",
	                                          "\1\157",
	                                          "\1\160\20\uffff\1\161",
	                                          "\1\162\14\uffff\1\163\3\uffff\1\164",
	                                          "\1\165",
	                                          "\1\166",
	                                          "\1\167",
	                                          "\1\170",
	                                          "\1\171",
	                                          "\1\172",
	                                          "\1\173",
	                                          "\1\174\20\uffff\1\175",
	                                          "\1\176",
	                                          "\1\177",
	                                          "\1\u0080",
	                                          "\1\u0081",
	                                          "\1\u0082",
	                                          "\1\u0083",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0085",
	                                          "\1\u0086",
	                                          "\1\u0087",
	                                          "\1\u0088",
	                                          "\1\u0089\3\uffff\1\u008a",
	                                          "\1\u008b",
	                                          "\1\u008c",
	                                          "\1\u008d\2\uffff\1\u008e",
	                                          "\1\u008f",
	                                          "\1\u0090",
	                                          "\1\u0091",
	                                          "\1\u0092",
	                                          "\1\u0093",
	                                          "\1\u0094",
	                                          "\1\u0095",
	                                          "\1\u0096",
	                                          "\1\u0097",
	                                          "\1\u0098\16\uffff\1\u0099",
	                                          "\1\u009a",
	                                          "",
	                                          "",
	                                          "",
	                                          "",
	                                          "",
	                                          "",
	                                          "\43\u009c\1\u009b\uffdc\u009c",
	                                          "\1\137\1\uffff\12\141",
	                                          "",
	                                          "",
	                                          "\1\u009d",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u009f",
	                                          "\1\u00a0",
	                                          "\1\u00a1",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u00a3",
	                                          "\1\u00a4",
	                                          "\1\u00a5",
	                                          "\1\u00a6",
	                                          "\1\u00a7",
	                                          "\1\u00a8\7\uffff\1\u00a9",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u00ab",
	                                          "\1\u00ac",
	                                          "\1\u00ad\2\uffff\1\u00ae",
	                                          "\1\u00af",
	                                          "\1\u00b0",
	                                          "\1\u00b1",
	                                          "\1\u00b2",
	                                          "\1\u00b3",
	                                          "\1\u00b4",
	                                          "\1\u00b5",
	                                          "\1\u00b6\2\uffff\1\u00b7",
	                                          "\1\u00b8",
	                                          "\1\u00b9",
	                                          "\1\u00ba",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\24\41\1\u00bc\5\41\6\uffff\32\41",
	                                          "\1\u00be",
	                                          "\1\u00bf",
	                                          "\1\u00c0",
	                                          "",
	                                          "\1\u00c1",
	                                          "\1\u00c2",
	                                          "\1\u00c3",
	                                          "\1\u00c4",
	                                          "\1\u00c5",
	                                          "\1\u00c6",
	                                          "\1\u00c7",
	                                          "\1\u00c8",
	                                          "\1\u00c9",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u00cb",
	                                          "\1\u00cc",
	                                          "\1\u00cd",
	                                          "\1\u00ce",
	                                          "\1\u00cf",
	                                          "\1\u00d0",
	                                          "\1\u00d1\6\uffff\1\u00d2",
	                                          "\1\u00d3",
	                                          "\1\u00d4",
	                                          "\1\u00d5",
	                                          "\1\u00d6",
	                                          "\1\u00d7",
	                                          "\12\u00d9\1\u00d8\ufff5\u00d9",
	                                          "",
	                                          "\1\u00da",
	                                          "",
	                                          "\1\u00db",
	                                          "\1\u00dc",
	                                          "\1\u00dd",
	                                          "",
	                                          "\1\u00de",
	                                          "\1\u00df",
	                                          "\1\u00e0",
	                                          "\1\u00e1",
	                                          "\1\u00e2",
	                                          "\1\u00e3",
	                                          "\1\u00e4",
	                                          "",
	                                          "\1\u00e5",
	                                          "\1\u00e6",
	                                          "\1\u00e7",
	                                          "\1\u00e8",
	                                          "\1\u00e9",
	                                          "\1\u00ea",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u00ec",
	                                          "\1\u00ed",
	                                          "\1\u00ee",
	                                          "\1\u00ef",
	                                          "\1\u00f0",
	                                          "\1\u00f1",
	                                          "\1\u00f2",
	                                          "\1\u00f3\12\uffff\1\u00f4",
	                                          "\1\u00f5",
	                                          "",
	                                          "\1\u00f6",
	                                          "",
	                                          "\1\u00f7",
	                                          "\1\u00f8",
	                                          "\1\u00f9",
	                                          "",
	                                          "\1\u00fa",
	                                          "\1\u00fb",
	                                          "\1\u00fc",
	                                          "\1\u00fd",
	                                          "\1\u00fe",
	                                          "\1\u00ff",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0101",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0103",
	                                          "\1\u0104",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0107",
	                                          "\1\u0108",
	                                          "\1\u0109",
	                                          "\1\u010a",
	                                          "\1\u010b",
	                                          "\1\u010c",
	                                          "\1\u010d",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\12\u00d9\1\u00d8\ufff5\u00d9",
	                                          "\12\u00d9\1\u00d8\ufff5\u00d9",
	                                          "\1\u0110",
	                                          "\1\u0111",
	                                          "\1\u0112",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0114",
	                                          "\1\u0115",
	                                          "\1\u0116",
	                                          "\1\u0117",
	                                          "\1\u0118",
	                                          "\1\u0119",
	                                          "\1\u011a",
	                                          "\1\u011b",
	                                          "\1\u011c",
	                                          "\1\u011d",
	                                          "\1\u011e",
	                                          "\1\u011f",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u0121",
	                                          "\1\u0122",
	                                          "\1\u0123",
	                                          "\1\u0124",
	                                          "\1\u0125\1\uffff\1\u0126",
	                                          "\1\u0127",
	                                          "\1\u0128",
	                                          "\1\u0129",
	                                          "\1\u012a",
	                                          "\1\u012b",
	                                          "\1\u012c",
	                                          "\1\u012d",
	                                          "\1\u012e",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0130",
	                                          "\1\u0131",
	                                          "\12\41\7\uffff\10\41\1\u0132\21\41\6\uffff\32\41",
	                                          "\1\u0133",
	                                          "\1\u0134",
	                                          "\1\u0135",
	                                          "",
	                                          "\1\u0136",
	                                          "",
	                                          "\1\u0137",
	                                          "\1\u0138",
	                                          "",
	                                          "",
	                                          "\1\u0139",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u013b",
	                                          "\1\u013c",
	                                          "\1\u013d",
	                                          "\1\u013e",
	                                          "\1\u013f",
	                                          "",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0141",
	                                          "\1\u0142",
	                                          "",
	                                          "\1\u0143",
	                                          "\1\u0144",
	                                          "\1\u0145",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0147",
	                                          "\1\u0148",
	                                          "\1\u0149",
	                                          "\1\u014a",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u014c",
	                                          "\1\u014d",
	                                          "\1\u014e",
	                                          "",
	                                          "\1\u014f",
	                                          "\1\u0150",
	                                          "\1\u0151",
	                                          "\1\u0152",
	                                          "\1\u0153",
	                                          "\1\u0154",
	                                          "\1\u0155",
	                                          "\1\u0156",
	                                          "\1\u0157",
	                                          "\1\u0158",
	                                          "\1\u0159",
	                                          "\12\41\7\uffff\10\41\1\u015a\21\41\6\uffff\32\41",
	                                          "\1\u015b",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u015d",
	                                          "\1\u015e",
	                                          "\1\u015f",
	                                          "\1\u0160",
	                                          "\1\u0161",
	                                          "\1\u0162",
	                                          "\1\u0163",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0165",
	                                          "\1\u0166",
	                                          "",
	                                          "\1\u0167",
	                                          "\1\u0168",
	                                          "\1\u0169",
	                                          "\1\u016a",
	                                          "\1\u016b",
	                                          "",
	                                          "\1\u016c",
	                                          "\1\u016d",
	                                          "\1\u016e",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0170",
	                                          "",
	                                          "\1\u0171",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0173",
	                                          "\1\u0174",
	                                          "",
	                                          "\1\u0175",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0177",
	                                          "\1\u0178",
	                                          "\1\u0179",
	                                          "\1\u017a",
	                                          "\1\u017b",
	                                          "\1\u017c",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u017f",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0181",
	                                          "\1\u0182",
	                                          "\1\u0183",
	                                          "\1\u0184",
	                                          "",
	                                          "\1\u0185",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0187",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u018a",
	                                          "\1\u018b",
	                                          "",
	                                          "\1\u018c",
	                                          "\1\u018d",
	                                          "\1\u018e",
	                                          "\1\u018f",
	                                          "\1\u0190",
	                                          "\1\u0191",
	                                          "\1\u0192",
	                                          "\1\u0193",
	                                          "\1\u0194",
	                                          "\1\u0195",
	                                          "",
	                                          "\1\u0196",
	                                          "\1\u0197",
	                                          "",
	                                          "\1\u0198",
	                                          "\1\u0199",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u019b",
	                                          "\1\u019c",
	                                          "\1\u019d",
	                                          "\1\u019e",
	                                          "\1\u019f",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u01a2",
	                                          "\1\u01a3",
	                                          "\1\u01a4",
	                                          "\1\u01a5",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u01a7",
	                                          "",
	                                          "",
	                                          "\1\u01a8",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01aa",
	                                          "\1\u01ab",
	                                          "\1\u01ac",
	                                          "\1\u01ad",
	                                          "\1\u01ae",
	                                          "\1\u01af",
	                                          "\1\u01b0",
	                                          "\1\u01b1",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\22\41\1\u01b5\7\41\6\uffff\32\41",
	                                          "\1\u01b7",
	                                          "\1\u01b8",
	                                          "",
	                                          "\1\u01b9",
	                                          "\1\u01ba",
	                                          "\1\u01bb",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01bd",
	                                          "",
	                                          "",
	                                          "\1\u01be",
	                                          "\1\u01bf",
	                                          "\1\u01c0",
	                                          "\1\u01c1",
	                                          "",
	                                          "\1\u01c2",
	                                          "\1\u01c3",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01c5",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01c7",
	                                          "\1\u01c8",
	                                          "\1\u01c9",
	                                          "\1\u01ca",
	                                          "\1\u01cb",
	                                          "",
	                                          "",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u01cd",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01cf",
	                                          "\1\u01d0",
	                                          "\1\u01d1",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01d3",
	                                          "\1\u01d4",
	                                          "\1\u01d5",
	                                          "\1\u01d6",
	                                          "\1\u01d7",
	                                          "\1\u01d8",
	                                          "",
	                                          "\1\u01d9",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01db",
	                                          "\1\u01dc",
	                                          "\1\u01dd",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "\1\u01e0",
	                                          "\1\u01e1",
	                                          "\1\u01e2",
	                                          "",
	                                          "\1\u01e3",
	                                          "\1\u01e4",
	                                          "\1\u01e5",
	                                          "\1\u01e6",
	                                          "\1\u01e7",
	                                          "\1\u01e8",
	                                          "\1\u01e9",
	                                          "",
	                                          "\1\u01ea",
	                                          "\1\u01eb",
	                                          "\1\u01ec",
	                                          "",
	                                          "",
	                                          "\1\u01ed",
	                                          "\1\u01ee",
	                                          "\1\u01ef",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u01f2",
	                                          "\1\u01f3",
	                                          "\1\u01f4",
	                                          "\1\u01f5",
	                                          "\1\u01f6",
	                                          "\1\u01f7",
	                                          "\1\u01f8",
	                                          "\1\u01f9",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "",
	                                          "\1\u01fd",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0200",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\u0202",
	                                          "\1\u0203",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "",
	                                          "\1\u0206",
	                                          "",
	                                          "\1\u0207",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "\1\41\2\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
	                                          "",
	                                          "",
	                                          ""
	};

	static final short[] DFA14_eot     = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof     = DFA.unpackEncodedString(DFA14_eofS);
	static final char[]  DFA14_min     = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[]  DFA14_max     = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept  = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | ID | INT | REAL_NUMBER | CLASS_DEF | COMMENT_LINE | ML_COMMENT | WS );";
		}

		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
				case 0:
					int LA14_96 = input.LA(1);

					s = -1;
					if ((LA14_96 == '#')) {s = 155;} else if (((LA14_96 >= '\u0000' && LA14_96 <= '\"') || (LA14_96 >= '$' && LA14_96 <= '\uFFFF'))) {
						s = 156;
					}

					if (s >= 0) return s;
					break;

				case 1:
					int LA14_216 = input.LA(1);

					s = -1;
					if ((LA14_216 == '\n')) {s = 216;} else if (((LA14_216 >= '\u0000' && LA14_216 <= '\t') || (LA14_216 >= '\u000B'
					                                                                                            && LA14_216 <= '\uFFFF'))) {
						s = 217;
					} else { s = 271; }

					if (s >= 0) return s;
					break;

				case 2:
					int LA14_155 = input.LA(1);

					s = -1;
					if ((LA14_155 == '\n')) {s = 216;} else if (((LA14_155 >= '\u0000' && LA14_155 <= '\t') || (LA14_155 >= '\u000B'
					                                                                                            && LA14_155 <= '\uFFFF'))) {s = 217;}

					if (s >= 0) return s;
					break;

				case 3:
					int LA14_217 = input.LA(1);

					s = -1;
					if ((LA14_217 == '\n')) {s = 216;} else if (((LA14_217 >= '\u0000' && LA14_217 <= '\t') || (LA14_217 >= '\u000B'
					                                                                                            && LA14_217 <= '\uFFFF'))) {s = 217;}

					if (s >= 0) return s;
					break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}

			NoViableAltException nvae =
			new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}

	}


}