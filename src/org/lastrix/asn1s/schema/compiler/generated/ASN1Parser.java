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

// $ANTLR 3.4 /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g 2012-11-26 14:11:48

package org.lastrix.asn1s.schema.compiler.generated;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASN1Parser extends Parser {
	public static final String[] tokenNames = new String[]{
	                                                      "<invalid>",
	                                                      "<EOR>",
	                                                      "<DOWN>",
	                                                      "<UP>",
	                                                      "ALL",
	                                                      "ASSIGNMENT",
	                                                      "BIT_STRING",
	                                                      "BOOLEAN",
	                                                      "CHOICE",
	                                                      "CLASS_DEF",
	                                                      "COMMENT_LINE",
	                                                      "COMPONENT_TYPE",
	                                                      "COMPONENT_TYPE_OPTION",
	                                                      "CONSTRAINT",
	                                                      "CONSTRAINT_INNER_TYPE",
	                                                      "CONSTRAINT_PATTERN",
	                                                      "CONSTRAINT_SIZE",
	                                                      "CONSTRAINT_TYPE",
	                                                      "CONSTRAINT_VALUE",
	                                                      "CONSTRAINT_VALUE_RANGE",
	                                                      "CSTRING",
	                                                      "ENDPOINT",
	                                                      "ENUMERATION",
	                                                      "ENUMERATION_ITEM",
	                                                      "EXCEPT",
	                                                      "EXCEPTION_SPEC",
	                                                      "EXPLICIT",
	                                                      "EXPORTS",
	                                                      "EXTENSIBILITY_IMPLIED",
	                                                      "EXTENSION_ADDITION_ALTERNATIVES_GROUP",
	                                                      "EXTENSION_ADDITION_GROUP",
	                                                      "EXTENSION_AND_EXCEPTION",
	                                                      "EXTENSION_END_MARKER",
	                                                      "FALSE",
	                                                      "GLOBAL_MODULE_REFERENCE",
	                                                      "ID",
	                                                      "IMPLICIT",
	                                                      "IMPORTS",
	                                                      "INT",
	                                                      "INTEGER",
	                                                      "INTERSECTION_ELEMENT",
	                                                      "MINUS_INFINITY",
	                                                      "ML_COMMENT",
	                                                      "MODULE",
	                                                      "MODULE_IDENTIFIER",
	                                                      "NAMED_CONSTRAINT",
	                                                      "NAMED_NUMBER",
	                                                      "NAMED_TYPE",
	                                                      "NAME_FORM",
	                                                      "NAME_NUMBER_FORM",
	                                                      "NUMBER",
	                                                      "NUMBER_FORM",
	                                                      "OCTET_STRING",
	                                                      "OID",
	                                                      "PLUS_INFINITY",
	                                                      "REAL",
	                                                      "REAL_NUMBER",
	                                                      "SELECTION_TYPE",
	                                                      "SEQUENCE",
	                                                      "SEQUENCEOF",
	                                                      "SET",
	                                                      "SETOF",
	                                                      "SYMBOL",
	                                                      "SYMBOLS_FROM_MODULE",
	                                                      "TAG",
	                                                      "TAGGED_TYPE",
	                                                      "TAGGING_METHOD",
	                                                      "TAG_NUMBER",
	                                                      "TRUE",
	                                                      "TYPE",
	                                                      "TYPE_ASSIGNMENT",
	                                                      "TYPE_REFERENCE",
	                                                      "UNION",
	                                                      "UNRESTRICTED_CSTRING",
	                                                      "VALUE",
	                                                      "VALUE_ASSIGNMENT",
	                                                      "VALUE_ID",
	                                                      "VALUE_REFERENCE",
	                                                      "VEC",
	                                                      "WS",
	                                                      "'!'",
	                                                      "'('",
	                                                      "')'",
	                                                      "','",
	                                                      "'.'",
	                                                      "'..'",
	                                                      "'...'",
	                                                      "':'",
	                                                      "'::='",
	                                                      "';'",
	                                                      "'<'",
	                                                      "'ABSENT'",
	                                                      "'ALL'",
	                                                      "'APPLICATION'",
	                                                      "'AUTOMATIC'",
	                                                      "'BEGIN'",
	                                                      "'BIT'",
	                                                      "'BMPString'",
	                                                      "'BOOLEAN'",
	                                                      "'CHARACTER'",
	                                                      "'CHOICE'",
	                                                      "'COMPONENT'",
	                                                      "'COMPONENTS'",
	                                                      "'DEFAULT'",
	                                                      "'DEFINITIONS'",
	                                                      "'END'",
	                                                      "'ENUMERATED'",
	                                                      "'EXCEPT'",
	                                                      "'EXPLICIT'",
	                                                      "'EXPORTS'",
	                                                      "'EXTENSIBILITY'",
	                                                      "'FALSE'",
	                                                      "'FROM'",
	                                                      "'GeneralString'",
	                                                      "'GraphicString'",
	                                                      "'IA5String'",
	                                                      "'IDENTIFIER'",
	                                                      "'IMPLICIT'",
	                                                      "'IMPLIED'",
	                                                      "'IMPORTS'",
	                                                      "'INCLUDES'",
	                                                      "'INTEGER'",
	                                                      "'INTERSECTION'",
	                                                      "'ISO646String'",
	                                                      "'MAX'",
	                                                      "'MIN'",
	                                                      "'MINUS-INFINITY'",
	                                                      "'NumericString'",
	                                                      "'OBJECT'",
	                                                      "'OCTET'",
	                                                      "'OF'",
	                                                      "'OID_VALUE'",
	                                                      "'OPTIONAL'",
	                                                      "'PATTERN'",
	                                                      "'PLUS-INFINITY'",
	                                                      "'PRESENT'",
	                                                      "'PRIVATE'",
	                                                      "'PrintableString'",
	                                                      "'REAL'",
	                                                      "'SEQUENCE'",
	                                                      "'SET'",
	                                                      "'SIZE'",
	                                                      "'STRING'",
	                                                      "'T61String'",
	                                                      "'TAGS'",
	                                                      "'TRUE'",
	                                                      "'TeletexString'",
	                                                      "'UNION'",
	                                                      "'UNIVERSAL'",
	                                                      "'UTF8String'",
	                                                      "'UniversalString'",
	                                                      "'VideotexString'",
	                                                      "'VisibleString'",
	                                                      "'WITH'",
	                                                      "'['",
	                                                      "'[['",
	                                                      "']'",
	                                                      "']]'",
	                                                      "'^'",
	                                                      "'{'",
	                                                      "'|'",
	                                                      "'}'"
	};

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
	public Parser[] getDelegates() {
		return new Parser[]{};
	}

	// delegators


	public ASN1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public ASN1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}

	public String[] getTokenNames() { return ASN1Parser.tokenNames; }

	public String getGrammarFileName() { return "/home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g"; }


	public static class parse_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "parse"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:94:1: parse : ( module )+ ;
	public final ASN1Parser.parse_return parse() throws RecognitionException {
		ASN1Parser.parse_return retval = new ASN1Parser.parse_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.module_return module1 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:94:7: ( ( module )+ )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:94:9: ( module )+
			{
				root_0 = (CommonTree) adaptor.nil();


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:94:9: ( module )+
				int cnt1 = 0;
				loop1:
				do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == ID)) {
						alt1 = 1;
					}


					switch (alt1) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:94:9: module
						{
							pushFollow(FOLLOW_module_in_parse277);
							module1 = module();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) adaptor.addChild(root_0, module1.getTree());

						}
						break;

						default:
							if (cnt1 >= 1) break loop1;
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							EarlyExitException eee =
							new EarlyExitException(1, input);
							throw eee;
					}
					cnt1++;
				} while (true);


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class module_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "module"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:96:1: module : moduleIdentifier 'DEFINITIONS' ( tagDefault )? ( extensionDefault )? '::=' 'BEGIN' ( exports )? ( imports )? assignmentList 'END' -> ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList ) ;
	public final ASN1Parser.module_return module() throws RecognitionException {
		ASN1Parser.module_return retval = new ASN1Parser.module_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal3 = null;
		Token string_literal6 = null;
		Token string_literal7 = null;
		Token string_literal11 = null;
		ASN1Parser.moduleIdentifier_return moduleIdentifier2 = null;

		ASN1Parser.tagDefault_return tagDefault4 = null;

		ASN1Parser.extensionDefault_return extensionDefault5 = null;

		ASN1Parser.exports_return exports8 = null;

		ASN1Parser.imports_return imports9 = null;

		ASN1Parser.assignmentList_return assignmentList10 = null;


		CommonTree string_literal3_tree = null;
		CommonTree string_literal6_tree = null;
		CommonTree string_literal7_tree = null;
		CommonTree string_literal11_tree = null;
		RewriteRuleTokenStream stream_95 = new RewriteRuleTokenStream(adaptor, "token 95");
		RewriteRuleTokenStream stream_105 = new RewriteRuleTokenStream(adaptor, "token 105");
		RewriteRuleTokenStream stream_104 = new RewriteRuleTokenStream(adaptor, "token 104");
		RewriteRuleTokenStream stream_88 = new RewriteRuleTokenStream(adaptor, "token 88");
		RewriteRuleSubtreeStream stream_extensionDefault = new RewriteRuleSubtreeStream(adaptor, "rule extensionDefault");
		RewriteRuleSubtreeStream stream_assignmentList = new RewriteRuleSubtreeStream(adaptor, "rule assignmentList");
		RewriteRuleSubtreeStream stream_exports = new RewriteRuleSubtreeStream(adaptor, "rule exports");
		RewriteRuleSubtreeStream stream_tagDefault = new RewriteRuleSubtreeStream(adaptor, "rule tagDefault");
		RewriteRuleSubtreeStream stream_moduleIdentifier = new RewriteRuleSubtreeStream(adaptor, "rule moduleIdentifier");
		RewriteRuleSubtreeStream stream_imports = new RewriteRuleSubtreeStream(adaptor, "rule imports");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:96:25: ( moduleIdentifier 'DEFINITIONS' ( tagDefault )? ( extensionDefault )? '::=' 'BEGIN' ( exports )? ( imports )? assignmentList 'END' -> ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:97:3: moduleIdentifier 'DEFINITIONS' ( tagDefault )? ( extensionDefault )? '::=' 'BEGIN' ( exports )? ( imports )? assignmentList 'END'
			{
				pushFollow(FOLLOW_moduleIdentifier_in_module305);
				moduleIdentifier2 = moduleIdentifier();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_moduleIdentifier.add(moduleIdentifier2.getTree());

				string_literal3 = (Token) match(input, 104, FOLLOW_104_in_module307);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_104.add(string_literal3);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:98:3: ( tagDefault )?
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == 94 || LA2_0 == 108 || LA2_0 == 117)) {
					alt2 = 1;
				}
				switch (alt2) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:98:3: tagDefault
					{
						pushFollow(FOLLOW_tagDefault_in_module312);
						tagDefault4 = tagDefault();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_tagDefault.add(tagDefault4.getTree());

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:98:15: ( extensionDefault )?
				int alt3 = 2;
				int LA3_0 = input.LA(1);

				if ((LA3_0 == 110)) {
					alt3 = 1;
				}
				switch (alt3) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:98:15: extensionDefault
					{
						pushFollow(FOLLOW_extensionDefault_in_module315);
						extensionDefault5 = extensionDefault();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionDefault.add(extensionDefault5.getTree());

					}
					break;

				}


				string_literal6 = (Token) match(input, 88, FOLLOW_88_in_module318);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_88.add(string_literal6);


				string_literal7 = (Token) match(input, 95, FOLLOW_95_in_module322);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_95.add(string_literal7);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:11: ( exports )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);

				if ((LA4_0 == 109)) {
					alt4 = 1;
				}
				switch (alt4) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:11: exports
					{
						pushFollow(FOLLOW_exports_in_module324);
						exports8 = exports();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exports.add(exports8.getTree());

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:20: ( imports )?
				int alt5 = 2;
				int LA5_0 = input.LA(1);

				if ((LA5_0 == 119)) {
					alt5 = 1;
				}
				switch (alt5) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:20: imports
					{
						pushFollow(FOLLOW_imports_in_module327);
						imports9 = imports();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_imports.add(imports9.getTree());

					}
					break;

				}


				pushFollow(FOLLOW_assignmentList_in_module330);
				assignmentList10 = assignmentList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_assignmentList.add(assignmentList10.getTree());

				string_literal11 = (Token) match(input, 105, FOLLOW_105_in_module332);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_105.add(string_literal11);


				// AST REWRITE
				// elements: exports, moduleIdentifier, assignmentList, imports, extensionDefault, tagDefault
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 99:50: -> ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:53: ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(MODULE, "MODULE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_moduleIdentifier.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:79: ( tagDefault )?
							if (stream_tagDefault.hasNext()) {
								adaptor.addChild(root_1, stream_tagDefault.nextTree());

							}
							stream_tagDefault.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:91: ( extensionDefault )?
							if (stream_extensionDefault.hasNext()) {
								adaptor.addChild(root_1, stream_extensionDefault.nextTree());

							}
							stream_extensionDefault.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:109: ( exports )?
							if (stream_exports.hasNext()) {
								adaptor.addChild(root_1, stream_exports.nextTree());

							}
							stream_exports.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:99:118: ( imports )?
							if (stream_imports.hasNext()) {
								adaptor.addChild(root_1, stream_imports.nextTree());

							}
							stream_imports.reset();

							adaptor.addChild(root_1, stream_assignmentList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module"


	public static class moduleIdentifier_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "moduleIdentifier"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:102:1: moduleIdentifier : ID ( definitiveIdentifier )? -> ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? ) ;
	public final ASN1Parser.moduleIdentifier_return moduleIdentifier() throws RecognitionException {
		ASN1Parser.moduleIdentifier_return retval = new ASN1Parser.moduleIdentifier_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID12 = null;
		ASN1Parser.definitiveIdentifier_return definitiveIdentifier13 = null;


		CommonTree ID12_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_definitiveIdentifier = new RewriteRuleSubtreeStream(adaptor, "rule definitiveIdentifier");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:102:18: ( ID ( definitiveIdentifier )? -> ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:103:2: ID ( definitiveIdentifier )?
			{
				ID12 = (Token) match(input, ID, FOLLOW_ID_in_moduleIdentifier364);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID12);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:103:5: ( definitiveIdentifier )?
				int alt6 = 2;
				int LA6_0 = input.LA(1);

				if ((LA6_0 == 159)) {
					alt6 = 1;
				}
				switch (alt6) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:103:5: definitiveIdentifier
					{
						pushFollow(FOLLOW_definitiveIdentifier_in_moduleIdentifier366);
						definitiveIdentifier13 = definitiveIdentifier();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_definitiveIdentifier.add(definitiveIdentifier13.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: definitiveIdentifier, ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 103:27: -> ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:103:30: ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(MODULE_IDENTIFIER, "MODULE_IDENTIFIER")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:103:53: ( definitiveIdentifier )?
							if (stream_definitiveIdentifier.hasNext()) {
								adaptor.addChild(root_1, stream_definitiveIdentifier.nextTree());

							}
							stream_definitiveIdentifier.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "moduleIdentifier"


	public static class definitiveIdentifier_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "definitiveIdentifier"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:107:1: definitiveIdentifier : '{' ( definitiveObjIdComponent )+ '}' -> ^( VEC ( definitiveObjIdComponent )+ ) ;
	public final ASN1Parser.definitiveIdentifier_return definitiveIdentifier() throws RecognitionException {
		ASN1Parser.definitiveIdentifier_return retval = new ASN1Parser.definitiveIdentifier_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal14 = null;
		Token char_literal16 = null;
		ASN1Parser.definitiveObjIdComponent_return definitiveObjIdComponent15 = null;


		CommonTree char_literal14_tree = null;
		CommonTree char_literal16_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_definitiveObjIdComponent = new RewriteRuleSubtreeStream(adaptor, "rule definitiveObjIdComponent");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:107:22: ( '{' ( definitiveObjIdComponent )+ '}' -> ^( VEC ( definitiveObjIdComponent )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:108:2: '{' ( definitiveObjIdComponent )+ '}'
			{
				char_literal14 = (Token) match(input, 159, FOLLOW_159_in_definitiveIdentifier389);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal14);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:108:6: ( definitiveObjIdComponent )+
				int cnt7 = 0;
				loop7:
				do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == ID || LA7_0 == INT)) {
						alt7 = 1;
					}


					switch (alt7) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:108:6: definitiveObjIdComponent
						{
							pushFollow(FOLLOW_definitiveObjIdComponent_in_definitiveIdentifier391);
							definitiveObjIdComponent15 = definitiveObjIdComponent();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_definitiveObjIdComponent.add(definitiveObjIdComponent15.getTree());

						}
						break;

						default:
							if (cnt7 >= 1) break loop7;
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							EarlyExitException eee =
							new EarlyExitException(7, input);
							throw eee;
					}
					cnt7++;
				} while (true);


				char_literal16 = (Token) match(input, 161, FOLLOW_161_in_definitiveIdentifier394);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal16);


				// AST REWRITE
				// elements: definitiveObjIdComponent
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 109:2: -> ^( VEC ( definitiveObjIdComponent )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:109:5: ^( VEC ( definitiveObjIdComponent )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_definitiveObjIdComponent.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_definitiveObjIdComponent.hasNext()) {
								adaptor.addChild(root_1, stream_definitiveObjIdComponent.nextTree());

							}
							stream_definitiveObjIdComponent.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definitiveIdentifier"


	public static class definitiveObjIdComponent_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "definitiveObjIdComponent"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:112:1: definitiveObjIdComponent : ( nameNumberForm | ID -> ^( NAME_FORM ID ) | INT -> ^( NUMBER_FORM INT ) );
	public final ASN1Parser.definitiveObjIdComponent_return definitiveObjIdComponent() throws RecognitionException {
		ASN1Parser.definitiveObjIdComponent_return retval = new ASN1Parser.definitiveObjIdComponent_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID18 = null;
		Token INT19 = null;
		ASN1Parser.nameNumberForm_return nameNumberForm17 = null;


		CommonTree ID18_tree = null;
		CommonTree INT19_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:112:25: ( nameNumberForm | ID -> ^( NAME_FORM ID ) | INT -> ^( NUMBER_FORM INT ) )
			int alt8 = 3;
			int LA8_0 = input.LA(1);

			if ((LA8_0 == ID)) {
				int LA8_1 = input.LA(2);

				if ((LA8_1 == 81)) {
					alt8 = 1;
				} else if ((LA8_1 == ID || LA8_1 == INT || LA8_1 == 161)) {
					alt8 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 8, 1, input);

					throw nvae;

				}
			} else if ((LA8_0 == INT)) {
				alt8 = 3;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);

				throw nvae;

			}
			switch (alt8) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:113:3: nameNumberForm
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_nameNumberForm_in_definitiveObjIdComponent414);
					nameNumberForm17 = nameNumberForm();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, nameNumberForm17.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:114:4: ID
				{
					ID18 = (Token) match(input, ID, FOLLOW_ID_in_definitiveObjIdComponent419);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID18);


					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 114:7: -> ^( NAME_FORM ID )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:114:10: ^( NAME_FORM ID )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NAME_FORM, "NAME_FORM")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_ID.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:115:4: INT
				{
					INT19 = (Token) match(input, INT, FOLLOW_INT_in_definitiveObjIdComponent432);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_INT.add(INT19);


					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 115:8: -> ^( NUMBER_FORM INT )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:115:11: ^( NUMBER_FORM INT )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NUMBER_FORM, "NUMBER_FORM")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_INT.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definitiveObjIdComponent"


	public static class extensionDefault_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionDefault"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:117:1: extensionDefault : 'EXTENSIBILITY' 'IMPLIED' -> ^( EXTENSIBILITY_IMPLIED ) ;
	public final ASN1Parser.extensionDefault_return extensionDefault() throws RecognitionException {
		ASN1Parser.extensionDefault_return retval = new ASN1Parser.extensionDefault_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal20 = null;
		Token string_literal21 = null;

		CommonTree string_literal20_tree = null;
		CommonTree string_literal21_tree = null;
		RewriteRuleTokenStream stream_110 = new RewriteRuleTokenStream(adaptor, "token 110");
		RewriteRuleTokenStream stream_118 = new RewriteRuleTokenStream(adaptor, "token 118");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:117:19: ( 'EXTENSIBILITY' 'IMPLIED' -> ^( EXTENSIBILITY_IMPLIED ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:118:3: 'EXTENSIBILITY' 'IMPLIED'
			{
				string_literal20 = (Token) match(input, 110, FOLLOW_110_in_extensionDefault452);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_110.add(string_literal20);


				string_literal21 = (Token) match(input, 118, FOLLOW_118_in_extensionDefault454);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_118.add(string_literal21);


				// AST REWRITE
				// elements: 
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 118:29: -> ^( EXTENSIBILITY_IMPLIED )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:118:32: ^( EXTENSIBILITY_IMPLIED )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(EXTENSIBILITY_IMPLIED, "EXTENSIBILITY_IMPLIED")
							                                        , root_1
							                                        );

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionDefault"


	public static class tagDefault_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "tagDefault"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:120:1: tagDefault : taggingMethod 'TAGS' -> ^( TAGGING_METHOD taggingMethod ) ;
	public final ASN1Parser.tagDefault_return tagDefault() throws RecognitionException {
		ASN1Parser.tagDefault_return retval = new ASN1Parser.tagDefault_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal23 = null;
		ASN1Parser.taggingMethod_return taggingMethod22 = null;


		CommonTree string_literal23_tree = null;
		RewriteRuleTokenStream stream_144 = new RewriteRuleTokenStream(adaptor, "token 144");
		RewriteRuleSubtreeStream stream_taggingMethod = new RewriteRuleSubtreeStream(adaptor, "rule taggingMethod");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:120:14: ( taggingMethod 'TAGS' -> ^( TAGGING_METHOD taggingMethod ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:121:3: taggingMethod 'TAGS'
			{
				pushFollow(FOLLOW_taggingMethod_in_tagDefault472);
				taggingMethod22 = taggingMethod();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_taggingMethod.add(taggingMethod22.getTree());

				string_literal23 = (Token) match(input, 144, FOLLOW_144_in_tagDefault474);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_144.add(string_literal23);


				// AST REWRITE
				// elements: taggingMethod
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 121:24: -> ^( TAGGING_METHOD taggingMethod )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:121:27: ^( TAGGING_METHOD taggingMethod )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(TAGGING_METHOD, "TAGGING_METHOD")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_taggingMethod.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tagDefault"


	public static class taggingMethod_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "taggingMethod"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:123:1: taggingMethod : ( 'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC' );
	public final ASN1Parser.taggingMethod_return taggingMethod() throws RecognitionException {
		ASN1Parser.taggingMethod_return retval = new ASN1Parser.taggingMethod_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set24 = null;

		CommonTree set24_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:123:17: ( 'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set24 = (Token) input.LT(1);

				if (input.LA(1) == 94 || input.LA(1) == 108 || input.LA(1) == 117) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set24)
						                );
					}
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "taggingMethod"


	public static class exports_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "exports"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:128:1: exports : ( 'EXPORTS' 'ALL' ';' -> ^( EXPORTS ALL ) | 'EXPORTS' symbolList ';' -> ^( EXPORTS symbolList ) );
	public final ASN1Parser.exports_return exports() throws RecognitionException {
		ASN1Parser.exports_return retval = new ASN1Parser.exports_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal25 = null;
		Token string_literal26 = null;
		Token char_literal27 = null;
		Token string_literal28 = null;
		Token char_literal30 = null;
		ASN1Parser.symbolList_return symbolList29 = null;


		CommonTree string_literal25_tree = null;
		CommonTree string_literal26_tree = null;
		CommonTree char_literal27_tree = null;
		CommonTree string_literal28_tree = null;
		CommonTree char_literal30_tree = null;
		RewriteRuleTokenStream stream_109 = new RewriteRuleTokenStream(adaptor, "token 109");
		RewriteRuleTokenStream stream_92 = new RewriteRuleTokenStream(adaptor, "token 92");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_symbolList = new RewriteRuleSubtreeStream(adaptor, "rule symbolList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:128:12: ( 'EXPORTS' 'ALL' ';' -> ^( EXPORTS ALL ) | 'EXPORTS' symbolList ';' -> ^( EXPORTS symbolList ) )
			int alt9 = 2;
			int LA9_0 = input.LA(1);

			if ((LA9_0 == 109)) {
				int LA9_1 = input.LA(2);

				if ((LA9_1 == 92)) {
					alt9 = 1;
				} else if ((LA9_1 == ID)) {
					alt9 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 9, 1, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 9, 0, input);

				throw nvae;

			}
			switch (alt9) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:129:3: 'EXPORTS' 'ALL' ';'
				{
					string_literal25 = (Token) match(input, 109, FOLLOW_109_in_exports517);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_109.add(string_literal25);


					string_literal26 = (Token) match(input, 92, FOLLOW_92_in_exports519);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_92.add(string_literal26);


					char_literal27 = (Token) match(input, 89, FOLLOW_89_in_exports521);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_89.add(char_literal27);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 129:23: -> ^( EXPORTS ALL )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:129:26: ^( EXPORTS ALL )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(EXPORTS, "EXPORTS")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                (CommonTree) adaptor.create(ALL, "ALL")
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:130:4: 'EXPORTS' symbolList ';'
				{
					string_literal28 = (Token) match(input, 109, FOLLOW_109_in_exports534);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_109.add(string_literal28);


					pushFollow(FOLLOW_symbolList_in_exports536);
					symbolList29 = symbolList();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_symbolList.add(symbolList29.getTree());

					char_literal30 = (Token) match(input, 89, FOLLOW_89_in_exports538);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_89.add(char_literal30);


					// AST REWRITE
					// elements: symbolList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 130:29: -> ^( EXPORTS symbolList )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:130:32: ^( EXPORTS symbolList )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(EXPORTS, "EXPORTS")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_symbolList.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exports"


	public static class symbolList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "symbolList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:132:1: symbolList : symbol ( ',' symbol )* -> ^( VEC ( symbol )+ ) ;
	public final ASN1Parser.symbolList_return symbolList() throws RecognitionException {
		ASN1Parser.symbolList_return retval = new ASN1Parser.symbolList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal32 = null;
		ASN1Parser.symbol_return symbol31 = null;

		ASN1Parser.symbol_return symbol33 = null;


		CommonTree char_literal32_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_symbol = new RewriteRuleSubtreeStream(adaptor, "rule symbol");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:132:14: ( symbol ( ',' symbol )* -> ^( VEC ( symbol )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:133:3: symbol ( ',' symbol )*
			{
				pushFollow(FOLLOW_symbol_in_symbolList558);
				symbol31 = symbol();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_symbol.add(symbol31.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:133:10: ( ',' symbol )*
				loop10:
				do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == 83)) {
						alt10 = 1;
					}


					switch (alt10) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:133:12: ',' symbol
						{
							char_literal32 = (Token) match(input, 83, FOLLOW_83_in_symbolList562);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal32);


							pushFollow(FOLLOW_symbol_in_symbolList564);
							symbol33 = symbol();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_symbol.add(symbol33.getTree());

						}
						break;

						default:
							break loop10;
					}
				} while (true);


				// AST REWRITE
				// elements: symbol
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 133:25: -> ^( VEC ( symbol )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:133:28: ^( VEC ( symbol )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_symbol.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_symbol.hasNext()) {
								adaptor.addChild(root_1, stream_symbol.nextTree());

							}
							stream_symbol.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbolList"


	public static class symbol_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "symbol"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:136:1: symbol : ID -> ^( SYMBOL ID ) ;
	public final ASN1Parser.symbol_return symbol() throws RecognitionException {
		ASN1Parser.symbol_return retval = new ASN1Parser.symbol_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID34 = null;

		CommonTree ID34_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:136:11: ( ID -> ^( SYMBOL ID ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:137:3: ID
			{
				ID34 = (Token) match(input, ID, FOLLOW_ID_in_symbol589);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID34);


				// AST REWRITE
				// elements: ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 137:6: -> ^( SYMBOL ID )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:137:9: ^( SYMBOL ID )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SYMBOL, "SYMBOL")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbol"


	public static class imports_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "imports"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:139:1: imports : 'IMPORTS' symbolsFromModuleList ';' -> ^( IMPORTS symbolsFromModuleList ) ;
	public final ASN1Parser.imports_return imports() throws RecognitionException {
		ASN1Parser.imports_return retval = new ASN1Parser.imports_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal35 = null;
		Token char_literal37 = null;
		ASN1Parser.symbolsFromModuleList_return symbolsFromModuleList36 = null;


		CommonTree string_literal35_tree = null;
		CommonTree char_literal37_tree = null;
		RewriteRuleTokenStream stream_119 = new RewriteRuleTokenStream(adaptor, "token 119");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_symbolsFromModuleList = new RewriteRuleSubtreeStream(adaptor, "rule symbolsFromModuleList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:139:12: ( 'IMPORTS' symbolsFromModuleList ';' -> ^( IMPORTS symbolsFromModuleList ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:140:3: 'IMPORTS' symbolsFromModuleList ';'
			{
				string_literal35 = (Token) match(input, 119, FOLLOW_119_in_imports610);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_119.add(string_literal35);


				pushFollow(FOLLOW_symbolsFromModuleList_in_imports612);
				symbolsFromModuleList36 = symbolsFromModuleList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_symbolsFromModuleList.add(symbolsFromModuleList36.getTree());

				char_literal37 = (Token) match(input, 89, FOLLOW_89_in_imports614);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_89.add(char_literal37);


				// AST REWRITE
				// elements: symbolsFromModuleList
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 140:39: -> ^( IMPORTS symbolsFromModuleList )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:140:42: ^( IMPORTS symbolsFromModuleList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(IMPORTS, "IMPORTS")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_symbolsFromModuleList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "imports"


	public static class symbolsFromModuleList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "symbolsFromModuleList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:142:1: symbolsFromModuleList : ( symbolsFromModule )+ -> ^( VEC ( symbolsFromModule )+ ) ;
	public final ASN1Parser.symbolsFromModuleList_return symbolsFromModuleList() throws RecognitionException {
		ASN1Parser.symbolsFromModuleList_return retval = new ASN1Parser.symbolsFromModuleList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.symbolsFromModule_return symbolsFromModule38 = null;


		RewriteRuleSubtreeStream stream_symbolsFromModule = new RewriteRuleSubtreeStream(adaptor, "rule symbolsFromModule");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:142:24: ( ( symbolsFromModule )+ -> ^( VEC ( symbolsFromModule )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:143:3: ( symbolsFromModule )+
			{
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:143:3: ( symbolsFromModule )+
				int cnt11 = 0;
				loop11:
				do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == ID)) {
						alt11 = 1;
					}


					switch (alt11) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:143:3: symbolsFromModule
						{
							pushFollow(FOLLOW_symbolsFromModule_in_symbolsFromModuleList633);
							symbolsFromModule38 = symbolsFromModule();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_symbolsFromModule.add(symbolsFromModule38.getTree());

						}
						break;

						default:
							if (cnt11 >= 1) break loop11;
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							EarlyExitException eee =
							new EarlyExitException(11, input);
							throw eee;
					}
					cnt11++;
				} while (true);


				// AST REWRITE
				// elements: symbolsFromModule
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 143:22: -> ^( VEC ( symbolsFromModule )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:143:25: ^( VEC ( symbolsFromModule )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_symbolsFromModule.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_symbolsFromModule.hasNext()) {
								adaptor.addChild(root_1, stream_symbolsFromModule.nextTree());

							}
							stream_symbolsFromModule.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbolsFromModuleList"


	public static class symbolsFromModule_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "symbolsFromModule"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:145:1: symbolsFromModule : symbolList 'FROM' globalModuleReference -> ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList ) ;
	public final ASN1Parser.symbolsFromModule_return symbolsFromModule() throws RecognitionException {
		ASN1Parser.symbolsFromModule_return retval = new ASN1Parser.symbolsFromModule_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal40 = null;
		ASN1Parser.symbolList_return symbolList39 = null;

		ASN1Parser.globalModuleReference_return globalModuleReference41 = null;


		CommonTree string_literal40_tree = null;
		RewriteRuleTokenStream stream_112 = new RewriteRuleTokenStream(adaptor, "token 112");
		RewriteRuleSubtreeStream stream_globalModuleReference = new RewriteRuleSubtreeStream(adaptor, "rule globalModuleReference");
		RewriteRuleSubtreeStream stream_symbolList = new RewriteRuleSubtreeStream(adaptor, "rule symbolList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:145:20: ( symbolList 'FROM' globalModuleReference -> ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:146:3: symbolList 'FROM' globalModuleReference
			{
				pushFollow(FOLLOW_symbolList_in_symbolsFromModule656);
				symbolList39 = symbolList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_symbolList.add(symbolList39.getTree());

				string_literal40 = (Token) match(input, 112, FOLLOW_112_in_symbolsFromModule658);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_112.add(string_literal40);


				pushFollow(FOLLOW_globalModuleReference_in_symbolsFromModule660);
				globalModuleReference41 = globalModuleReference();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_globalModuleReference.add(globalModuleReference41.getTree());

				// AST REWRITE
				// elements: symbolList, globalModuleReference
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 146:43: -> ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:146:46: ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SYMBOLS_FROM_MODULE, "SYMBOLS_FROM_MODULE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_globalModuleReference.nextTree());

							adaptor.addChild(root_1, stream_symbolList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbolsFromModule"


	public static class globalModuleReference_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "globalModuleReference"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:149:1: globalModuleReference : ID ( assignedIdentifier )? -> ^( GLOBAL_MODULE_REFERENCE ID ) ;
	public final ASN1Parser.globalModuleReference_return globalModuleReference() throws RecognitionException {
		ASN1Parser.globalModuleReference_return retval = new ASN1Parser.globalModuleReference_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID42 = null;
		ASN1Parser.assignedIdentifier_return assignedIdentifier43 = null;


		CommonTree ID42_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_assignedIdentifier = new RewriteRuleSubtreeStream(adaptor, "rule assignedIdentifier");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:149:24: ( ID ( assignedIdentifier )? -> ^( GLOBAL_MODULE_REFERENCE ID ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:150:3: ID ( assignedIdentifier )?
			{
				ID42 = (Token) match(input, ID, FOLLOW_ID_in_globalModuleReference682);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID42);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:150:6: ( assignedIdentifier )?
				int alt12 = 2;
				int LA12_0 = input.LA(1);

				if ((LA12_0 == 131)) {
					alt12 = 1;
				} else if ((LA12_0 == ID)) {
					int LA12_2 = input.LA(2);

					if ((LA12_2 == ID || LA12_2 == 84 || LA12_2 == 89)) {
						alt12 = 1;
					}
				}
				switch (alt12) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:150:6: assignedIdentifier
					{
						pushFollow(FOLLOW_assignedIdentifier_in_globalModuleReference684);
						assignedIdentifier43 = assignedIdentifier();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_assignedIdentifier.add(assignedIdentifier43.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 150:26: -> ^( GLOBAL_MODULE_REFERENCE ID )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:150:29: ^( GLOBAL_MODULE_REFERENCE ID )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(GLOBAL_MODULE_REFERENCE, "GLOBAL_MODULE_REFERENCE")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "globalModuleReference"


	public static class assignedIdentifier_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "assignedIdentifier"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:152:1: assignedIdentifier : ( objectIdentifierValue | definedValue ) ;
	public final ASN1Parser.assignedIdentifier_return assignedIdentifier() throws RecognitionException {
		ASN1Parser.assignedIdentifier_return retval = new ASN1Parser.assignedIdentifier_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.objectIdentifierValue_return objectIdentifierValue44 = null;

		ASN1Parser.definedValue_return definedValue45 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:152:21: ( ( objectIdentifierValue | definedValue ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:153:3: ( objectIdentifierValue | definedValue )
			{
				root_0 = (CommonTree) adaptor.nil();


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:153:3: ( objectIdentifierValue | definedValue )
				int alt13 = 2;
				int LA13_0 = input.LA(1);

				if ((LA13_0 == 131)) {
					alt13 = 1;
				} else if ((LA13_0 == ID)) {
					alt13 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);

					throw nvae;

				}
				switch (alt13) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:153:4: objectIdentifierValue
					{
						pushFollow(FOLLOW_objectIdentifierValue_in_assignedIdentifier705);
						objectIdentifierValue44 = objectIdentifierValue();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) adaptor.addChild(root_0, objectIdentifierValue44.getTree());

					}
					break;
					case 2:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:153:28: definedValue
					{
						pushFollow(FOLLOW_definedValue_in_assignedIdentifier709);
						definedValue45 = definedValue();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) adaptor.addChild(root_0, definedValue45.getTree());

					}
					break;

				}


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignedIdentifier"


	public static class definedValue_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "definedValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:157:1: definedValue : ( ID '.' )? ID -> ^( VALUE_REFERENCE ID ( ID )? ) ;
	public final ASN1Parser.definedValue_return definedValue() throws RecognitionException {
		ASN1Parser.definedValue_return retval = new ASN1Parser.definedValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID46 = null;
		Token char_literal47 = null;
		Token ID48 = null;

		CommonTree ID46_tree = null;
		CommonTree char_literal47_tree = null;
		CommonTree ID48_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_84 = new RewriteRuleTokenStream(adaptor, "token 84");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:157:16: ( ( ID '.' )? ID -> ^( VALUE_REFERENCE ID ( ID )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:158:3: ( ID '.' )? ID
			{
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:158:3: ( ID '.' )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);

				if ((LA14_0 == ID)) {
					int LA14_1 = input.LA(2);

					if ((LA14_1 == 84)) {
						alt14 = 1;
					}
				}
				switch (alt14) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:158:4: ID '.'
					{
						ID46 = (Token) match(input, ID, FOLLOW_ID_in_definedValue725);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_ID.add(ID46);


						char_literal47 = (Token) match(input, 84, FOLLOW_84_in_definedValue727);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_84.add(char_literal47);


					}
					break;

				}


				ID48 = (Token) match(input, ID, FOLLOW_ID_in_definedValue731);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID48);


				// AST REWRITE
				// elements: ID, ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 158:16: -> ^( VALUE_REFERENCE ID ( ID )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:158:19: ^( VALUE_REFERENCE ID ( ID )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VALUE_REFERENCE, "VALUE_REFERENCE")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:158:40: ( ID )?
							if (stream_ID.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_ID.nextNode()
								                );

							}
							stream_ID.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definedValue"


	public static class assignmentList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "assignmentList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:161:1: assignmentList : ( assignment )+ -> ^( VEC ( assignment )+ ) ;
	public final ASN1Parser.assignmentList_return assignmentList() throws RecognitionException {
		ASN1Parser.assignmentList_return retval = new ASN1Parser.assignmentList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.assignment_return assignment49 = null;


		RewriteRuleSubtreeStream stream_assignment = new RewriteRuleSubtreeStream(adaptor, "rule assignment");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:161:18: ( ( assignment )+ -> ^( VEC ( assignment )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:162:3: ( assignment )+
			{
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:162:3: ( assignment )+
				int cnt15 = 0;
				loop15:
				do {
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if ((LA15_0 == CLASS_DEF || LA15_0 == ID)) {
						alt15 = 1;
					}


					switch (alt15) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:162:3: assignment
						{
							pushFollow(FOLLOW_assignment_in_assignmentList755);
							assignment49 = assignment();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_assignment.add(assignment49.getTree());

						}
						break;

						default:
							if (cnt15 >= 1) break loop15;
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							EarlyExitException eee =
							new EarlyExitException(15, input);
							throw eee;
					}
					cnt15++;
				} while (true);


				// AST REWRITE
				// elements: assignment
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 162:15: -> ^( VEC ( assignment )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:162:18: ^( VEC ( assignment )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_assignment.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_assignment.hasNext()) {
								adaptor.addChild(root_1, stream_assignment.nextTree());

							}
							stream_assignment.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentList"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "assignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:164:1: assignment : ( ( ( CLASS_DEF )? ID '::=' )=> typeAssignment | valueAssignment );
	public final ASN1Parser.assignment_return assignment() throws RecognitionException {
		ASN1Parser.assignment_return retval = new ASN1Parser.assignment_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.typeAssignment_return typeAssignment50 = null;

		ASN1Parser.valueAssignment_return valueAssignment51 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:164:14: ( ( ( CLASS_DEF )? ID '::=' )=> typeAssignment | valueAssignment )
			int alt16 = 2;
			int LA16_0 = input.LA(1);

			if ((LA16_0 == CLASS_DEF) && (synpred1_ASN1())) {
				alt16 = 1;
			} else if ((LA16_0 == ID)) {
				int LA16_2 = input.LA(2);

				if ((LA16_2 == 88)) {
					int LA16_3 = input.LA(3);

					if ((LA16_3 == 98) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 138) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 121) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 154) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 139) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 140) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 100) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 128) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 99) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 96) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 106) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 129) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == ID)) {
						int LA16_17 = input.LA(4);

						if ((synpred1_ASN1())) {
							alt16 = 1;
						} else if ((true)) {
							alt16 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae =
							new NoViableAltException("", 16, 17, input);

							throw nvae;

						}
					} else if ((LA16_3 == 81) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 105) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == CLASS_DEF) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 97) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 113) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 114) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 115) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 123) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 127) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 137) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 146) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 143) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 150) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 149) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 151) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == 152) && (synpred1_ASN1())) {
						alt16 = 1;
					} else if ((LA16_3 == INT || LA16_3 == REAL_NUMBER || LA16_3 == 111 || LA16_3 == 126 || LA16_3 == 131 || LA16_3 == 134
					            || LA16_3 == 145)) {
						alt16 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 16, 3, input);

						throw nvae;

					}
				} else if ((LA16_2 == ID || LA16_2 == 81 || (LA16_2 >= 96 && LA16_2 <= 100) || LA16_2 == 106 || (LA16_2 >= 113 && LA16_2 <= 115)
				            || LA16_2 == 121 || LA16_2 == 123 || (LA16_2 >= 127 && LA16_2 <= 129) || (LA16_2 >= 137 && LA16_2 <= 140) || LA16_2 == 143
				            || LA16_2 == 146 || (LA16_2 >= 149 && LA16_2 <= 152) || LA16_2 == 154)) {
					alt16 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 16, 2, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 16, 0, input);

				throw nvae;

			}
			switch (alt16) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:165:3: ( ( CLASS_DEF )? ID '::=' )=> typeAssignment
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_typeAssignment_in_assignment788);
					typeAssignment50 = typeAssignment();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, typeAssignment50.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:166:4: valueAssignment
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_valueAssignment_in_assignment793);
					valueAssignment51 = valueAssignment();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, valueAssignment51.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class valueAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "valueAssignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:168:1: valueAssignment : ID type '::=' value ( ';' )? -> ^( VALUE_ASSIGNMENT ID type value ) ;
	public final ASN1Parser.valueAssignment_return valueAssignment() throws RecognitionException {
		ASN1Parser.valueAssignment_return retval = new ASN1Parser.valueAssignment_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID52 = null;
		Token string_literal54 = null;
		Token char_literal56 = null;
		ASN1Parser.type_return type53 = null;

		ASN1Parser.value_return value55 = null;


		CommonTree ID52_tree = null;
		CommonTree string_literal54_tree = null;
		CommonTree char_literal56_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_88 = new RewriteRuleTokenStream(adaptor, "token 88");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:168:19: ( ID type '::=' value ( ';' )? -> ^( VALUE_ASSIGNMENT ID type value ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:169:3: ID type '::=' value ( ';' )?
			{
				ID52 = (Token) match(input, ID, FOLLOW_ID_in_valueAssignment805);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID52);


				pushFollow(FOLLOW_type_in_valueAssignment807);
				type53 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type53.getTree());

				string_literal54 = (Token) match(input, 88, FOLLOW_88_in_valueAssignment809);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_88.add(string_literal54);


				pushFollow(FOLLOW_value_in_valueAssignment811);
				value55 = value();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_value.add(value55.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:169:23: ( ';' )?
				int alt17 = 2;
				int LA17_0 = input.LA(1);

				if ((LA17_0 == 89)) {
					alt17 = 1;
				}
				switch (alt17) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:169:23: ';'
					{
						char_literal56 = (Token) match(input, 89, FOLLOW_89_in_valueAssignment813);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_89.add(char_literal56);


					}
					break;

				}


				// AST REWRITE
				// elements: ID, type, value
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 169:28: -> ^( VALUE_ASSIGNMENT ID type value )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:169:31: ^( VALUE_ASSIGNMENT ID type value )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VALUE_ASSIGNMENT, "VALUE_ASSIGNMENT")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_1, stream_value.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueAssignment"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "value"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:171:1: value : ( booleanValue -> ^( VALUE booleanValue ) | numberValue -> ^( VALUE numberValue ) | objectIdentifierValue -> ^( VALUE objectIdentifierValue ) );
	public final ASN1Parser.value_return value() throws RecognitionException {
		ASN1Parser.value_return retval = new ASN1Parser.value_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.booleanValue_return booleanValue57 = null;

		ASN1Parser.numberValue_return numberValue58 = null;

		ASN1Parser.objectIdentifierValue_return objectIdentifierValue59 = null;


		RewriteRuleSubtreeStream stream_objectIdentifierValue = new RewriteRuleSubtreeStream(adaptor, "rule objectIdentifierValue");
		RewriteRuleSubtreeStream stream_numberValue = new RewriteRuleSubtreeStream(adaptor, "rule numberValue");
		RewriteRuleSubtreeStream stream_booleanValue = new RewriteRuleSubtreeStream(adaptor, "rule booleanValue");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:171:10: ( booleanValue -> ^( VALUE booleanValue ) | numberValue -> ^( VALUE numberValue ) | objectIdentifierValue -> ^( VALUE objectIdentifierValue ) )
			int alt18 = 3;
			switch (input.LA(1)) {
				case 111:
				case 145: {
					alt18 = 1;
				}
				break;
				case ID:
				case INT:
				case REAL_NUMBER:
				case 126:
				case 134: {
					alt18 = 2;
				}
				break;
				case 131: {
					alt18 = 3;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);

					throw nvae;

			}

			switch (alt18) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:172:3: booleanValue
				{
					pushFollow(FOLLOW_booleanValue_in_value839);
					booleanValue57 = booleanValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_booleanValue.add(booleanValue57.getTree());

					// AST REWRITE
					// elements: booleanValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 172:16: -> ^( VALUE booleanValue )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:172:19: ^( VALUE booleanValue )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(VALUE, "VALUE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_booleanValue.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:173:4: numberValue
				{
					pushFollow(FOLLOW_numberValue_in_value852);
					numberValue58 = numberValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_numberValue.add(numberValue58.getTree());

					// AST REWRITE
					// elements: numberValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 173:16: -> ^( VALUE numberValue )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:173:19: ^( VALUE numberValue )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(VALUE, "VALUE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_numberValue.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:174:4: objectIdentifierValue
				{
					pushFollow(FOLLOW_objectIdentifierValue_in_value865);
					objectIdentifierValue59 = objectIdentifierValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_objectIdentifierValue.add(objectIdentifierValue59.getTree());

					// AST REWRITE
					// elements: objectIdentifierValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 174:26: -> ^( VALUE objectIdentifierValue )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:174:29: ^( VALUE objectIdentifierValue )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(VALUE, "VALUE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_objectIdentifierValue.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class numberValue_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "numberValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:177:1: numberValue : ( 'PLUS-INFINITY' -> ^( NUMBER PLUS_INFINITY ) | 'MINUS-INFINITY' -> ^( NUMBER MINUS_INFINITY ) | ID -> ^( NUMBER ID ) | ( INT ) -> ^( NUMBER INT ) | REAL_NUMBER -> ^( NUMBER REAL_NUMBER ) );
	public final ASN1Parser.numberValue_return numberValue() throws RecognitionException {
		ASN1Parser.numberValue_return retval = new ASN1Parser.numberValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal60 = null;
		Token string_literal61 = null;
		Token ID62 = null;
		Token INT63 = null;
		Token REAL_NUMBER64 = null;

		CommonTree string_literal60_tree = null;
		CommonTree string_literal61_tree = null;
		CommonTree ID62_tree = null;
		CommonTree INT63_tree = null;
		CommonTree REAL_NUMBER64_tree = null;
		RewriteRuleTokenStream stream_134 = new RewriteRuleTokenStream(adaptor, "token 134");
		RewriteRuleTokenStream stream_126 = new RewriteRuleTokenStream(adaptor, "token 126");
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_REAL_NUMBER = new RewriteRuleTokenStream(adaptor, "token REAL_NUMBER");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:177:15: ( 'PLUS-INFINITY' -> ^( NUMBER PLUS_INFINITY ) | 'MINUS-INFINITY' -> ^( NUMBER MINUS_INFINITY ) | ID -> ^( NUMBER ID ) | ( INT ) -> ^( NUMBER INT ) | REAL_NUMBER -> ^( NUMBER REAL_NUMBER ) )
			int alt19 = 5;
			switch (input.LA(1)) {
				case 134: {
					alt19 = 1;
				}
				break;
				case 126: {
					alt19 = 2;
				}
				break;
				case ID: {
					alt19 = 3;
				}
				break;
				case INT: {
					alt19 = 4;
				}
				break;
				case REAL_NUMBER: {
					alt19 = 5;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);

					throw nvae;

			}

			switch (alt19) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:178:3: 'PLUS-INFINITY'
				{
					string_literal60 = (Token) match(input, 134, FOLLOW_134_in_numberValue886);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_134.add(string_literal60);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 178:19: -> ^( NUMBER PLUS_INFINITY )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:178:22: ^( NUMBER PLUS_INFINITY )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NUMBER, "NUMBER")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                (CommonTree) adaptor.create(PLUS_INFINITY, "PLUS_INFINITY")
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:179:4: 'MINUS-INFINITY'
				{
					string_literal61 = (Token) match(input, 126, FOLLOW_126_in_numberValue899);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_126.add(string_literal61);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 179:21: -> ^( NUMBER MINUS_INFINITY )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:179:24: ^( NUMBER MINUS_INFINITY )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NUMBER, "NUMBER")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                (CommonTree) adaptor.create(MINUS_INFINITY, "MINUS_INFINITY")
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:180:4: ID
				{
					ID62 = (Token) match(input, ID, FOLLOW_ID_in_numberValue912);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID62);


					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 180:7: -> ^( NUMBER ID )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:180:10: ^( NUMBER ID )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NUMBER, "NUMBER")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_ID.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:181:4: ( INT )
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:181:4: ( INT )
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:181:5: INT
					{
						INT63 = (Token) match(input, INT, FOLLOW_INT_in_numberValue926);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT63);


					}


					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 181:10: -> ^( NUMBER INT )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:181:13: ^( NUMBER INT )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NUMBER, "NUMBER")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_INT.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:182:4: REAL_NUMBER
				{
					REAL_NUMBER64 = (Token) match(input, REAL_NUMBER, FOLLOW_REAL_NUMBER_in_numberValue941);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_REAL_NUMBER.add(REAL_NUMBER64);


					// AST REWRITE
					// elements: REAL_NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 182:16: -> ^( NUMBER REAL_NUMBER )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:182:19: ^( NUMBER REAL_NUMBER )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(NUMBER, "NUMBER")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_REAL_NUMBER.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numberValue"


	public static class objectIdentifierValue_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "objectIdentifierValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:184:1: objectIdentifierValue : 'OID_VALUE' ;
	public final ASN1Parser.objectIdentifierValue_return objectIdentifierValue() throws RecognitionException {
		ASN1Parser.objectIdentifierValue_return retval = new ASN1Parser.objectIdentifierValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal65 = null;

		CommonTree string_literal65_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:184:24: ( 'OID_VALUE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:185:3: 'OID_VALUE'
			{
				root_0 = (CommonTree) adaptor.nil();


				string_literal65 = (Token) match(input, 131, FOLLOW_131_in_objectIdentifierValue960);
				if (state.failed) return retval;
				if (state.backtracking == 0) {
					string_literal65_tree =
					(CommonTree) adaptor.create(string_literal65)
					;
					adaptor.addChild(root_0, string_literal65_tree);
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objectIdentifierValue"


	public static class booleanValue_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "booleanValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:187:1: booleanValue : ( 'TRUE' -> ^( TRUE ) | 'FALSE' -> ^( FALSE ) );
	public final ASN1Parser.booleanValue_return booleanValue() throws RecognitionException {
		ASN1Parser.booleanValue_return retval = new ASN1Parser.booleanValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal66 = null;
		Token string_literal67 = null;

		CommonTree string_literal66_tree = null;
		CommonTree string_literal67_tree = null;
		RewriteRuleTokenStream stream_145 = new RewriteRuleTokenStream(adaptor, "token 145");
		RewriteRuleTokenStream stream_111 = new RewriteRuleTokenStream(adaptor, "token 111");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:187:13: ( 'TRUE' -> ^( TRUE ) | 'FALSE' -> ^( FALSE ) )
			int alt20 = 2;
			int LA20_0 = input.LA(1);

			if ((LA20_0 == 145)) {
				alt20 = 1;
			} else if ((LA20_0 == 111)) {
				alt20 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 20, 0, input);

				throw nvae;

			}
			switch (alt20) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:188:3: 'TRUE'
				{
					string_literal66 = (Token) match(input, 145, FOLLOW_145_in_booleanValue969);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_145.add(string_literal66);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 188:10: -> ^( TRUE )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:188:13: ^( TRUE )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TRUE, "TRUE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:189:4: 'FALSE'
				{
					string_literal67 = (Token) match(input, 111, FOLLOW_111_in_booleanValue980);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_111.add(string_literal67);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 189:12: -> ^( FALSE )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:189:15: ^( FALSE )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(FALSE, "FALSE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanValue"


	public static class typeAssignment_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "typeAssignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:191:1: typeAssignment : ( CLASS_DEF )? ID '::=' type -> ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type ) ;
	public final ASN1Parser.typeAssignment_return typeAssignment() throws RecognitionException {
		ASN1Parser.typeAssignment_return retval = new ASN1Parser.typeAssignment_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token CLASS_DEF68 = null;
		Token ID69 = null;
		Token string_literal70 = null;
		ASN1Parser.type_return type71 = null;


		CommonTree CLASS_DEF68_tree = null;
		CommonTree ID69_tree = null;
		CommonTree string_literal70_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_CLASS_DEF = new RewriteRuleTokenStream(adaptor, "token CLASS_DEF");
		RewriteRuleTokenStream stream_88 = new RewriteRuleTokenStream(adaptor, "token 88");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:191:18: ( ( CLASS_DEF )? ID '::=' type -> ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:192:3: ( CLASS_DEF )? ID '::=' type
			{
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:192:3: ( CLASS_DEF )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);

				if ((LA21_0 == CLASS_DEF)) {
					alt21 = 1;
				}
				switch (alt21) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:192:3: CLASS_DEF
					{
						CLASS_DEF68 = (Token) match(input, CLASS_DEF, FOLLOW_CLASS_DEF_in_typeAssignment998);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_CLASS_DEF.add(CLASS_DEF68);


					}
					break;

				}


				ID69 = (Token) match(input, ID, FOLLOW_ID_in_typeAssignment1001);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID69);


				string_literal70 = (Token) match(input, 88, FOLLOW_88_in_typeAssignment1003);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_88.add(string_literal70);


				pushFollow(FOLLOW_type_in_typeAssignment1005);
				type71 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type71.getTree());

				// AST REWRITE
				// elements: ID, type, CLASS_DEF
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 192:28: -> ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:192:31: ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(TYPE_ASSIGNMENT, "TYPE_ASSIGNMENT")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:192:52: ( CLASS_DEF )?
							if (stream_CLASS_DEF.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_CLASS_DEF.nextNode()
								                );

							}
							stream_CLASS_DEF.reset();

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeAssignment"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "type"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:194:1: type : ( booleanType -> ^( TYPE booleanType ) | realType -> ^( TYPE realType ) | integerType -> ^( TYPE integerType ) | taggedType -> ^( TYPE taggedType ) | ( 'SEQUENCE' ( constraint )? 'OF' )=> sequenceOfType -> ^( TYPE sequenceOfType ) | sequenceType -> ^( TYPE sequenceType ) | ( 'SET' ( constraint )? 'OF' )=> setOfType -> ^( TYPE setOfType ) | setType -> ^( TYPE setType ) | choiceType -> ^( TYPE choiceType ) | 'OBJECT' 'IDENTIFIER' -> ^( TYPE OID ) | characterStringType -> ^( TYPE characterStringType ) | bitStringType -> ^( TYPE bitStringType ) | enumeratedType -> ^( TYPE enumeratedType ) | 'OCTET' 'STRING' ( constraint )? -> ^( TYPE OCTET_STRING ( constraint )? ) | definedType -> ^( TYPE definedType ) | selectionType -> ^( TYPE selectionType ) );
	public final ASN1Parser.type_return type() throws RecognitionException {
		ASN1Parser.type_return retval = new ASN1Parser.type_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal81 = null;
		Token string_literal82 = null;
		Token string_literal86 = null;
		Token string_literal87 = null;
		ASN1Parser.booleanType_return booleanType72 = null;

		ASN1Parser.realType_return realType73 = null;

		ASN1Parser.integerType_return integerType74 = null;

		ASN1Parser.taggedType_return taggedType75 = null;

		ASN1Parser.sequenceOfType_return sequenceOfType76 = null;

		ASN1Parser.sequenceType_return sequenceType77 = null;

		ASN1Parser.setOfType_return setOfType78 = null;

		ASN1Parser.setType_return setType79 = null;

		ASN1Parser.choiceType_return choiceType80 = null;

		ASN1Parser.characterStringType_return characterStringType83 = null;

		ASN1Parser.bitStringType_return bitStringType84 = null;

		ASN1Parser.enumeratedType_return enumeratedType85 = null;

		ASN1Parser.constraint_return constraint88 = null;

		ASN1Parser.definedType_return definedType89 = null;

		ASN1Parser.selectionType_return selectionType90 = null;


		CommonTree string_literal81_tree = null;
		CommonTree string_literal82_tree = null;
		CommonTree string_literal86_tree = null;
		CommonTree string_literal87_tree = null;
		RewriteRuleTokenStream stream_116 = new RewriteRuleTokenStream(adaptor, "token 116");
		RewriteRuleTokenStream stream_128 = new RewriteRuleTokenStream(adaptor, "token 128");
		RewriteRuleTokenStream stream_129 = new RewriteRuleTokenStream(adaptor, "token 129");
		RewriteRuleTokenStream stream_142 = new RewriteRuleTokenStream(adaptor, "token 142");
		RewriteRuleSubtreeStream stream_taggedType = new RewriteRuleSubtreeStream(adaptor, "rule taggedType");
		RewriteRuleSubtreeStream stream_choiceType = new RewriteRuleSubtreeStream(adaptor, "rule choiceType");
		RewriteRuleSubtreeStream stream_booleanType = new RewriteRuleSubtreeStream(adaptor, "rule booleanType");
		RewriteRuleSubtreeStream stream_enumeratedType = new RewriteRuleSubtreeStream(adaptor, "rule enumeratedType");
		RewriteRuleSubtreeStream stream_sequenceOfType = new RewriteRuleSubtreeStream(adaptor, "rule sequenceOfType");
		RewriteRuleSubtreeStream stream_bitStringType = new RewriteRuleSubtreeStream(adaptor, "rule bitStringType");
		RewriteRuleSubtreeStream stream_setType = new RewriteRuleSubtreeStream(adaptor, "rule setType");
		RewriteRuleSubtreeStream stream_sequenceType = new RewriteRuleSubtreeStream(adaptor, "rule sequenceType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_characterStringType = new RewriteRuleSubtreeStream(adaptor, "rule characterStringType");
		RewriteRuleSubtreeStream stream_setOfType = new RewriteRuleSubtreeStream(adaptor, "rule setOfType");
		RewriteRuleSubtreeStream stream_selectionType = new RewriteRuleSubtreeStream(adaptor, "rule selectionType");
		RewriteRuleSubtreeStream stream_realType = new RewriteRuleSubtreeStream(adaptor, "rule realType");
		RewriteRuleSubtreeStream stream_definedType = new RewriteRuleSubtreeStream(adaptor, "rule definedType");
		RewriteRuleSubtreeStream stream_integerType = new RewriteRuleSubtreeStream(adaptor, "rule integerType");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:194:9: ( booleanType -> ^( TYPE booleanType ) | realType -> ^( TYPE realType ) | integerType -> ^( TYPE integerType ) | taggedType -> ^( TYPE taggedType ) | ( 'SEQUENCE' ( constraint )? 'OF' )=> sequenceOfType -> ^( TYPE sequenceOfType ) | sequenceType -> ^( TYPE sequenceType ) | ( 'SET' ( constraint )? 'OF' )=> setOfType -> ^( TYPE setOfType ) | setType -> ^( TYPE setType ) | choiceType -> ^( TYPE choiceType ) | 'OBJECT' 'IDENTIFIER' -> ^( TYPE OID ) | characterStringType -> ^( TYPE characterStringType ) | bitStringType -> ^( TYPE bitStringType ) | enumeratedType -> ^( TYPE enumeratedType ) | 'OCTET' 'STRING' ( constraint )? -> ^( TYPE OCTET_STRING ( constraint )? ) | definedType -> ^( TYPE definedType ) | selectionType -> ^( TYPE selectionType ) )
			int alt23 = 16;
			switch (input.LA(1)) {
				case 98: {
					alt23 = 1;
				}
				break;
				case 138: {
					alt23 = 2;
				}
				break;
				case 121: {
					alt23 = 3;
				}
				break;
				case 154: {
					alt23 = 4;
				}
				break;
				case 139: {
					int LA23_5 = input.LA(2);

					if ((LA23_5 == 159)) {
						alt23 = 6;
					} else if ((LA23_5 == 81) && (synpred2_ASN1())) {
						alt23 = 5;
					} else if ((LA23_5 == 130) && (synpred2_ASN1())) {
						alt23 = 5;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 23, 5, input);

						throw nvae;

					}
				}
				break;
				case 140: {
					int LA23_6 = input.LA(2);

					if ((LA23_6 == 159)) {
						alt23 = 8;
					} else if ((LA23_6 == 81) && (synpred3_ASN1())) {
						alt23 = 7;
					} else if ((LA23_6 == 130) && (synpred3_ASN1())) {
						alt23 = 7;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 23, 6, input);

						throw nvae;

					}
				}
				break;
				case 100: {
					alt23 = 9;
				}
				break;
				case 128: {
					alt23 = 10;
				}
				break;
				case 99: {
					alt23 = 11;
				}
				break;
				case 96: {
					alt23 = 12;
				}
				break;
				case 106: {
					alt23 = 13;
				}
				break;
				case 129: {
					alt23 = 14;
				}
				break;
				case ID: {
					int LA23_13 = input.LA(2);

					if ((LA23_13 == CLASS_DEF || LA23_13 == ID || (LA23_13 >= 80 && LA23_13 <= 84) || (LA23_13 >= 87 && LA23_13 <= 89) || (LA23_13
					                                                                                                                       >= 96
					                                                                                                                       && LA23_13
					                                                                                                                          <= 100)
					     || LA23_13 == 103 || (LA23_13 >= 105 && LA23_13 <= 107) || (LA23_13 >= 113 && LA23_13 <= 115) || (LA23_13 >= 121
					                                                                                                       && LA23_13 <= 123) || (
					                                                                                                                             LA23_13
					                                                                                                                             >= 127
					                                                                                                                             &&
					                                                                                                                             LA23_13
					                                                                                                                             <= 129)
					     || LA23_13 == 132 || (LA23_13 >= 137 && LA23_13 <= 140) || LA23_13 == 143 || (LA23_13 >= 146 && LA23_13 <= 147) || (LA23_13
					                                                                                                                         >= 149 &&
					                                                                                                                         LA23_13
					                                                                                                                         <= 152)
					     || LA23_13 == 154 || (LA23_13 >= 157 && LA23_13 <= 158) || (LA23_13 >= 160 && LA23_13 <= 161))) {
						alt23 = 15;
					} else if ((LA23_13 == 90)) {
						alt23 = 16;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 23, 13, input);

						throw nvae;

					}
				}
				break;
				case CLASS_DEF:
				case 80:
				case 81:
				case 82:
				case 83:
				case 87:
				case 88:
				case 89:
				case 97:
				case 103:
				case 105:
				case 107:
				case 113:
				case 114:
				case 115:
				case 122:
				case 123:
				case 127:
				case 132:
				case 137:
				case 143:
				case 146:
				case 147:
				case 149:
				case 150:
				case 151:
				case 152:
				case 157:
				case 158:
				case 160:
				case 161: {
					alt23 = 15;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);

					throw nvae;

			}

			switch (alt23) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:195:3: booleanType
				{
					pushFollow(FOLLOW_booleanType_in_type1031);
					booleanType72 = booleanType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_booleanType.add(booleanType72.getTree());

					// AST REWRITE
					// elements: booleanType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 195:15: -> ^( TYPE booleanType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:195:18: ^( TYPE booleanType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_booleanType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:196:4: realType
				{
					pushFollow(FOLLOW_realType_in_type1044);
					realType73 = realType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_realType.add(realType73.getTree());

					// AST REWRITE
					// elements: realType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 196:13: -> ^( TYPE realType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:196:16: ^( TYPE realType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_realType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:197:4: integerType
				{
					pushFollow(FOLLOW_integerType_in_type1057);
					integerType74 = integerType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_integerType.add(integerType74.getTree());

					// AST REWRITE
					// elements: integerType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 197:16: -> ^( TYPE integerType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:197:19: ^( TYPE integerType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_integerType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:198:4: taggedType
				{
					pushFollow(FOLLOW_taggedType_in_type1070);
					taggedType75 = taggedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_taggedType.add(taggedType75.getTree());

					// AST REWRITE
					// elements: taggedType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 198:15: -> ^( TYPE taggedType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:198:18: ^( TYPE taggedType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_taggedType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:199:4: ( 'SEQUENCE' ( constraint )? 'OF' )=> sequenceOfType
				{
					pushFollow(FOLLOW_sequenceOfType_in_type1095);
					sequenceOfType76 = sequenceOfType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_sequenceOfType.add(sequenceOfType76.getTree());

					// AST REWRITE
					// elements: sequenceOfType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 199:53: -> ^( TYPE sequenceOfType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:199:56: ^( TYPE sequenceOfType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_sequenceOfType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 6:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:200:4: sequenceType
				{
					pushFollow(FOLLOW_sequenceType_in_type1108);
					sequenceType77 = sequenceType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_sequenceType.add(sequenceType77.getTree());

					// AST REWRITE
					// elements: sequenceType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 200:17: -> ^( TYPE sequenceType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:200:20: ^( TYPE sequenceType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_sequenceType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 7:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:201:4: ( 'SET' ( constraint )? 'OF' )=> setOfType
				{
					pushFollow(FOLLOW_setOfType_in_type1132);
					setOfType78 = setOfType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_setOfType.add(setOfType78.getTree());

					// AST REWRITE
					// elements: setOfType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 201:42: -> ^( TYPE setOfType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:201:45: ^( TYPE setOfType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_setOfType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 8:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:202:4: setType
				{
					pushFollow(FOLLOW_setType_in_type1145);
					setType79 = setType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_setType.add(setType79.getTree());

					// AST REWRITE
					// elements: setType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 202:12: -> ^( TYPE setType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:202:15: ^( TYPE setType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_setType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 9:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:203:4: choiceType
				{
					pushFollow(FOLLOW_choiceType_in_type1158);
					choiceType80 = choiceType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_choiceType.add(choiceType80.getTree());

					// AST REWRITE
					// elements: choiceType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 203:15: -> ^( TYPE choiceType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:203:18: ^( TYPE choiceType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_choiceType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 10:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:204:4: 'OBJECT' 'IDENTIFIER'
				{
					string_literal81 = (Token) match(input, 128, FOLLOW_128_in_type1171);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_128.add(string_literal81);


					string_literal82 = (Token) match(input, 116, FOLLOW_116_in_type1173);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_116.add(string_literal82);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 204:26: -> ^( TYPE OID )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:204:29: ^( TYPE OID )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                (CommonTree) adaptor.create(OID, "OID")
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 11:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:205:4: characterStringType
				{
					pushFollow(FOLLOW_characterStringType_in_type1186);
					characterStringType83 = characterStringType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_characterStringType.add(characterStringType83.getTree());

					// AST REWRITE
					// elements: characterStringType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 205:24: -> ^( TYPE characterStringType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:205:27: ^( TYPE characterStringType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_characterStringType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 12:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:206:4: bitStringType
				{
					pushFollow(FOLLOW_bitStringType_in_type1199);
					bitStringType84 = bitStringType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_bitStringType.add(bitStringType84.getTree());

					// AST REWRITE
					// elements: bitStringType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 206:18: -> ^( TYPE bitStringType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:206:21: ^( TYPE bitStringType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_bitStringType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 13:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:207:4: enumeratedType
				{
					pushFollow(FOLLOW_enumeratedType_in_type1212);
					enumeratedType85 = enumeratedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_enumeratedType.add(enumeratedType85.getTree());

					// AST REWRITE
					// elements: enumeratedType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 207:19: -> ^( TYPE enumeratedType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:207:22: ^( TYPE enumeratedType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_enumeratedType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 14:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:208:4: 'OCTET' 'STRING' ( constraint )?
				{
					string_literal86 = (Token) match(input, 129, FOLLOW_129_in_type1225);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_129.add(string_literal86);


					string_literal87 = (Token) match(input, 142, FOLLOW_142_in_type1227);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_142.add(string_literal87);


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:208:21: ( constraint )?
					int alt22 = 2;
					int LA22_0 = input.LA(1);

					if ((LA22_0 == 81)) {
						alt22 = 1;
					}
					switch (alt22) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:208:21: constraint
						{
							pushFollow(FOLLOW_constraint_in_type1229);
							constraint88 = constraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_constraint.add(constraint88.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: constraint
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 208:32: -> ^( TYPE OCTET_STRING ( constraint )? )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:208:35: ^( TYPE OCTET_STRING ( constraint )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                (CommonTree) adaptor.create(OCTET_STRING, "OCTET_STRING")
								                );

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:208:55: ( constraint )?
								if (stream_constraint.hasNext()) {
									adaptor.addChild(root_1, stream_constraint.nextTree());

								}
								stream_constraint.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 15:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:209:4: definedType
				{
					pushFollow(FOLLOW_definedType_in_type1245);
					definedType89 = definedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_definedType.add(definedType89.getTree());

					// AST REWRITE
					// elements: definedType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 209:16: -> ^( TYPE definedType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:209:19: ^( TYPE definedType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_definedType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 16:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:210:4: selectionType
				{
					pushFollow(FOLLOW_selectionType_in_type1258);
					selectionType90 = selectionType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_selectionType.add(selectionType90.getTree());

					// AST REWRITE
					// elements: selectionType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 210:18: -> ^( TYPE selectionType )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:210:21: ^( TYPE selectionType )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE, "TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_selectionType.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class definedType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "definedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:213:1: definedType : ( ( ID '.' )? ID ( constraint )? -> ^( TYPE_REFERENCE ID ( ID )? ( constraint )? ) | restrictedStringType ( constraint )? -> ^( CSTRING restrictedStringType ( constraint )? ) );
	public final ASN1Parser.definedType_return definedType() throws RecognitionException {
		ASN1Parser.definedType_return retval = new ASN1Parser.definedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID91 = null;
		Token char_literal92 = null;
		Token ID93 = null;
		ASN1Parser.constraint_return constraint94 = null;

		ASN1Parser.restrictedStringType_return restrictedStringType95 = null;

		ASN1Parser.constraint_return constraint96 = null;


		CommonTree ID91_tree = null;
		CommonTree char_literal92_tree = null;
		CommonTree ID93_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_84 = new RewriteRuleTokenStream(adaptor, "token 84");
		RewriteRuleSubtreeStream stream_restrictedStringType = new RewriteRuleSubtreeStream(adaptor, "rule restrictedStringType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:213:15: ( ( ID '.' )? ID ( constraint )? -> ^( TYPE_REFERENCE ID ( ID )? ( constraint )? ) | restrictedStringType ( constraint )? -> ^( CSTRING restrictedStringType ( constraint )? ) )
			int alt27 = 2;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == ID)) {
				alt27 = 1;
			} else if ((LA27_0 == CLASS_DEF || (LA27_0 >= 80 && LA27_0 <= 83) || (LA27_0 >= 87 && LA27_0 <= 89) || LA27_0 == 97 || LA27_0 == 103
			            || LA27_0 == 105 || LA27_0 == 107 || (LA27_0 >= 113 && LA27_0 <= 115) || (LA27_0 >= 122 && LA27_0 <= 123) || LA27_0 == 127
			            || LA27_0 == 132 || LA27_0 == 137 || LA27_0 == 143 || (LA27_0 >= 146 && LA27_0 <= 147) || (LA27_0 >= 149 && LA27_0 <= 152)
			            || (LA27_0 >= 157 && LA27_0 <= 158) || (LA27_0 >= 160 && LA27_0 <= 161))) {
				alt27 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 27, 0, input);

				throw nvae;

			}
			switch (alt27) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:3: ( ID '.' )? ID ( constraint )?
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:3: ( ID '.' )?
					int alt24 = 2;
					int LA24_0 = input.LA(1);

					if ((LA24_0 == ID)) {
						int LA24_1 = input.LA(2);

						if ((LA24_1 == 84)) {
							alt24 = 1;
						}
					}
					switch (alt24) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:4: ID '.'
						{
							ID91 = (Token) match(input, ID, FOLLOW_ID_in_definedType1280);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_ID.add(ID91);


							char_literal92 = (Token) match(input, 84, FOLLOW_84_in_definedType1282);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_84.add(char_literal92);


						}
						break;

					}


					ID93 = (Token) match(input, ID, FOLLOW_ID_in_definedType1286);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID93);


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:16: ( constraint )?
					int alt25 = 2;
					int LA25_0 = input.LA(1);

					if ((LA25_0 == 81)) {
						alt25 = 1;
					}
					switch (alt25) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:16: constraint
						{
							pushFollow(FOLLOW_constraint_in_definedType1288);
							constraint94 = constraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_constraint.add(constraint94.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: ID, constraint, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 214:28: -> ^( TYPE_REFERENCE ID ( ID )? ( constraint )? )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:31: ^( TYPE_REFERENCE ID ( ID )? ( constraint )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(TYPE_REFERENCE, "TYPE_REFERENCE")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_ID.nextNode()
								                );

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:51: ( ID )?
								if (stream_ID.hasNext()) {
									adaptor.addChild(
									                root_1,
									                stream_ID.nextNode()
									                );

								}
								stream_ID.reset();

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:214:55: ( constraint )?
								if (stream_constraint.hasNext()) {
									adaptor.addChild(root_1, stream_constraint.nextTree());

								}
								stream_constraint.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:215:5: restrictedStringType ( constraint )?
				{
					pushFollow(FOLLOW_restrictedStringType_in_definedType1309);
					restrictedStringType95 = restrictedStringType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_restrictedStringType.add(restrictedStringType95.getTree());

					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:215:26: ( constraint )?
					int alt26 = 2;
					int LA26_0 = input.LA(1);

					if ((LA26_0 == 81)) {
						alt26 = 1;
					}
					switch (alt26) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:215:26: constraint
						{
							pushFollow(FOLLOW_constraint_in_definedType1311);
							constraint96 = constraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_constraint.add(constraint96.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: constraint, restrictedStringType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 215:38: -> ^( CSTRING restrictedStringType ( constraint )? )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:215:41: ^( CSTRING restrictedStringType ( constraint )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(CSTRING, "CSTRING")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_restrictedStringType.nextTree());

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:215:72: ( constraint )?
								if (stream_constraint.hasNext()) {
									adaptor.addChild(root_1, stream_constraint.nextTree());

								}
								stream_constraint.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definedType"


	public static class selectionType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "selectionType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:217:1: selectionType : ID '<' type -> ^( SELECTION_TYPE ID type ) ;
	public final ASN1Parser.selectionType_return selectionType() throws RecognitionException {
		ASN1Parser.selectionType_return retval = new ASN1Parser.selectionType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID97 = null;
		Token char_literal98 = null;
		ASN1Parser.type_return type99 = null;


		CommonTree ID97_tree = null;
		CommonTree char_literal98_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_90 = new RewriteRuleTokenStream(adaptor, "token 90");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:217:17: ( ID '<' type -> ^( SELECTION_TYPE ID type ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:218:3: ID '<' type
			{
				ID97 = (Token) match(input, ID, FOLLOW_ID_in_selectionType1335);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID97);


				char_literal98 = (Token) match(input, 90, FOLLOW_90_in_selectionType1337);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_90.add(char_literal98);


				pushFollow(FOLLOW_type_in_selectionType1339);
				type99 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type99.getTree());

				// AST REWRITE
				// elements: type, ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 218:15: -> ^( SELECTION_TYPE ID type )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:218:18: ^( SELECTION_TYPE ID type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SELECTION_TYPE, "SELECTION_TYPE")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectionType"


	public static class enumeratedType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "enumeratedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:220:1: enumeratedType : 'ENUMERATED' '{' enumerations '}' -> ^( ENUMERATION enumerations ) ;
	public final ASN1Parser.enumeratedType_return enumeratedType() throws RecognitionException {
		ASN1Parser.enumeratedType_return retval = new ASN1Parser.enumeratedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal100 = null;
		Token char_literal101 = null;
		Token char_literal103 = null;
		ASN1Parser.enumerations_return enumerations102 = null;


		CommonTree string_literal100_tree = null;
		CommonTree char_literal101_tree = null;
		CommonTree char_literal103_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_106 = new RewriteRuleTokenStream(adaptor, "token 106");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_enumerations = new RewriteRuleSubtreeStream(adaptor, "rule enumerations");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:220:18: ( 'ENUMERATED' '{' enumerations '}' -> ^( ENUMERATION enumerations ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:221:3: 'ENUMERATED' '{' enumerations '}'
			{
				string_literal100 = (Token) match(input, 106, FOLLOW_106_in_enumeratedType1361);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_106.add(string_literal100);


				char_literal101 = (Token) match(input, 159, FOLLOW_159_in_enumeratedType1363);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal101);


				pushFollow(FOLLOW_enumerations_in_enumeratedType1365);
				enumerations102 = enumerations();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_enumerations.add(enumerations102.getTree());

				char_literal103 = (Token) match(input, 161, FOLLOW_161_in_enumeratedType1367);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal103);


				// AST REWRITE
				// elements: enumerations
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 222:3: -> ^( ENUMERATION enumerations )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:222:6: ^( ENUMERATION enumerations )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(ENUMERATION, "ENUMERATION")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_enumerations.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumeratedType"


	public static class enumerations_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "enumerations"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:224:1: enumerations : enumerationItem ( ',' enumerationItem )* -> ^( VEC ( enumerationItem )+ ) ;
	public final ASN1Parser.enumerations_return enumerations() throws RecognitionException {
		ASN1Parser.enumerations_return retval = new ASN1Parser.enumerations_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal105 = null;
		ASN1Parser.enumerationItem_return enumerationItem104 = null;

		ASN1Parser.enumerationItem_return enumerationItem106 = null;


		CommonTree char_literal105_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_enumerationItem = new RewriteRuleSubtreeStream(adaptor, "rule enumerationItem");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:224:16: ( enumerationItem ( ',' enumerationItem )* -> ^( VEC ( enumerationItem )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:225:3: enumerationItem ( ',' enumerationItem )*
			{
				pushFollow(FOLLOW_enumerationItem_in_enumerations1389);
				enumerationItem104 = enumerationItem();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_enumerationItem.add(enumerationItem104.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:225:19: ( ',' enumerationItem )*
				loop28:
				do {
					int alt28 = 2;
					int LA28_0 = input.LA(1);

					if ((LA28_0 == 83)) {
						alt28 = 1;
					}


					switch (alt28) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:225:20: ',' enumerationItem
						{
							char_literal105 = (Token) match(input, 83, FOLLOW_83_in_enumerations1392);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal105);


							pushFollow(FOLLOW_enumerationItem_in_enumerations1394);
							enumerationItem106 = enumerationItem();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_enumerationItem.add(enumerationItem106.getTree());

						}
						break;

						default:
							break loop28;
					}
				} while (true);


				// AST REWRITE
				// elements: enumerationItem
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 225:42: -> ^( VEC ( enumerationItem )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:225:45: ^( VEC ( enumerationItem )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_enumerationItem.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_enumerationItem.hasNext()) {
								adaptor.addChild(root_1, stream_enumerationItem.nextTree());

							}
							stream_enumerationItem.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerations"


	public static class enumerationItem_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "enumerationItem"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:227:1: enumerationItem : ( ( namedNumber )=> namedNumber | ID -> ^( ENUMERATION_ITEM ID ) );
	public final ASN1Parser.enumerationItem_return enumerationItem() throws RecognitionException {
		ASN1Parser.enumerationItem_return retval = new ASN1Parser.enumerationItem_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID108 = null;
		ASN1Parser.namedNumber_return namedNumber107 = null;


		CommonTree ID108_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:227:19: ( ( namedNumber )=> namedNumber | ID -> ^( ENUMERATION_ITEM ID ) )
			int alt29 = 2;
			int LA29_0 = input.LA(1);

			if ((LA29_0 == ID)) {
				int LA29_1 = input.LA(2);

				if ((LA29_1 == 81) && (synpred4_ASN1())) {
					alt29 = 1;
				} else if ((LA29_1 == 83 || LA29_1 == 161)) {
					alt29 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 29, 1, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 29, 0, input);

				throw nvae;

			}
			switch (alt29) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:228:3: ( namedNumber )=> namedNumber
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_namedNumber_in_enumerationItem1423);
					namedNumber107 = namedNumber();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, namedNumber107.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:229:4: ID
				{
					ID108 = (Token) match(input, ID, FOLLOW_ID_in_enumerationItem1428);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID108);


					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 229:7: -> ^( ENUMERATION_ITEM ID )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:229:10: ^( ENUMERATION_ITEM ID )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(ENUMERATION_ITEM, "ENUMERATION_ITEM")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_ID.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationItem"


	public static class bitStringType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "bitStringType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:231:1: bitStringType : 'BIT' 'STRING' ( namedBitList )? -> ^( BIT_STRING namedBitList ) ;
	public final ASN1Parser.bitStringType_return bitStringType() throws RecognitionException {
		ASN1Parser.bitStringType_return retval = new ASN1Parser.bitStringType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal109 = null;
		Token string_literal110 = null;
		ASN1Parser.namedBitList_return namedBitList111 = null;


		CommonTree string_literal109_tree = null;
		CommonTree string_literal110_tree = null;
		RewriteRuleTokenStream stream_96 = new RewriteRuleTokenStream(adaptor, "token 96");
		RewriteRuleTokenStream stream_142 = new RewriteRuleTokenStream(adaptor, "token 142");
		RewriteRuleSubtreeStream stream_namedBitList = new RewriteRuleSubtreeStream(adaptor, "rule namedBitList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:231:17: ( 'BIT' 'STRING' ( namedBitList )? -> ^( BIT_STRING namedBitList ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:232:3: 'BIT' 'STRING' ( namedBitList )?
			{
				string_literal109 = (Token) match(input, 96, FOLLOW_96_in_bitStringType1448);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_96.add(string_literal109);


				string_literal110 = (Token) match(input, 142, FOLLOW_142_in_bitStringType1450);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_142.add(string_literal110);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:232:18: ( namedBitList )?
				int alt30 = 2;
				int LA30_0 = input.LA(1);

				if ((LA30_0 == 159)) {
					alt30 = 1;
				}
				switch (alt30) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:232:18: namedBitList
					{
						pushFollow(FOLLOW_namedBitList_in_bitStringType1452);
						namedBitList111 = namedBitList();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_namedBitList.add(namedBitList111.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: namedBitList
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 232:32: -> ^( BIT_STRING namedBitList )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:232:35: ^( BIT_STRING namedBitList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(BIT_STRING, "BIT_STRING")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_namedBitList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitStringType"


	public static class namedBitList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "namedBitList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:234:1: namedBitList : '{' nameNumberForm ( ',' nameNumberForm )* '}' -> ^( VEC ( nameNumberForm )+ ) ;
	public final ASN1Parser.namedBitList_return namedBitList() throws RecognitionException {
		ASN1Parser.namedBitList_return retval = new ASN1Parser.namedBitList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal112 = null;
		Token char_literal114 = null;
		Token char_literal116 = null;
		ASN1Parser.nameNumberForm_return nameNumberForm113 = null;

		ASN1Parser.nameNumberForm_return nameNumberForm115 = null;


		CommonTree char_literal112_tree = null;
		CommonTree char_literal114_tree = null;
		CommonTree char_literal116_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_nameNumberForm = new RewriteRuleSubtreeStream(adaptor, "rule nameNumberForm");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:234:16: ( '{' nameNumberForm ( ',' nameNumberForm )* '}' -> ^( VEC ( nameNumberForm )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:235:3: '{' nameNumberForm ( ',' nameNumberForm )* '}'
			{
				char_literal112 = (Token) match(input, 159, FOLLOW_159_in_namedBitList1473);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal112);


				pushFollow(FOLLOW_nameNumberForm_in_namedBitList1475);
				nameNumberForm113 = nameNumberForm();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_nameNumberForm.add(nameNumberForm113.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:235:22: ( ',' nameNumberForm )*
				loop31:
				do {
					int alt31 = 2;
					int LA31_0 = input.LA(1);

					if ((LA31_0 == 83)) {
						alt31 = 1;
					}


					switch (alt31) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:235:23: ',' nameNumberForm
						{
							char_literal114 = (Token) match(input, 83, FOLLOW_83_in_namedBitList1478);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal114);


							pushFollow(FOLLOW_nameNumberForm_in_namedBitList1480);
							nameNumberForm115 = nameNumberForm();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_nameNumberForm.add(nameNumberForm115.getTree());

						}
						break;

						default:
							break loop31;
					}
				} while (true);


				char_literal116 = (Token) match(input, 161, FOLLOW_161_in_namedBitList1484);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal116);


				// AST REWRITE
				// elements: nameNumberForm
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 236:3: -> ^( VEC ( nameNumberForm )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:236:6: ^( VEC ( nameNumberForm )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_nameNumberForm.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_nameNumberForm.hasNext()) {
								adaptor.addChild(root_1, stream_nameNumberForm.nextTree());

							}
							stream_nameNumberForm.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedBitList"


	public static class nameNumberForm_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "nameNumberForm"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:239:1: nameNumberForm : ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) ;
	public final ASN1Parser.nameNumberForm_return nameNumberForm() throws RecognitionException {
		ASN1Parser.nameNumberForm_return retval = new ASN1Parser.nameNumberForm_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID117 = null;
		Token char_literal118 = null;
		Token INT119 = null;
		Token char_literal120 = null;

		CommonTree ID117_tree = null;
		CommonTree char_literal118_tree = null;
		CommonTree INT119_tree = null;
		CommonTree char_literal120_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:239:18: ( ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:240:3: ID '(' INT ')'
			{
				ID117 = (Token) match(input, ID, FOLLOW_ID_in_nameNumberForm1508);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID117);


				char_literal118 = (Token) match(input, 81, FOLLOW_81_in_nameNumberForm1510);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_81.add(char_literal118);


				INT119 = (Token) match(input, INT, FOLLOW_INT_in_nameNumberForm1512);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_INT.add(INT119);


				char_literal120 = (Token) match(input, 82, FOLLOW_82_in_nameNumberForm1514);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_82.add(char_literal120);


				// AST REWRITE
				// elements: ID, INT
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 240:18: -> ^( NAME_NUMBER_FORM ID INT )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:240:21: ^( NAME_NUMBER_FORM ID INT )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(NAME_NUMBER_FORM, "NAME_NUMBER_FORM")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(
							                root_1,
							                stream_INT.nextNode()
							                );

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameNumberForm"


	public static class characterStringType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "characterStringType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:242:1: characterStringType : 'CHARACTER' 'STRING' ( constraint )? -> ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? ) ;
	public final ASN1Parser.characterStringType_return characterStringType() throws RecognitionException {
		ASN1Parser.characterStringType_return retval = new ASN1Parser.characterStringType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal121 = null;
		Token string_literal122 = null;
		ASN1Parser.constraint_return constraint123 = null;


		CommonTree string_literal121_tree = null;
		CommonTree string_literal122_tree = null;
		RewriteRuleTokenStream stream_99 = new RewriteRuleTokenStream(adaptor, "token 99");
		RewriteRuleTokenStream stream_142 = new RewriteRuleTokenStream(adaptor, "token 142");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:242:22: ( 'CHARACTER' 'STRING' ( constraint )? -> ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:243:3: 'CHARACTER' 'STRING' ( constraint )?
			{
				string_literal121 = (Token) match(input, 99, FOLLOW_99_in_characterStringType1535);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_99.add(string_literal121);


				string_literal122 = (Token) match(input, 142, FOLLOW_142_in_characterStringType1537);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_142.add(string_literal122);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:243:24: ( constraint )?
				int alt32 = 2;
				int LA32_0 = input.LA(1);

				if ((LA32_0 == 81)) {
					alt32 = 1;
				}
				switch (alt32) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:243:24: constraint
					{
						pushFollow(FOLLOW_constraint_in_characterStringType1539);
						constraint123 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint123.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: constraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 243:35: -> ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:243:38: ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CSTRING, "CSTRING")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                (CommonTree) adaptor.create(UNRESTRICTED_CSTRING, "UNRESTRICTED_CSTRING")
							                );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:243:70: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "characterStringType"


	public static class restrictedStringType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "restrictedStringType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:246:1: restrictedStringType : (| 'BMPString' | 'GeneralString' | 'GraphicString' | 'IA5String' | 'ISO646String' | 'NumericString' | 'PrintableString' | 'TeletexString' | 'T61String' | 'UniversalString' | 'UTF8String' | 'VideotexString' | 'VisibleString' );
	public final ASN1Parser.restrictedStringType_return restrictedStringType() throws RecognitionException {
		ASN1Parser.restrictedStringType_return retval = new ASN1Parser.restrictedStringType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal124 = null;
		Token string_literal125 = null;
		Token string_literal126 = null;
		Token string_literal127 = null;
		Token string_literal128 = null;
		Token string_literal129 = null;
		Token string_literal130 = null;
		Token string_literal131 = null;
		Token string_literal132 = null;
		Token string_literal133 = null;
		Token string_literal134 = null;
		Token string_literal135 = null;
		Token string_literal136 = null;

		CommonTree string_literal124_tree = null;
		CommonTree string_literal125_tree = null;
		CommonTree string_literal126_tree = null;
		CommonTree string_literal127_tree = null;
		CommonTree string_literal128_tree = null;
		CommonTree string_literal129_tree = null;
		CommonTree string_literal130_tree = null;
		CommonTree string_literal131_tree = null;
		CommonTree string_literal132_tree = null;
		CommonTree string_literal133_tree = null;
		CommonTree string_literal134_tree = null;
		CommonTree string_literal135_tree = null;
		CommonTree string_literal136_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:247:2: (| 'BMPString' | 'GeneralString' | 'GraphicString' | 'IA5String' | 'ISO646String' | 'NumericString' | 'PrintableString' | 'TeletexString' | 'T61String' | 'UniversalString' | 'UTF8String' | 'VideotexString' | 'VisibleString' )
			int alt33 = 14;
			switch (input.LA(1)) {
				case CLASS_DEF:
				case ID:
				case 80:
				case 81:
				case 82:
				case 83:
				case 87:
				case 88:
				case 89:
				case 103:
				case 105:
				case 107:
				case 122:
				case 132:
				case 147:
				case 157:
				case 158:
				case 160:
				case 161: {
					alt33 = 1;
				}
				break;
				case 97: {
					alt33 = 2;
				}
				break;
				case 113: {
					alt33 = 3;
				}
				break;
				case 114: {
					alt33 = 4;
				}
				break;
				case 115: {
					alt33 = 5;
				}
				break;
				case 123: {
					alt33 = 6;
				}
				break;
				case 127: {
					alt33 = 7;
				}
				break;
				case 137: {
					alt33 = 8;
				}
				break;
				case 146: {
					alt33 = 9;
				}
				break;
				case 143: {
					alt33 = 10;
				}
				break;
				case 150: {
					alt33 = 11;
				}
				break;
				case 149: {
					alt33 = 12;
				}
				break;
				case 151: {
					alt33 = 13;
				}
				break;
				case 152: {
					alt33 = 14;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);

					throw nvae;

			}

			switch (alt33) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:248:2: 
				{
					root_0 = (CommonTree) adaptor.nil();


				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:248:4: 'BMPString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal124 = (Token) match(input, 97, FOLLOW_97_in_restrictedStringType1567);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal124_tree =
						(CommonTree) adaptor.create(string_literal124)
						;
						adaptor.addChild(root_0, string_literal124_tree);
					}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:249:4: 'GeneralString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal125 = (Token) match(input, 113, FOLLOW_113_in_restrictedStringType1572);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal125_tree =
						(CommonTree) adaptor.create(string_literal125)
						;
						adaptor.addChild(root_0, string_literal125_tree);
					}

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:250:4: 'GraphicString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal126 = (Token) match(input, 114, FOLLOW_114_in_restrictedStringType1577);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal126_tree =
						(CommonTree) adaptor.create(string_literal126)
						;
						adaptor.addChild(root_0, string_literal126_tree);
					}

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:251:4: 'IA5String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal127 = (Token) match(input, 115, FOLLOW_115_in_restrictedStringType1582);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal127_tree =
						(CommonTree) adaptor.create(string_literal127)
						;
						adaptor.addChild(root_0, string_literal127_tree);
					}

				}
				break;
				case 6:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:252:4: 'ISO646String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal128 = (Token) match(input, 123, FOLLOW_123_in_restrictedStringType1587);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal128_tree =
						(CommonTree) adaptor.create(string_literal128)
						;
						adaptor.addChild(root_0, string_literal128_tree);
					}

				}
				break;
				case 7:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:253:4: 'NumericString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal129 = (Token) match(input, 127, FOLLOW_127_in_restrictedStringType1592);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal129_tree =
						(CommonTree) adaptor.create(string_literal129)
						;
						adaptor.addChild(root_0, string_literal129_tree);
					}

				}
				break;
				case 8:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:254:4: 'PrintableString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal130 = (Token) match(input, 137, FOLLOW_137_in_restrictedStringType1597);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal130_tree =
						(CommonTree) adaptor.create(string_literal130)
						;
						adaptor.addChild(root_0, string_literal130_tree);
					}

				}
				break;
				case 9:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:255:4: 'TeletexString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal131 = (Token) match(input, 146, FOLLOW_146_in_restrictedStringType1602);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal131_tree =
						(CommonTree) adaptor.create(string_literal131)
						;
						adaptor.addChild(root_0, string_literal131_tree);
					}

				}
				break;
				case 10:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:256:4: 'T61String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal132 = (Token) match(input, 143, FOLLOW_143_in_restrictedStringType1607);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal132_tree =
						(CommonTree) adaptor.create(string_literal132)
						;
						adaptor.addChild(root_0, string_literal132_tree);
					}

				}
				break;
				case 11:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:257:4: 'UniversalString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal133 = (Token) match(input, 150, FOLLOW_150_in_restrictedStringType1612);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal133_tree =
						(CommonTree) adaptor.create(string_literal133)
						;
						adaptor.addChild(root_0, string_literal133_tree);
					}

				}
				break;
				case 12:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:258:4: 'UTF8String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal134 = (Token) match(input, 149, FOLLOW_149_in_restrictedStringType1617);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal134_tree =
						(CommonTree) adaptor.create(string_literal134)
						;
						adaptor.addChild(root_0, string_literal134_tree);
					}

				}
				break;
				case 13:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:259:4: 'VideotexString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal135 = (Token) match(input, 151, FOLLOW_151_in_restrictedStringType1622);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal135_tree =
						(CommonTree) adaptor.create(string_literal135)
						;
						adaptor.addChild(root_0, string_literal135_tree);
					}

				}
				break;
				case 14:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:260:4: 'VisibleString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal136 = (Token) match(input, 152, FOLLOW_152_in_restrictedStringType1627);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal136_tree =
						(CommonTree) adaptor.create(string_literal136)
						;
						adaptor.addChild(root_0, string_literal136_tree);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "restrictedStringType"


	public static class choiceType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "choiceType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:262:1: choiceType : 'CHOICE' '{' alternativesTypeLists '}' ( constraint )? -> ^( CHOICE alternativesTypeLists ( constraint )? ) ;
	public final ASN1Parser.choiceType_return choiceType() throws RecognitionException {
		ASN1Parser.choiceType_return retval = new ASN1Parser.choiceType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal137 = null;
		Token char_literal138 = null;
		Token char_literal140 = null;
		ASN1Parser.alternativesTypeLists_return alternativesTypeLists139 = null;

		ASN1Parser.constraint_return constraint141 = null;


		CommonTree string_literal137_tree = null;
		CommonTree char_literal138_tree = null;
		CommonTree char_literal140_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleTokenStream stream_100 = new RewriteRuleTokenStream(adaptor, "token 100");
		RewriteRuleSubtreeStream stream_alternativesTypeLists = new RewriteRuleSubtreeStream(adaptor, "rule alternativesTypeLists");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:262:14: ( 'CHOICE' '{' alternativesTypeLists '}' ( constraint )? -> ^( CHOICE alternativesTypeLists ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:263:3: 'CHOICE' '{' alternativesTypeLists '}' ( constraint )?
			{
				string_literal137 = (Token) match(input, 100, FOLLOW_100_in_choiceType1639);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_100.add(string_literal137);


				char_literal138 = (Token) match(input, 159, FOLLOW_159_in_choiceType1641);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal138);


				pushFollow(FOLLOW_alternativesTypeLists_in_choiceType1643);
				alternativesTypeLists139 = alternativesTypeLists();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_alternativesTypeLists.add(alternativesTypeLists139.getTree());

				char_literal140 = (Token) match(input, 161, FOLLOW_161_in_choiceType1645);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal140);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:263:42: ( constraint )?
				int alt34 = 2;
				int LA34_0 = input.LA(1);

				if ((LA34_0 == 81)) {
					alt34 = 1;
				}
				switch (alt34) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:263:42: constraint
					{
						pushFollow(FOLLOW_constraint_in_choiceType1647);
						constraint141 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint141.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: constraint, alternativesTypeLists
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 263:54: -> ^( CHOICE alternativesTypeLists ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:263:57: ^( CHOICE alternativesTypeLists ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CHOICE, "CHOICE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_alternativesTypeLists.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:263:88: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "choiceType"


	public static class alternativesTypeLists_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "alternativesTypeLists"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:265:1: alternativesTypeLists : alternativeTypeList ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )? -> ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? ) ;
	public final ASN1Parser.alternativesTypeLists_return alternativesTypeLists() throws RecognitionException {
		ASN1Parser.alternativesTypeLists_return retval = new ASN1Parser.alternativesTypeLists_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal143 = null;
		Token char_literal145 = null;
		ASN1Parser.alternativeTypeList_return alternativeTypeList142 = null;

		ASN1Parser.extensionAndException_return extensionAndException144 = null;

		ASN1Parser.extensionAdditionAlternativesList_return extensionAdditionAlternativesList146 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker147 = null;


		CommonTree char_literal143_tree = null;
		CommonTree char_literal145_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAndException = new RewriteRuleSubtreeStream(adaptor, "rule extensionAndException");
		RewriteRuleSubtreeStream stream_alternativeTypeList = new RewriteRuleSubtreeStream(adaptor, "rule alternativeTypeList");
		RewriteRuleSubtreeStream stream_extensionEndMarker = new RewriteRuleSubtreeStream(adaptor, "rule extensionEndMarker");
		RewriteRuleSubtreeStream stream_extensionAdditionAlternativesList = new RewriteRuleSubtreeStream(
		                                                                                                adaptor,
		                                                                                                "rule extensionAdditionAlternativesList"
		);
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:265:24: ( alternativeTypeList ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )? -> ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:3: alternativeTypeList ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )?
			{
				pushFollow(FOLLOW_alternativeTypeList_in_alternativesTypeLists1670);
				alternativeTypeList142 = alternativeTypeList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_alternativeTypeList.add(alternativeTypeList142.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:23: ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )?
				int alt37 = 2;
				int LA37_0 = input.LA(1);

				if ((LA37_0 == 83)) {
					alt37 = 1;
				}
				switch (alt37) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:24: ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )?
					{
						char_literal143 = (Token) match(input, 83, FOLLOW_83_in_alternativesTypeLists1673);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_83.add(char_literal143);


						pushFollow(FOLLOW_extensionAndException_in_alternativesTypeLists1675);
						extensionAndException144 = extensionAndException();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionAndException.add(extensionAndException144.getTree());

						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:50: ( ',' extensionAdditionAlternativesList )?
						int alt35 = 2;
						int LA35_0 = input.LA(1);

						if ((LA35_0 == 83)) {
							int LA35_1 = input.LA(2);

							if ((LA35_1 == ID || LA35_1 == 155)) {
								alt35 = 1;
							}
						}
						switch (alt35) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:51: ',' extensionAdditionAlternativesList
							{
								char_literal145 = (Token) match(input, 83, FOLLOW_83_in_alternativesTypeLists1678);
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_83.add(char_literal145);


								pushFollow(FOLLOW_extensionAdditionAlternativesList_in_alternativesTypeLists1680);
								extensionAdditionAlternativesList146 = extensionAdditionAlternativesList();

								state._fsp--;
								if (state.failed) return retval;
								if (state.backtracking == 0) {
									stream_extensionAdditionAlternativesList.add(extensionAdditionAlternativesList146.getTree());
								}

							}
							break;

						}


						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:91: ( extensionEndMarker )?
						int alt36 = 2;
						int LA36_0 = input.LA(1);

						if ((LA36_0 == 83)) {
							alt36 = 1;
						}
						switch (alt36) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:266:91: extensionEndMarker
							{
								pushFollow(FOLLOW_extensionEndMarker_in_alternativesTypeLists1684);
								extensionEndMarker147 = extensionEndMarker();

								state._fsp--;
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker147.getTree());

							}
							break;

						}


					}
					break;

				}


				// AST REWRITE
				// elements: extensionAdditionAlternativesList, extensionEndMarker, alternativeTypeList, extensionAndException
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 267:3: -> ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:267:6: ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(stream_alternativeTypeList.nextNode(), root_1);

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:267:28: ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )?
							if (stream_extensionAdditionAlternativesList.hasNext() || stream_extensionEndMarker.hasNext()
							    || stream_extensionAndException.hasNext()) {
								adaptor.addChild(root_1, stream_extensionAndException.nextTree());

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:267:51: ( extensionAdditionAlternativesList )?
								if (stream_extensionAdditionAlternativesList.hasNext()) {
									adaptor.addChild(root_1, stream_extensionAdditionAlternativesList.nextTree());

								}
								stream_extensionAdditionAlternativesList.reset();

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:267:86: ( extensionEndMarker )?
								if (stream_extensionEndMarker.hasNext()) {
									adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

								}
								stream_extensionEndMarker.reset();

							}
							stream_extensionAdditionAlternativesList.reset();
							stream_extensionEndMarker.reset();
							stream_extensionAndException.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternativesTypeLists"


	public static class alternativeTypeList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "alternativeTypeList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:269:1: alternativeTypeList : namedType ( ',' namedType )* -> ^( VEC ( namedType )+ ) ;
	public final ASN1Parser.alternativeTypeList_return alternativeTypeList() throws RecognitionException {
		ASN1Parser.alternativeTypeList_return retval = new ASN1Parser.alternativeTypeList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal149 = null;
		ASN1Parser.namedType_return namedType148 = null;

		ASN1Parser.namedType_return namedType150 = null;


		CommonTree char_literal149_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_namedType = new RewriteRuleSubtreeStream(adaptor, "rule namedType");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:269:22: ( namedType ( ',' namedType )* -> ^( VEC ( namedType )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:270:3: namedType ( ',' namedType )*
			{
				pushFollow(FOLLOW_namedType_in_alternativeTypeList1717);
				namedType148 = namedType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_namedType.add(namedType148.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:270:13: ( ',' namedType )*
				loop38:
				do {
					int alt38 = 2;
					int LA38_0 = input.LA(1);

					if ((LA38_0 == 83)) {
						int LA38_1 = input.LA(2);

						if ((LA38_1 == ID)) {
							alt38 = 1;
						}


					}


					switch (alt38) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:270:14: ',' namedType
						{
							char_literal149 = (Token) match(input, 83, FOLLOW_83_in_alternativeTypeList1720);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal149);


							pushFollow(FOLLOW_namedType_in_alternativeTypeList1722);
							namedType150 = namedType();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_namedType.add(namedType150.getTree());

						}
						break;

						default:
							break loop38;
					}
				} while (true);


				// AST REWRITE
				// elements: namedType
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 270:30: -> ^( VEC ( namedType )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:270:33: ^( VEC ( namedType )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_namedType.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_namedType.hasNext()) {
								adaptor.addChild(root_1, stream_namedType.nextTree());

							}
							stream_namedType.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternativeTypeList"


	public static class extensionAdditionAlternativesList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAdditionAlternativesList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:272:1: extensionAdditionAlternativesList : extensionAdditionAlternative ( ',' extensionAdditionAlternative )* -> ^( VEC ( extensionAdditionAlternative )+ ) ;
	public final ASN1Parser.extensionAdditionAlternativesList_return extensionAdditionAlternativesList() throws RecognitionException {
		ASN1Parser.extensionAdditionAlternativesList_return retval = new ASN1Parser.extensionAdditionAlternativesList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal152 = null;
		ASN1Parser.extensionAdditionAlternative_return extensionAdditionAlternative151 = null;

		ASN1Parser.extensionAdditionAlternative_return extensionAdditionAlternative153 = null;


		CommonTree char_literal152_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAdditionAlternative = new RewriteRuleSubtreeStream(adaptor, "rule extensionAdditionAlternative");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:272:34: ( extensionAdditionAlternative ( ',' extensionAdditionAlternative )* -> ^( VEC ( extensionAdditionAlternative )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:273:3: extensionAdditionAlternative ( ',' extensionAdditionAlternative )*
			{
				pushFollow(FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1742);
				extensionAdditionAlternative151 = extensionAdditionAlternative();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_extensionAdditionAlternative.add(extensionAdditionAlternative151.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:273:32: ( ',' extensionAdditionAlternative )*
				loop39:
				do {
					int alt39 = 2;
					int LA39_0 = input.LA(1);

					if ((LA39_0 == 83)) {
						int LA39_1 = input.LA(2);

						if ((LA39_1 == ID || LA39_1 == 155)) {
							alt39 = 1;
						}


					}


					switch (alt39) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:273:33: ',' extensionAdditionAlternative
						{
							char_literal152 = (Token) match(input, 83, FOLLOW_83_in_extensionAdditionAlternativesList1745);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal152);


							pushFollow(FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1747);
							extensionAdditionAlternative153 = extensionAdditionAlternative();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionAdditionAlternative.add(extensionAdditionAlternative153.getTree());

						}
						break;

						default:
							break loop39;
					}
				} while (true);


				// AST REWRITE
				// elements: extensionAdditionAlternative
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 273:68: -> ^( VEC ( extensionAdditionAlternative )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:273:71: ^( VEC ( extensionAdditionAlternative )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_extensionAdditionAlternative.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_extensionAdditionAlternative.hasNext()) {
								adaptor.addChild(root_1, stream_extensionAdditionAlternative.nextTree());

							}
							stream_extensionAdditionAlternative.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAdditionAlternativesList"


	public static class extensionAdditionAlternative_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAdditionAlternative"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:275:1: extensionAdditionAlternative : ( extensionAdditionAlternativesGroup | namedType );
	public final ASN1Parser.extensionAdditionAlternative_return extensionAdditionAlternative() throws RecognitionException {
		ASN1Parser.extensionAdditionAlternative_return retval = new ASN1Parser.extensionAdditionAlternative_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.extensionAdditionAlternativesGroup_return extensionAdditionAlternativesGroup154 = null;

		ASN1Parser.namedType_return namedType155 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:275:30: ( extensionAdditionAlternativesGroup | namedType )
			int alt40 = 2;
			int LA40_0 = input.LA(1);

			if ((LA40_0 == 155)) {
				alt40 = 1;
			} else if ((LA40_0 == ID)) {
				alt40 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 40, 0, input);

				throw nvae;

			}
			switch (alt40) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:276:3: extensionAdditionAlternativesGroup
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_extensionAdditionAlternativesGroup_in_extensionAdditionAlternative1768);
					extensionAdditionAlternativesGroup154 = extensionAdditionAlternativesGroup();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, extensionAdditionAlternativesGroup154.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:276:40: namedType
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_namedType_in_extensionAdditionAlternative1772);
					namedType155 = namedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, namedType155.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAdditionAlternative"


	public static class extensionAdditionAlternativesGroup_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAdditionAlternativesGroup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:278:1: extensionAdditionAlternativesGroup : '[[' ( INT ':' )? alternativeTypeList ']]' -> ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList ) ;
	public final ASN1Parser.extensionAdditionAlternativesGroup_return extensionAdditionAlternativesGroup() throws RecognitionException {
		ASN1Parser.extensionAdditionAlternativesGroup_return retval = new ASN1Parser.extensionAdditionAlternativesGroup_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal156 = null;
		Token INT157 = null;
		Token char_literal158 = null;
		Token string_literal160 = null;
		ASN1Parser.alternativeTypeList_return alternativeTypeList159 = null;


		CommonTree string_literal156_tree = null;
		CommonTree INT157_tree = null;
		CommonTree char_literal158_tree = null;
		CommonTree string_literal160_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_157 = new RewriteRuleTokenStream(adaptor, "token 157");
		RewriteRuleTokenStream stream_87 = new RewriteRuleTokenStream(adaptor, "token 87");
		RewriteRuleTokenStream stream_155 = new RewriteRuleTokenStream(adaptor, "token 155");
		RewriteRuleSubtreeStream stream_alternativeTypeList = new RewriteRuleSubtreeStream(adaptor, "rule alternativeTypeList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:278:35: ( '[[' ( INT ':' )? alternativeTypeList ']]' -> ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:279:3: '[[' ( INT ':' )? alternativeTypeList ']]'
			{
				string_literal156 = (Token) match(input, 155, FOLLOW_155_in_extensionAdditionAlternativesGroup1781);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_155.add(string_literal156);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:279:8: ( INT ':' )?
				int alt41 = 2;
				int LA41_0 = input.LA(1);

				if ((LA41_0 == INT)) {
					alt41 = 1;
				}
				switch (alt41) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:279:9: INT ':'
					{
						INT157 = (Token) match(input, INT, FOLLOW_INT_in_extensionAdditionAlternativesGroup1784);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT157);


						char_literal158 = (Token) match(input, 87, FOLLOW_87_in_extensionAdditionAlternativesGroup1786);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_87.add(char_literal158);


					}
					break;

				}


				pushFollow(FOLLOW_alternativeTypeList_in_extensionAdditionAlternativesGroup1791);
				alternativeTypeList159 = alternativeTypeList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_alternativeTypeList.add(alternativeTypeList159.getTree());

				string_literal160 = (Token) match(input, 157, FOLLOW_157_in_extensionAdditionAlternativesGroup1793);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_157.add(string_literal160);


				// AST REWRITE
				// elements: alternativeTypeList, INT
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 280:3: -> ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:280:6: ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(
							                                                                   EXTENSION_ADDITION_ALTERNATIVES_GROUP,
							                                                                   "EXTENSION_ADDITION_ALTERNATIVES_GROUP"
							                                                                   )
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:280:46: ( INT )?
							if (stream_INT.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_INT.nextNode()
								                );

							}
							stream_INT.reset();

							adaptor.addChild(root_1, stream_alternativeTypeList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAdditionAlternativesGroup"


	public static class setType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "setType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:282:1: setType : 'SET' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SET ( componentTypeLists )? ( constraint )? ) ;
	public final ASN1Parser.setType_return setType() throws RecognitionException {
		ASN1Parser.setType_return retval = new ASN1Parser.setType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal161 = null;
		Token char_literal162 = null;
		Token char_literal164 = null;
		ASN1Parser.componentTypeLists_return componentTypeLists163 = null;

		ASN1Parser.constraint_return constraint165 = null;


		CommonTree string_literal161_tree = null;
		CommonTree char_literal162_tree = null;
		CommonTree char_literal164_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleTokenStream stream_140 = new RewriteRuleTokenStream(adaptor, "token 140");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_componentTypeLists = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeLists");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:282:12: ( 'SET' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SET ( componentTypeLists )? ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:3: 'SET' '{' ( componentTypeLists )? '}' ( constraint )?
			{
				string_literal161 = (Token) match(input, 140, FOLLOW_140_in_setType1820);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_140.add(string_literal161);


				char_literal162 = (Token) match(input, 159, FOLLOW_159_in_setType1822);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal162);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:13: ( componentTypeLists )?
				int alt42 = 2;
				int LA42_0 = input.LA(1);

				if ((LA42_0 == ID || LA42_0 == 86 || LA42_0 == 102)) {
					alt42 = 1;
				}
				switch (alt42) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:13: componentTypeLists
					{
						pushFollow(FOLLOW_componentTypeLists_in_setType1824);
						componentTypeLists163 = componentTypeLists();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_componentTypeLists.add(componentTypeLists163.getTree());

					}
					break;

				}


				char_literal164 = (Token) match(input, 161, FOLLOW_161_in_setType1827);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal164);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:37: ( constraint )?
				int alt43 = 2;
				int LA43_0 = input.LA(1);

				if ((LA43_0 == 81)) {
					alt43 = 1;
				}
				switch (alt43) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:37: constraint
					{
						pushFollow(FOLLOW_constraint_in_setType1829);
						constraint165 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint165.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: componentTypeLists, constraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 283:49: -> ^( SET ( componentTypeLists )? ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:52: ^( SET ( componentTypeLists )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SET, "SET")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:58: ( componentTypeLists )?
							if (stream_componentTypeLists.hasNext()) {
								adaptor.addChild(root_1, stream_componentTypeLists.nextTree());

							}
							stream_componentTypeLists.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:283:78: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setType"


	public static class setOfType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "setOfType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:285:1: setOfType : 'SET' ( constraint )? 'OF' sOfComponentType -> ^( SETOF sOfComponentType ( constraint )? ) ;
	public final ASN1Parser.setOfType_return setOfType() throws RecognitionException {
		ASN1Parser.setOfType_return retval = new ASN1Parser.setOfType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal166 = null;
		Token string_literal168 = null;
		ASN1Parser.constraint_return constraint167 = null;

		ASN1Parser.sOfComponentType_return sOfComponentType169 = null;


		CommonTree string_literal166_tree = null;
		CommonTree string_literal168_tree = null;
		RewriteRuleTokenStream stream_140 = new RewriteRuleTokenStream(adaptor, "token 140");
		RewriteRuleTokenStream stream_130 = new RewriteRuleTokenStream(adaptor, "token 130");
		RewriteRuleSubtreeStream stream_sOfComponentType = new RewriteRuleSubtreeStream(adaptor, "rule sOfComponentType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:285:13: ( 'SET' ( constraint )? 'OF' sOfComponentType -> ^( SETOF sOfComponentType ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:286:3: 'SET' ( constraint )? 'OF' sOfComponentType
			{
				string_literal166 = (Token) match(input, 140, FOLLOW_140_in_setOfType1855);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_140.add(string_literal166);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:286:9: ( constraint )?
				int alt44 = 2;
				int LA44_0 = input.LA(1);

				if ((LA44_0 == 81)) {
					alt44 = 1;
				}
				switch (alt44) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:286:9: constraint
					{
						pushFollow(FOLLOW_constraint_in_setOfType1857);
						constraint167 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint167.getTree());

					}
					break;

				}


				string_literal168 = (Token) match(input, 130, FOLLOW_130_in_setOfType1860);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_130.add(string_literal168);


				pushFollow(FOLLOW_sOfComponentType_in_setOfType1862);
				sOfComponentType169 = sOfComponentType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_sOfComponentType.add(sOfComponentType169.getTree());

				// AST REWRITE
				// elements: constraint, sOfComponentType
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 286:43: -> ^( SETOF sOfComponentType ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:286:46: ^( SETOF sOfComponentType ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SETOF, "SETOF")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_sOfComponentType.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:286:71: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setOfType"


	public static class sOfComponentType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "sOfComponentType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:288:1: sOfComponentType : ( ( VALUE_ID )=> namedType | type );
	public final ASN1Parser.sOfComponentType_return sOfComponentType() throws RecognitionException {
		ASN1Parser.sOfComponentType_return retval = new ASN1Parser.sOfComponentType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.namedType_return namedType170 = null;

		ASN1Parser.type_return type171 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:289:2: ( ( VALUE_ID )=> namedType | type )
			int alt45 = 2;
			int LA45_0 = input.LA(1);

			if ((LA45_0 == ID)) {
				int LA45_1 = input.LA(2);

				if ((synpred5_ASN1())) {
					alt45 = 1;
				} else if ((true)) {
					alt45 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 45, 1, input);

					throw nvae;

				}
			} else if ((LA45_0 == CLASS_DEF || (LA45_0 >= 80 && LA45_0 <= 83) || (LA45_0 >= 87 && LA45_0 <= 89) || (LA45_0 >= 96 && LA45_0 <= 100)
			            || LA45_0 == 103 || (LA45_0 >= 105 && LA45_0 <= 107) || (LA45_0 >= 113 && LA45_0 <= 115) || (LA45_0 >= 121 && LA45_0 <= 123)
			            || (LA45_0 >= 127 && LA45_0 <= 129) || LA45_0 == 132 || (LA45_0 >= 137 && LA45_0 <= 140) || LA45_0 == 143 || (LA45_0 >= 146
			                                                                                                                          && LA45_0
			                                                                                                                             <= 147) || (
			                                                                                                                                        LA45_0
			                                                                                                                                        >= 149
			                                                                                                                                        &&
			                                                                                                                                        LA45_0
			                                                                                                                                        <= 152)
			            || LA45_0 == 154 || (LA45_0 >= 157 && LA45_0 <= 158) || (LA45_0 >= 160 && LA45_0 <= 161))) {
				alt45 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 45, 0, input);

				throw nvae;

			}
			switch (alt45) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:289:4: ( VALUE_ID )=> namedType
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_namedType_in_sOfComponentType1886);
					namedType170 = namedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, namedType170.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:289:28: type
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_type_in_sOfComponentType1890);
					type171 = type();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, type171.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sOfComponentType"


	public static class sequenceType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "sequenceType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:291:1: sequenceType : 'SEQUENCE' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SEQUENCE ( componentTypeLists )? ( constraint )? ) ;
	public final ASN1Parser.sequenceType_return sequenceType() throws RecognitionException {
		ASN1Parser.sequenceType_return retval = new ASN1Parser.sequenceType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal172 = null;
		Token char_literal173 = null;
		Token char_literal175 = null;
		ASN1Parser.componentTypeLists_return componentTypeLists174 = null;

		ASN1Parser.constraint_return constraint176 = null;


		CommonTree string_literal172_tree = null;
		CommonTree char_literal173_tree = null;
		CommonTree char_literal175_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_139 = new RewriteRuleTokenStream(adaptor, "token 139");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_componentTypeLists = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeLists");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:291:16: ( 'SEQUENCE' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SEQUENCE ( componentTypeLists )? ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:3: 'SEQUENCE' '{' ( componentTypeLists )? '}' ( constraint )?
			{
				string_literal172 = (Token) match(input, 139, FOLLOW_139_in_sequenceType1903);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_139.add(string_literal172);


				char_literal173 = (Token) match(input, 159, FOLLOW_159_in_sequenceType1905);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal173);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:18: ( componentTypeLists )?
				int alt46 = 2;
				int LA46_0 = input.LA(1);

				if ((LA46_0 == ID || LA46_0 == 86 || LA46_0 == 102)) {
					alt46 = 1;
				}
				switch (alt46) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:18: componentTypeLists
					{
						pushFollow(FOLLOW_componentTypeLists_in_sequenceType1907);
						componentTypeLists174 = componentTypeLists();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_componentTypeLists.add(componentTypeLists174.getTree());

					}
					break;

				}


				char_literal175 = (Token) match(input, 161, FOLLOW_161_in_sequenceType1910);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal175);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:42: ( constraint )?
				int alt47 = 2;
				int LA47_0 = input.LA(1);

				if ((LA47_0 == 81)) {
					alt47 = 1;
				}
				switch (alt47) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:42: constraint
					{
						pushFollow(FOLLOW_constraint_in_sequenceType1912);
						constraint176 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint176.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: constraint, componentTypeLists
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 293:53: -> ^( SEQUENCE ( componentTypeLists )? ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:56: ^( SEQUENCE ( componentTypeLists )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SEQUENCE, "SEQUENCE")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:67: ( componentTypeLists )?
							if (stream_componentTypeLists.hasNext()) {
								adaptor.addChild(root_1, stream_componentTypeLists.nextTree());

							}
							stream_componentTypeLists.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:293:87: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequenceType"


	public static class componentTypeLists_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "componentTypeLists"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:295:1: componentTypeLists : ( componentTypeList ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? -> ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? ) | extensionAndException ( extensionAdditions )? ( extensionEndMarker )? -> ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? ) );
	public final ASN1Parser.componentTypeLists_return componentTypeLists() throws RecognitionException {
		ASN1Parser.componentTypeLists_return retval = new ASN1Parser.componentTypeLists_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal178 = null;
		ASN1Parser.componentTypeList_return componentTypeList177 = null;

		ASN1Parser.extensionAndException_return extensionAndException179 = null;

		ASN1Parser.extensionAdditions_return extensionAdditions180 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker181 = null;

		ASN1Parser.componentTypeList_return componentTypeList182 = null;

		ASN1Parser.extensionAndException_return extensionAndException183 = null;

		ASN1Parser.extensionAdditions_return extensionAdditions184 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker185 = null;


		CommonTree char_literal178_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAndException = new RewriteRuleSubtreeStream(adaptor, "rule extensionAndException");
		RewriteRuleSubtreeStream stream_extensionEndMarker = new RewriteRuleSubtreeStream(adaptor, "rule extensionEndMarker");
		RewriteRuleSubtreeStream stream_componentTypeList = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeList");
		RewriteRuleSubtreeStream stream_extensionAdditions = new RewriteRuleSubtreeStream(adaptor, "rule extensionAdditions");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:295:21: ( componentTypeList ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? -> ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? ) | extensionAndException ( extensionAdditions )? ( extensionEndMarker )? -> ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? ) )
			int alt54 = 2;
			int LA54_0 = input.LA(1);

			if ((LA54_0 == ID || LA54_0 == 102)) {
				alt54 = 1;
			} else if ((LA54_0 == 86)) {
				alt54 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 54, 0, input);

				throw nvae;

			}
			switch (alt54) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:3: componentTypeList ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )?
				{
					pushFollow(FOLLOW_componentTypeList_in_componentTypeLists1936);
					componentTypeList177 = componentTypeList();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_componentTypeList.add(componentTypeList177.getTree());

					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:21: ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )?
					int alt51 = 2;
					int LA51_0 = input.LA(1);

					if ((LA51_0 == 83)) {
						alt51 = 1;
					}
					switch (alt51) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:22: ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )?
						{
							char_literal178 = (Token) match(input, 83, FOLLOW_83_in_componentTypeLists1939);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal178);


							pushFollow(FOLLOW_extensionAndException_in_componentTypeLists1941);
							extensionAndException179 = extensionAndException();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionAndException.add(extensionAndException179.getTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:48: ( extensionAdditions )?
							int alt48 = 2;
							int LA48_0 = input.LA(1);

							if ((LA48_0 == 83)) {
								int LA48_1 = input.LA(2);

								if ((LA48_1 == ID || LA48_1 == 102 || LA48_1 == 155)) {
									alt48 = 1;
								}
							}
							switch (alt48) {
								case 1:
									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:48: extensionAdditions
								{
									pushFollow(FOLLOW_extensionAdditions_in_componentTypeLists1943);
									extensionAdditions180 = extensionAdditions();

									state._fsp--;
									if (state.failed) return retval;
									if (state.backtracking == 0) stream_extensionAdditions.add(extensionAdditions180.getTree());

								}
								break;

							}


							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:68: ( extensionEndMarker ( componentTypeList )? )?
							int alt50 = 2;
							int LA50_0 = input.LA(1);

							if ((LA50_0 == 83)) {
								alt50 = 1;
							}
							switch (alt50) {
								case 1:
									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:69: extensionEndMarker ( componentTypeList )?
								{
									pushFollow(FOLLOW_extensionEndMarker_in_componentTypeLists1947);
									extensionEndMarker181 = extensionEndMarker();

									state._fsp--;
									if (state.failed) return retval;
									if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker181.getTree());

									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:88: ( componentTypeList )?
									int alt49 = 2;
									int LA49_0 = input.LA(1);

									if ((LA49_0 == ID || LA49_0 == 102)) {
										alt49 = 1;
									}
									switch (alt49) {
										case 1:
											// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:296:88: componentTypeList
										{
											pushFollow(FOLLOW_componentTypeList_in_componentTypeLists1949);
											componentTypeList182 = componentTypeList();

											state._fsp--;
											if (state.failed) return retval;
											if (state.backtracking == 0) stream_componentTypeList.add(componentTypeList182.getTree());

										}
										break;

									}


								}
								break;

							}


						}
						break;

					}


					// AST REWRITE
					// elements: extensionAdditions, extensionEndMarker, extensionAndException, componentTypeList, componentTypeList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 297:3: -> ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:297:6: ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(stream_componentTypeList.nextNode(), root_1);

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:297:26: ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )?
								if (stream_extensionAdditions.hasNext() || stream_extensionEndMarker.hasNext()
								    || stream_extensionAndException.hasNext()) {
									adaptor.addChild(root_1, stream_extensionAndException.nextTree());

									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:297:49: ( extensionAdditions )?
									if (stream_extensionAdditions.hasNext()) {
										adaptor.addChild(root_1, stream_extensionAdditions.nextTree());

									}
									stream_extensionAdditions.reset();

									// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:297:69: ( extensionEndMarker ( componentTypeList )? )?
									if (stream_extensionEndMarker.hasNext() || stream_componentTypeList.hasNext()) {
										adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

										// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:297:89: ( componentTypeList )?
										if (stream_componentTypeList.hasNext()) {
											adaptor.addChild(root_1, stream_componentTypeList.nextTree());

										}
										stream_componentTypeList.reset();

									}
									stream_extensionEndMarker.reset();
									stream_componentTypeList.reset();

								}
								stream_extensionAdditions.reset();
								stream_extensionEndMarker.reset();
								stream_extensionAndException.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:298:4: extensionAndException ( extensionAdditions )? ( extensionEndMarker )?
				{
					pushFollow(FOLLOW_extensionAndException_in_componentTypeLists2000);
					extensionAndException183 = extensionAndException();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_extensionAndException.add(extensionAndException183.getTree());

					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:298:26: ( extensionAdditions )?
					int alt52 = 2;
					int LA52_0 = input.LA(1);

					if ((LA52_0 == 83)) {
						int LA52_1 = input.LA(2);

						if ((LA52_1 == ID || LA52_1 == 102 || LA52_1 == 155)) {
							alt52 = 1;
						}
					}
					switch (alt52) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:298:26: extensionAdditions
						{
							pushFollow(FOLLOW_extensionAdditions_in_componentTypeLists2002);
							extensionAdditions184 = extensionAdditions();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionAdditions.add(extensionAdditions184.getTree());

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:298:46: ( extensionEndMarker )?
					int alt53 = 2;
					int LA53_0 = input.LA(1);

					if ((LA53_0 == 83)) {
						alt53 = 1;
					}
					switch (alt53) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:298:46: extensionEndMarker
						{
							pushFollow(FOLLOW_extensionEndMarker_in_componentTypeLists2005);
							extensionEndMarker185 = extensionEndMarker();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker185.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: extensionAdditions, extensionAndException, extensionEndMarker
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 299:3: -> ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:299:6: ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(stream_extensionAndException.nextNode(), root_1);

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:299:30: ( extensionAdditions )?
								if (stream_extensionAdditions.hasNext()) {
									adaptor.addChild(root_1, stream_extensionAdditions.nextTree());

								}
								stream_extensionAdditions.reset();

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:299:50: ( extensionEndMarker )?
								if (stream_extensionEndMarker.hasNext()) {
									adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

								}
								stream_extensionEndMarker.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "componentTypeLists"


	public static class componentTypeList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "componentTypeList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:301:1: componentTypeList : componentType ( ',' componentType )* -> ^( VEC ( componentType )+ ) ;
	public final ASN1Parser.componentTypeList_return componentTypeList() throws RecognitionException {
		ASN1Parser.componentTypeList_return retval = new ASN1Parser.componentTypeList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal187 = null;
		ASN1Parser.componentType_return componentType186 = null;

		ASN1Parser.componentType_return componentType188 = null;


		CommonTree char_literal187_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_componentType = new RewriteRuleSubtreeStream(adaptor, "rule componentType");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:301:20: ( componentType ( ',' componentType )* -> ^( VEC ( componentType )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:302:3: componentType ( ',' componentType )*
			{
				pushFollow(FOLLOW_componentType_in_componentTypeList2034);
				componentType186 = componentType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_componentType.add(componentType186.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:302:17: ( ',' componentType )*
				loop55:
				do {
					int alt55 = 2;
					int LA55_0 = input.LA(1);

					if ((LA55_0 == 83)) {
						int LA55_1 = input.LA(2);

						if ((LA55_1 == ID || LA55_1 == 102)) {
							alt55 = 1;
						}


					}


					switch (alt55) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:302:18: ',' componentType
						{
							char_literal187 = (Token) match(input, 83, FOLLOW_83_in_componentTypeList2037);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal187);


							pushFollow(FOLLOW_componentType_in_componentTypeList2039);
							componentType188 = componentType();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_componentType.add(componentType188.getTree());

						}
						break;

						default:
							break loop55;
					}
				} while (true);


				// AST REWRITE
				// elements: componentType
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 302:38: -> ^( VEC ( componentType )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:302:41: ^( VEC ( componentType )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_componentType.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_componentType.hasNext()) {
								adaptor.addChild(root_1, stream_componentType.nextTree());

							}
							stream_componentType.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "componentTypeList"


	public static class componentType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "componentType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:304:1: componentType : ( namedType ( componentTypeOption )? -> ^( COMPONENT_TYPE namedType ( componentTypeOption )? ) | 'COMPONENTS' 'OF' type -> ^( COMPONENT_TYPE type ) );
	public final ASN1Parser.componentType_return componentType() throws RecognitionException {
		ASN1Parser.componentType_return retval = new ASN1Parser.componentType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal191 = null;
		Token string_literal192 = null;
		ASN1Parser.namedType_return namedType189 = null;

		ASN1Parser.componentTypeOption_return componentTypeOption190 = null;

		ASN1Parser.type_return type193 = null;


		CommonTree string_literal191_tree = null;
		CommonTree string_literal192_tree = null;
		RewriteRuleTokenStream stream_102 = new RewriteRuleTokenStream(adaptor, "token 102");
		RewriteRuleTokenStream stream_130 = new RewriteRuleTokenStream(adaptor, "token 130");
		RewriteRuleSubtreeStream stream_namedType = new RewriteRuleSubtreeStream(adaptor, "rule namedType");
		RewriteRuleSubtreeStream stream_componentTypeOption = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeOption");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:304:17: ( namedType ( componentTypeOption )? -> ^( COMPONENT_TYPE namedType ( componentTypeOption )? ) | 'COMPONENTS' 'OF' type -> ^( COMPONENT_TYPE type ) )
			int alt57 = 2;
			int LA57_0 = input.LA(1);

			if ((LA57_0 == ID)) {
				alt57 = 1;
			} else if ((LA57_0 == 102)) {
				alt57 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 57, 0, input);

				throw nvae;

			}
			switch (alt57) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:305:3: namedType ( componentTypeOption )?
				{
					pushFollow(FOLLOW_namedType_in_componentType2063);
					namedType189 = namedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_namedType.add(namedType189.getTree());

					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:305:13: ( componentTypeOption )?
					int alt56 = 2;
					int LA56_0 = input.LA(1);

					if ((LA56_0 == 103 || LA56_0 == 132)) {
						alt56 = 1;
					}
					switch (alt56) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:305:13: componentTypeOption
						{
							pushFollow(FOLLOW_componentTypeOption_in_componentType2065);
							componentTypeOption190 = componentTypeOption();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_componentTypeOption.add(componentTypeOption190.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: namedType, componentTypeOption
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 305:34: -> ^( COMPONENT_TYPE namedType ( componentTypeOption )? )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:305:37: ^( COMPONENT_TYPE namedType ( componentTypeOption )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(COMPONENT_TYPE, "COMPONENT_TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_namedType.nextTree());

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:305:65: ( componentTypeOption )?
								if (stream_componentTypeOption.hasNext()) {
									adaptor.addChild(root_1, stream_componentTypeOption.nextTree());

								}
								stream_componentTypeOption.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:306:4: 'COMPONENTS' 'OF' type
				{
					string_literal191 = (Token) match(input, 102, FOLLOW_102_in_componentType2084);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_102.add(string_literal191);


					string_literal192 = (Token) match(input, 130, FOLLOW_130_in_componentType2086);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_130.add(string_literal192);


					pushFollow(FOLLOW_type_in_componentType2088);
					type193 = type();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_type.add(type193.getTree());

					// AST REWRITE
					// elements: type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 306:27: -> ^( COMPONENT_TYPE type )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:306:30: ^( COMPONENT_TYPE type )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(COMPONENT_TYPE, "COMPONENT_TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_type.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "componentType"


	public static class componentTypeOption_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "componentTypeOption"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:308:1: componentTypeOption : ( 'OPTIONAL' -> ^( COMPONENT_TYPE_OPTION ) | 'DEFAULT' value -> ^( COMPONENT_TYPE_OPTION value ) );
	public final ASN1Parser.componentTypeOption_return componentTypeOption() throws RecognitionException {
		ASN1Parser.componentTypeOption_return retval = new ASN1Parser.componentTypeOption_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal194 = null;
		Token string_literal195 = null;
		ASN1Parser.value_return value196 = null;


		CommonTree string_literal194_tree = null;
		CommonTree string_literal195_tree = null;
		RewriteRuleTokenStream stream_132 = new RewriteRuleTokenStream(adaptor, "token 132");
		RewriteRuleTokenStream stream_103 = new RewriteRuleTokenStream(adaptor, "token 103");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:308:22: ( 'OPTIONAL' -> ^( COMPONENT_TYPE_OPTION ) | 'DEFAULT' value -> ^( COMPONENT_TYPE_OPTION value ) )
			int alt58 = 2;
			int LA58_0 = input.LA(1);

			if ((LA58_0 == 132)) {
				alt58 = 1;
			} else if ((LA58_0 == 103)) {
				alt58 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 58, 0, input);

				throw nvae;

			}
			switch (alt58) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:309:3: 'OPTIONAL'
				{
					string_literal194 = (Token) match(input, 132, FOLLOW_132_in_componentTypeOption2108);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_132.add(string_literal194);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 309:14: -> ^( COMPONENT_TYPE_OPTION )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:309:17: ^( COMPONENT_TYPE_OPTION )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(COMPONENT_TYPE_OPTION, "COMPONENT_TYPE_OPTION")
								                                        , root_1
								                                        );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:310:4: 'DEFAULT' value
				{
					string_literal195 = (Token) match(input, 103, FOLLOW_103_in_componentTypeOption2120);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_103.add(string_literal195);


					pushFollow(FOLLOW_value_in_componentTypeOption2122);
					value196 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_value.add(value196.getTree());

					// AST REWRITE
					// elements: value
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 310:20: -> ^( COMPONENT_TYPE_OPTION value )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:310:23: ^( COMPONENT_TYPE_OPTION value )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(COMPONENT_TYPE_OPTION, "COMPONENT_TYPE_OPTION")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_value.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "componentTypeOption"


	public static class extensionAdditions_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAdditions"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:312:1: extensionAdditions : ',' extensionAddition ( ',' extensionAddition )? -> ^( VEC ( extensionAddition )+ ) ;
	public final ASN1Parser.extensionAdditions_return extensionAdditions() throws RecognitionException {
		ASN1Parser.extensionAdditions_return retval = new ASN1Parser.extensionAdditions_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal197 = null;
		Token char_literal199 = null;
		ASN1Parser.extensionAddition_return extensionAddition198 = null;

		ASN1Parser.extensionAddition_return extensionAddition200 = null;


		CommonTree char_literal197_tree = null;
		CommonTree char_literal199_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAddition = new RewriteRuleSubtreeStream(adaptor, "rule extensionAddition");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:312:21: ( ',' extensionAddition ( ',' extensionAddition )? -> ^( VEC ( extensionAddition )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:313:3: ',' extensionAddition ( ',' extensionAddition )?
			{
				char_literal197 = (Token) match(input, 83, FOLLOW_83_in_extensionAdditions2143);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_83.add(char_literal197);


				pushFollow(FOLLOW_extensionAddition_in_extensionAdditions2145);
				extensionAddition198 = extensionAddition();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_extensionAddition.add(extensionAddition198.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:313:25: ( ',' extensionAddition )?
				int alt59 = 2;
				int LA59_0 = input.LA(1);

				if ((LA59_0 == 83)) {
					int LA59_1 = input.LA(2);

					if ((LA59_1 == ID || LA59_1 == 102 || LA59_1 == 155)) {
						alt59 = 1;
					}
				}
				switch (alt59) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:313:26: ',' extensionAddition
					{
						char_literal199 = (Token) match(input, 83, FOLLOW_83_in_extensionAdditions2148);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_83.add(char_literal199);


						pushFollow(FOLLOW_extensionAddition_in_extensionAdditions2150);
						extensionAddition200 = extensionAddition();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionAddition.add(extensionAddition200.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: extensionAddition
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 313:50: -> ^( VEC ( extensionAddition )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:313:53: ^( VEC ( extensionAddition )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_extensionAddition.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_extensionAddition.hasNext()) {
								adaptor.addChild(root_1, stream_extensionAddition.nextTree());

							}
							stream_extensionAddition.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAdditions"


	public static class extensionAddition_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAddition"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:315:1: extensionAddition : ( componentType | extensionAdditionGroup );
	public final ASN1Parser.extensionAddition_return extensionAddition() throws RecognitionException {
		ASN1Parser.extensionAddition_return retval = new ASN1Parser.extensionAddition_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.componentType_return componentType201 = null;

		ASN1Parser.extensionAdditionGroup_return extensionAdditionGroup202 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:315:20: ( componentType | extensionAdditionGroup )
			int alt60 = 2;
			int LA60_0 = input.LA(1);

			if ((LA60_0 == ID || LA60_0 == 102)) {
				alt60 = 1;
			} else if ((LA60_0 == 155)) {
				alt60 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 60, 0, input);

				throw nvae;

			}
			switch (alt60) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:316:3: componentType
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_componentType_in_extensionAddition2175);
					componentType201 = componentType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, componentType201.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:316:19: extensionAdditionGroup
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_extensionAdditionGroup_in_extensionAddition2179);
					extensionAdditionGroup202 = extensionAdditionGroup();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, extensionAdditionGroup202.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAddition"


	public static class extensionAdditionGroup_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAdditionGroup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:317:1: extensionAdditionGroup : '[[' ( INT ':' )? componentTypeList ']]' -> ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList ) ;
	public final ASN1Parser.extensionAdditionGroup_return extensionAdditionGroup() throws RecognitionException {
		ASN1Parser.extensionAdditionGroup_return retval = new ASN1Parser.extensionAdditionGroup_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal203 = null;
		Token INT204 = null;
		Token char_literal205 = null;
		Token string_literal207 = null;
		ASN1Parser.componentTypeList_return componentTypeList206 = null;


		CommonTree string_literal203_tree = null;
		CommonTree INT204_tree = null;
		CommonTree char_literal205_tree = null;
		CommonTree string_literal207_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_157 = new RewriteRuleTokenStream(adaptor, "token 157");
		RewriteRuleTokenStream stream_87 = new RewriteRuleTokenStream(adaptor, "token 87");
		RewriteRuleTokenStream stream_155 = new RewriteRuleTokenStream(adaptor, "token 155");
		RewriteRuleSubtreeStream stream_componentTypeList = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:317:25: ( '[[' ( INT ':' )? componentTypeList ']]' -> ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:318:3: '[[' ( INT ':' )? componentTypeList ']]'
			{
				string_literal203 = (Token) match(input, 155, FOLLOW_155_in_extensionAdditionGroup2190);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_155.add(string_literal203);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:318:8: ( INT ':' )?
				int alt61 = 2;
				int LA61_0 = input.LA(1);

				if ((LA61_0 == INT)) {
					alt61 = 1;
				}
				switch (alt61) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:318:9: INT ':'
					{
						INT204 = (Token) match(input, INT, FOLLOW_INT_in_extensionAdditionGroup2193);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT204);


						char_literal205 = (Token) match(input, 87, FOLLOW_87_in_extensionAdditionGroup2195);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_87.add(char_literal205);


					}
					break;

				}


				pushFollow(FOLLOW_componentTypeList_in_extensionAdditionGroup2199);
				componentTypeList206 = componentTypeList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_componentTypeList.add(componentTypeList206.getTree());

				string_literal207 = (Token) match(input, 157, FOLLOW_157_in_extensionAdditionGroup2201);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_157.add(string_literal207);


				// AST REWRITE
				// elements: componentTypeList, INT
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 318:42: -> ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:318:45: ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(EXTENSION_ADDITION_GROUP, "EXTENSION_ADDITION_GROUP")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:318:72: ( INT )?
							if (stream_INT.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_INT.nextNode()
								                );

							}
							stream_INT.reset();

							adaptor.addChild(root_1, stream_componentTypeList.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAdditionGroup"


	public static class extensionEndMarker_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionEndMarker"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:320:1: extensionEndMarker : ',' '...' -> ^( EXTENSION_END_MARKER ) ;
	public final ASN1Parser.extensionEndMarker_return extensionEndMarker() throws RecognitionException {
		ASN1Parser.extensionEndMarker_return retval = new ASN1Parser.extensionEndMarker_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal208 = null;
		Token string_literal209 = null;

		CommonTree char_literal208_tree = null;
		CommonTree string_literal209_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleTokenStream stream_86 = new RewriteRuleTokenStream(adaptor, "token 86");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:320:21: ( ',' '...' -> ^( EXTENSION_END_MARKER ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:321:3: ',' '...'
			{
				char_literal208 = (Token) match(input, 83, FOLLOW_83_in_extensionEndMarker2224);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_83.add(char_literal208);


				string_literal209 = (Token) match(input, 86, FOLLOW_86_in_extensionEndMarker2226);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_86.add(string_literal209);


				// AST REWRITE
				// elements: 
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 321:13: -> ^( EXTENSION_END_MARKER )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:321:16: ^( EXTENSION_END_MARKER )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(EXTENSION_END_MARKER, "EXTENSION_END_MARKER")
							                                        , root_1
							                                        );

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionEndMarker"


	public static class extensionAndException_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "extensionAndException"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:323:1: extensionAndException : '...' ( exceptionSpec )? -> ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? ) ;
	public final ASN1Parser.extensionAndException_return extensionAndException() throws RecognitionException {
		ASN1Parser.extensionAndException_return retval = new ASN1Parser.extensionAndException_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal210 = null;
		ASN1Parser.exceptionSpec_return exceptionSpec211 = null;


		CommonTree string_literal210_tree = null;
		RewriteRuleTokenStream stream_86 = new RewriteRuleTokenStream(adaptor, "token 86");
		RewriteRuleSubtreeStream stream_exceptionSpec = new RewriteRuleSubtreeStream(adaptor, "rule exceptionSpec");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:323:24: ( '...' ( exceptionSpec )? -> ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:324:3: '...' ( exceptionSpec )?
			{
				string_literal210 = (Token) match(input, 86, FOLLOW_86_in_extensionAndException2245);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_86.add(string_literal210);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:324:9: ( exceptionSpec )?
				int alt62 = 2;
				int LA62_0 = input.LA(1);

				if ((LA62_0 == 80)) {
					alt62 = 1;
				}
				switch (alt62) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:324:9: exceptionSpec
					{
						pushFollow(FOLLOW_exceptionSpec_in_extensionAndException2247);
						exceptionSpec211 = exceptionSpec();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exceptionSpec.add(exceptionSpec211.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: exceptionSpec
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 324:24: -> ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:324:27: ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(EXTENSION_AND_EXCEPTION, "EXTENSION_AND_EXCEPTION")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:324:53: ( exceptionSpec )?
							if (stream_exceptionSpec.hasNext()) {
								adaptor.addChild(root_1, stream_exceptionSpec.nextTree());

							}
							stream_exceptionSpec.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extensionAndException"


	public static class exceptionSpec_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "exceptionSpec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:326:1: exceptionSpec : ( ( '!' definedValue ) -> ^( EXCEPTION_SPEC definedValue ) | ( '!' type ':' value ) -> ^( EXCEPTION_SPEC type value ) | ( '!' INT ) -> ^( EXCEPTION_SPEC INT ) );
	public final ASN1Parser.exceptionSpec_return exceptionSpec() throws RecognitionException {
		ASN1Parser.exceptionSpec_return retval = new ASN1Parser.exceptionSpec_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal212 = null;
		Token char_literal214 = null;
		Token char_literal216 = null;
		Token char_literal218 = null;
		Token INT219 = null;
		ASN1Parser.definedValue_return definedValue213 = null;

		ASN1Parser.type_return type215 = null;

		ASN1Parser.value_return value217 = null;


		CommonTree char_literal212_tree = null;
		CommonTree char_literal214_tree = null;
		CommonTree char_literal216_tree = null;
		CommonTree char_literal218_tree = null;
		CommonTree INT219_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_80 = new RewriteRuleTokenStream(adaptor, "token 80");
		RewriteRuleTokenStream stream_87 = new RewriteRuleTokenStream(adaptor, "token 87");
		RewriteRuleSubtreeStream stream_definedValue = new RewriteRuleSubtreeStream(adaptor, "rule definedValue");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:326:17: ( ( '!' definedValue ) -> ^( EXCEPTION_SPEC definedValue ) | ( '!' type ':' value ) -> ^( EXCEPTION_SPEC type value ) | ( '!' INT ) -> ^( EXCEPTION_SPEC INT ) )
			int alt63 = 3;
			int LA63_0 = input.LA(1);

			if ((LA63_0 == 80)) {
				switch (input.LA(2)) {
					case INT: {
						alt63 = 3;
					}
					break;
					case ID: {
						switch (input.LA(3)) {
							case 84: {
								int LA63_5 = input.LA(4);

								if ((LA63_5 == ID)) {
									int LA63_7 = input.LA(5);

									if (((LA63_7 >= 82 && LA63_7 <= 83) || LA63_7 == 161)) {
										alt63 = 1;
									} else if ((LA63_7 == 81 || LA63_7 == 87)) {
										alt63 = 2;
									} else {
										if (state.backtracking > 0) {
											state.failed = true;
											return retval;
										}
										NoViableAltException nvae =
										new NoViableAltException("", 63, 7, input);

										throw nvae;

									}
								} else {
									if (state.backtracking > 0) {
										state.failed = true;
										return retval;
									}
									NoViableAltException nvae =
									new NoViableAltException("", 63, 5, input);

									throw nvae;

								}
							}
							break;
							case 81:
							case 87:
							case 90: {
								alt63 = 2;
							}
							break;
							case 82:
							case 83:
							case 161: {
								alt63 = 1;
							}
							break;
							default:
								if (state.backtracking > 0) {
									state.failed = true;
									return retval;
								}
								NoViableAltException nvae =
								new NoViableAltException("", 63, 3, input);

								throw nvae;

						}

					}
					break;
					case 81:
					case 87:
					case 96:
					case 97:
					case 98:
					case 99:
					case 100:
					case 106:
					case 113:
					case 114:
					case 115:
					case 121:
					case 123:
					case 127:
					case 128:
					case 129:
					case 137:
					case 138:
					case 139:
					case 140:
					case 143:
					case 146:
					case 149:
					case 150:
					case 151:
					case 152:
					case 154: {
						alt63 = 2;
					}
					break;
					default:
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 63, 1, input);

						throw nvae;

				}

			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 63, 0, input);

				throw nvae;

			}
			switch (alt63) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:327:3: ( '!' definedValue )
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:327:3: ( '!' definedValue )
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:327:4: '!' definedValue
					{
						char_literal212 = (Token) match(input, 80, FOLLOW_80_in_exceptionSpec2270);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_80.add(char_literal212);


						pushFollow(FOLLOW_definedValue_in_exceptionSpec2272);
						definedValue213 = definedValue();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_definedValue.add(definedValue213.getTree());

					}


					// AST REWRITE
					// elements: definedValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 327:23: -> ^( EXCEPTION_SPEC definedValue )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:327:26: ^( EXCEPTION_SPEC definedValue )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(EXCEPTION_SPEC, "EXCEPTION_SPEC")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_definedValue.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:328:5: ( '!' type ':' value )
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:328:5: ( '!' type ':' value )
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:328:7: '!' type ':' value
					{
						char_literal214 = (Token) match(input, 80, FOLLOW_80_in_exceptionSpec2290);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_80.add(char_literal214);


						pushFollow(FOLLOW_type_in_exceptionSpec2292);
						type215 = type();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_type.add(type215.getTree());

						char_literal216 = (Token) match(input, 87, FOLLOW_87_in_exceptionSpec2294);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_87.add(char_literal216);


						pushFollow(FOLLOW_value_in_exceptionSpec2296);
						value217 = value();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_value.add(value217.getTree());

					}


					// AST REWRITE
					// elements: type, value
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 328:28: -> ^( EXCEPTION_SPEC type value )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:328:31: ^( EXCEPTION_SPEC type value )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(EXCEPTION_SPEC, "EXCEPTION_SPEC")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_type.nextTree());

								adaptor.addChild(root_1, stream_value.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:329:5: ( '!' INT )
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:329:5: ( '!' INT )
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:329:7: '!' INT
					{
						char_literal218 = (Token) match(input, 80, FOLLOW_80_in_exceptionSpec2316);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_80.add(char_literal218);


						INT219 = (Token) match(input, INT, FOLLOW_INT_in_exceptionSpec2318);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT219);


					}


					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 329:17: -> ^( EXCEPTION_SPEC INT )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:329:20: ^( EXCEPTION_SPEC INT )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(EXCEPTION_SPEC, "EXCEPTION_SPEC")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_INT.nextNode()
								                );

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exceptionSpec"


	public static class sequenceOfType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "sequenceOfType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:332:1: sequenceOfType : 'SEQUENCE' ( constraint )? 'OF' sOfComponentType ( ';' )? -> ^( SEQUENCEOF sOfComponentType ( constraint )? ) ;
	public final ASN1Parser.sequenceOfType_return sequenceOfType() throws RecognitionException {
		ASN1Parser.sequenceOfType_return retval = new ASN1Parser.sequenceOfType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal220 = null;
		Token string_literal222 = null;
		Token char_literal224 = null;
		ASN1Parser.constraint_return constraint221 = null;

		ASN1Parser.sOfComponentType_return sOfComponentType223 = null;


		CommonTree string_literal220_tree = null;
		CommonTree string_literal222_tree = null;
		CommonTree char_literal224_tree = null;
		RewriteRuleTokenStream stream_139 = new RewriteRuleTokenStream(adaptor, "token 139");
		RewriteRuleTokenStream stream_130 = new RewriteRuleTokenStream(adaptor, "token 130");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_sOfComponentType = new RewriteRuleSubtreeStream(adaptor, "rule sOfComponentType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:332:18: ( 'SEQUENCE' ( constraint )? 'OF' sOfComponentType ( ';' )? -> ^( SEQUENCEOF sOfComponentType ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:2: 'SEQUENCE' ( constraint )? 'OF' sOfComponentType ( ';' )?
			{
				string_literal220 = (Token) match(input, 139, FOLLOW_139_in_sequenceOfType2342);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_139.add(string_literal220);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:13: ( constraint )?
				int alt64 = 2;
				int LA64_0 = input.LA(1);

				if ((LA64_0 == 81)) {
					alt64 = 1;
				}
				switch (alt64) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:13: constraint
					{
						pushFollow(FOLLOW_constraint_in_sequenceOfType2344);
						constraint221 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint221.getTree());

					}
					break;

				}


				string_literal222 = (Token) match(input, 130, FOLLOW_130_in_sequenceOfType2347);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_130.add(string_literal222);


				pushFollow(FOLLOW_sOfComponentType_in_sequenceOfType2349);
				sOfComponentType223 = sOfComponentType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_sOfComponentType.add(sOfComponentType223.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:47: ( ';' )?
				int alt65 = 2;
				int LA65_0 = input.LA(1);

				if ((LA65_0 == 89)) {
					alt65 = 1;
				}
				switch (alt65) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:47: ';'
					{
						char_literal224 = (Token) match(input, 89, FOLLOW_89_in_sequenceOfType2351);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_89.add(char_literal224);


					}
					break;

				}


				// AST REWRITE
				// elements: constraint, sOfComponentType
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 333:52: -> ^( SEQUENCEOF sOfComponentType ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:55: ^( SEQUENCEOF sOfComponentType ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SEQUENCEOF, "SEQUENCEOF")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_sOfComponentType.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:333:85: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequenceOfType"


	public static class namedType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "namedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:335:1: namedType : ID type -> ^( NAMED_TYPE ID type ) ;
	public final ASN1Parser.namedType_return namedType() throws RecognitionException {
		ASN1Parser.namedType_return retval = new ASN1Parser.namedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID225 = null;
		ASN1Parser.type_return type226 = null;


		CommonTree ID225_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:336:2: ( ID type -> ^( NAMED_TYPE ID type ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:337:2: ID type
			{
				ID225 = (Token) match(input, ID, FOLLOW_ID_in_namedType2373);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID225);


				pushFollow(FOLLOW_type_in_namedType2375);
				type226 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type226.getTree());

				// AST REWRITE
				// elements: type, ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 337:10: -> ^( NAMED_TYPE ID type )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:337:13: ^( NAMED_TYPE ID type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(NAMED_TYPE, "NAMED_TYPE")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedType"


	public static class taggedType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "taggedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:339:1: taggedType : '[' ( tagClass )? classNumber ']' ( taggingMethod )? type -> ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type ) ;
	public final ASN1Parser.taggedType_return taggedType() throws RecognitionException {
		ASN1Parser.taggedType_return retval = new ASN1Parser.taggedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal227 = null;
		Token char_literal230 = null;
		ASN1Parser.tagClass_return tagClass228 = null;

		ASN1Parser.classNumber_return classNumber229 = null;

		ASN1Parser.taggingMethod_return taggingMethod231 = null;

		ASN1Parser.type_return type232 = null;


		CommonTree char_literal227_tree = null;
		CommonTree char_literal230_tree = null;
		RewriteRuleTokenStream stream_156 = new RewriteRuleTokenStream(adaptor, "token 156");
		RewriteRuleTokenStream stream_154 = new RewriteRuleTokenStream(adaptor, "token 154");
		RewriteRuleSubtreeStream stream_taggingMethod = new RewriteRuleSubtreeStream(adaptor, "rule taggingMethod");
		RewriteRuleSubtreeStream stream_classNumber = new RewriteRuleSubtreeStream(adaptor, "rule classNumber");
		RewriteRuleSubtreeStream stream_tagClass = new RewriteRuleSubtreeStream(adaptor, "rule tagClass");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:339:14: ( '[' ( tagClass )? classNumber ']' ( taggingMethod )? type -> ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:3: '[' ( tagClass )? classNumber ']' ( taggingMethod )? type
			{
				char_literal227 = (Token) match(input, 154, FOLLOW_154_in_taggedType2397);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_154.add(char_literal227);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:7: ( tagClass )?
				int alt66 = 2;
				int LA66_0 = input.LA(1);

				if ((LA66_0 == 93 || LA66_0 == 136 || LA66_0 == 148)) {
					alt66 = 1;
				}
				switch (alt66) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:7: tagClass
					{
						pushFollow(FOLLOW_tagClass_in_taggedType2399);
						tagClass228 = tagClass();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_tagClass.add(tagClass228.getTree());

					}
					break;

				}


				pushFollow(FOLLOW_classNumber_in_taggedType2402);
				classNumber229 = classNumber();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_classNumber.add(classNumber229.getTree());

				char_literal230 = (Token) match(input, 156, FOLLOW_156_in_taggedType2404);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_156.add(char_literal230);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:33: ( taggingMethod )?
				int alt67 = 2;
				int LA67_0 = input.LA(1);

				if ((LA67_0 == 94 || LA67_0 == 108 || LA67_0 == 117)) {
					alt67 = 1;
				}
				switch (alt67) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:33: taggingMethod
					{
						pushFollow(FOLLOW_taggingMethod_in_taggedType2406);
						taggingMethod231 = taggingMethod();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_taggingMethod.add(taggingMethod231.getTree());

					}
					break;

				}


				pushFollow(FOLLOW_type_in_taggedType2409);
				type232 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type232.getTree());

				// AST REWRITE
				// elements: taggingMethod, tagClass, type, classNumber
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 340:53: -> ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:56: ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(TAGGED_TYPE, "TAGGED_TYPE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_classNumber.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:82: ( tagClass )?
							if (stream_tagClass.hasNext()) {
								adaptor.addChild(root_1, stream_tagClass.nextTree());

							}
							stream_tagClass.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:340:92: ( taggingMethod )?
							if (stream_taggingMethod.hasNext()) {
								adaptor.addChild(root_1, stream_taggingMethod.nextTree());

							}
							stream_taggingMethod.reset();

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "taggedType"


	public static class classNumber_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "classNumber"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:342:1: classNumber : ( INT | definedValue );
	public final ASN1Parser.classNumber_return classNumber() throws RecognitionException {
		ASN1Parser.classNumber_return retval = new ASN1Parser.classNumber_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token INT233 = null;
		ASN1Parser.definedValue_return definedValue234 = null;


		CommonTree INT233_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:342:15: ( INT | definedValue )
			int alt68 = 2;
			int LA68_0 = input.LA(1);

			if ((LA68_0 == INT)) {
				alt68 = 1;
			} else if ((LA68_0 == ID)) {
				alt68 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 68, 0, input);

				throw nvae;

			}
			switch (alt68) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:343:2: INT
				{
					root_0 = (CommonTree) adaptor.nil();


					INT233 = (Token) match(input, INT, FOLLOW_INT_in_classNumber2436);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						INT233_tree =
						(CommonTree) adaptor.create(INT233)
						;
						adaptor.addChild(root_0, INT233_tree);
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:343:8: definedValue
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_definedValue_in_classNumber2440);
					definedValue234 = definedValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, definedValue234.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classNumber"


	public static class tagClass_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "tagClass"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:345:1: tagClass : ( 'UNIVERSAL' | 'APPLICATION' | 'PRIVATE' );
	public final ASN1Parser.tagClass_return tagClass() throws RecognitionException {
		ASN1Parser.tagClass_return retval = new ASN1Parser.tagClass_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set235 = null;

		CommonTree set235_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:345:10: ( 'UNIVERSAL' | 'APPLICATION' | 'PRIVATE' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set235 = (Token) input.LT(1);

				if (input.LA(1) == 93 || input.LA(1) == 136 || input.LA(1) == 148) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set235)
						                );
					}
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tagClass"


	public static class realType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "realType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:348:1: realType : 'REAL' ( constraint )? -> ^( REAL ( constraint )? ) ;
	public final ASN1Parser.realType_return realType() throws RecognitionException {
		ASN1Parser.realType_return retval = new ASN1Parser.realType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal236 = null;
		ASN1Parser.constraint_return constraint237 = null;


		CommonTree string_literal236_tree = null;
		RewriteRuleTokenStream stream_138 = new RewriteRuleTokenStream(adaptor, "token 138");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:348:12: ( 'REAL' ( constraint )? -> ^( REAL ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:349:3: 'REAL' ( constraint )?
			{
				string_literal236 = (Token) match(input, 138, FOLLOW_138_in_realType2469);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_138.add(string_literal236);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:349:10: ( constraint )?
				int alt69 = 2;
				int LA69_0 = input.LA(1);

				if ((LA69_0 == 81)) {
					alt69 = 1;
				}
				switch (alt69) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:349:10: constraint
					{
						pushFollow(FOLLOW_constraint_in_realType2471);
						constraint237 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint237.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: constraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 349:22: -> ^( REAL ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:349:25: ^( REAL ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(REAL, "REAL")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:349:32: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "realType"


	public static class integerType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "integerType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:351:1: integerType : 'INTEGER' ( constraint )? ( '{' namedNumberList '}' )? -> ^( INTEGER ( namedNumberList )? ( constraint )? ) ;
	public final ASN1Parser.integerType_return integerType() throws RecognitionException {
		ASN1Parser.integerType_return retval = new ASN1Parser.integerType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal238 = null;
		Token char_literal240 = null;
		Token char_literal242 = null;
		ASN1Parser.constraint_return constraint239 = null;

		ASN1Parser.namedNumberList_return namedNumberList241 = null;


		CommonTree string_literal238_tree = null;
		CommonTree char_literal240_tree = null;
		CommonTree char_literal242_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_121 = new RewriteRuleTokenStream(adaptor, "token 121");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_namedNumberList = new RewriteRuleSubtreeStream(adaptor, "rule namedNumberList");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:351:15: ( 'INTEGER' ( constraint )? ( '{' namedNumberList '}' )? -> ^( INTEGER ( namedNumberList )? ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:3: 'INTEGER' ( constraint )? ( '{' namedNumberList '}' )?
			{
				string_literal238 = (Token) match(input, 121, FOLLOW_121_in_integerType2493);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_121.add(string_literal238);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:13: ( constraint )?
				int alt70 = 2;
				int LA70_0 = input.LA(1);

				if ((LA70_0 == 81)) {
					alt70 = 1;
				}
				switch (alt70) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:13: constraint
					{
						pushFollow(FOLLOW_constraint_in_integerType2495);
						constraint239 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint239.getTree());

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:25: ( '{' namedNumberList '}' )?
				int alt71 = 2;
				int LA71_0 = input.LA(1);

				if ((LA71_0 == 159)) {
					alt71 = 1;
				}
				switch (alt71) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:26: '{' namedNumberList '}'
					{
						char_literal240 = (Token) match(input, 159, FOLLOW_159_in_integerType2499);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_159.add(char_literal240);


						pushFollow(FOLLOW_namedNumberList_in_integerType2501);
						namedNumberList241 = namedNumberList();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_namedNumberList.add(namedNumberList241.getTree());

						char_literal242 = (Token) match(input, 161, FOLLOW_161_in_integerType2503);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_161.add(char_literal242);


					}
					break;

				}


				// AST REWRITE
				// elements: constraint, namedNumberList
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 352:52: -> ^( INTEGER ( namedNumberList )? ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:55: ^( INTEGER ( namedNumberList )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(INTEGER, "INTEGER")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:65: ( namedNumberList )?
							if (stream_namedNumberList.hasNext()) {
								adaptor.addChild(root_1, stream_namedNumberList.nextTree());

							}
							stream_namedNumberList.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:352:82: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integerType"


	public static class namedNumberList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "namedNumberList"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:354:1: namedNumberList : namedNumber ( ',' namedNumber )* -> ^( VEC ( namedNumber )+ ) ;
	public final ASN1Parser.namedNumberList_return namedNumberList() throws RecognitionException {
		ASN1Parser.namedNumberList_return retval = new ASN1Parser.namedNumberList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal244 = null;
		ASN1Parser.namedNumber_return namedNumber243 = null;

		ASN1Parser.namedNumber_return namedNumber245 = null;


		CommonTree char_literal244_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_namedNumber = new RewriteRuleSubtreeStream(adaptor, "rule namedNumber");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:354:18: ( namedNumber ( ',' namedNumber )* -> ^( VEC ( namedNumber )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:355:3: namedNumber ( ',' namedNumber )*
			{
				pushFollow(FOLLOW_namedNumber_in_namedNumberList2528);
				namedNumber243 = namedNumber();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_namedNumber.add(namedNumber243.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:355:15: ( ',' namedNumber )*
				loop72:
				do {
					int alt72 = 2;
					int LA72_0 = input.LA(1);

					if ((LA72_0 == 83)) {
						alt72 = 1;
					}


					switch (alt72) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:355:16: ',' namedNumber
						{
							char_literal244 = (Token) match(input, 83, FOLLOW_83_in_namedNumberList2531);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal244);


							pushFollow(FOLLOW_namedNumber_in_namedNumberList2533);
							namedNumber245 = namedNumber();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_namedNumber.add(namedNumber245.getTree());

						}
						break;

						default:
							break loop72;
					}
				} while (true);


				// AST REWRITE
				// elements: namedNumber
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 355:34: -> ^( VEC ( namedNumber )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:355:37: ^( VEC ( namedNumber )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_namedNumber.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_namedNumber.hasNext()) {
								adaptor.addChild(root_1, stream_namedNumber.nextTree());

							}
							stream_namedNumber.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedNumberList"


	public static class namedNumber_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "namedNumber"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:357:1: namedNumber : ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) ;
	public final ASN1Parser.namedNumber_return namedNumber() throws RecognitionException {
		ASN1Parser.namedNumber_return retval = new ASN1Parser.namedNumber_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID246 = null;
		Token char_literal247 = null;
		Token INT248 = null;
		Token char_literal249 = null;

		CommonTree ID246_tree = null;
		CommonTree char_literal247_tree = null;
		CommonTree INT248_tree = null;
		CommonTree char_literal249_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:357:14: ( ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:358:3: ID '(' INT ')'
			{
				ID246 = (Token) match(input, ID, FOLLOW_ID_in_namedNumber2555);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID246);


				char_literal247 = (Token) match(input, 81, FOLLOW_81_in_namedNumber2557);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_81.add(char_literal247);


				INT248 = (Token) match(input, INT, FOLLOW_INT_in_namedNumber2559);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_INT.add(INT248);


				char_literal249 = (Token) match(input, 82, FOLLOW_82_in_namedNumber2561);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_82.add(char_literal249);


				// AST REWRITE
				// elements: INT, ID
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 358:18: -> ^( NAME_NUMBER_FORM ID INT )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:358:21: ^( NAME_NUMBER_FORM ID INT )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(NAME_NUMBER_FORM, "NAME_NUMBER_FORM")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							adaptor.addChild(
							                root_1,
							                stream_INT.nextNode()
							                );

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedNumber"


	public static class booleanType_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "booleanType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:360:1: booleanType : 'BOOLEAN' ( constraint )? -> ^( BOOLEAN ( constraint )? ) ;
	public final ASN1Parser.booleanType_return booleanType() throws RecognitionException {
		ASN1Parser.booleanType_return retval = new ASN1Parser.booleanType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal250 = null;
		ASN1Parser.constraint_return constraint251 = null;


		CommonTree string_literal250_tree = null;
		RewriteRuleTokenStream stream_98 = new RewriteRuleTokenStream(adaptor, "token 98");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:360:15: ( 'BOOLEAN' ( constraint )? -> ^( BOOLEAN ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:361:3: 'BOOLEAN' ( constraint )?
			{
				string_literal250 = (Token) match(input, 98, FOLLOW_98_in_booleanType2583);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_98.add(string_literal250);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:361:13: ( constraint )?
				int alt73 = 2;
				int LA73_0 = input.LA(1);

				if ((LA73_0 == 81)) {
					alt73 = 1;
				}
				switch (alt73) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:361:13: constraint
					{
						pushFollow(FOLLOW_constraint_in_booleanType2585);
						constraint251 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint251.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: constraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 361:25: -> ^( BOOLEAN ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:361:28: ^( BOOLEAN ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(BOOLEAN, "BOOLEAN")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:361:38: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanType"


	public static class constraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "constraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:364:1: constraint : '(' constraintSpec ( exceptionSpec )? ')' -> ^( CONSTRAINT constraintSpec ( exceptionSpec )? ) ;
	public final ASN1Parser.constraint_return constraint() throws RecognitionException {
		ASN1Parser.constraint_return retval = new ASN1Parser.constraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal252 = null;
		Token char_literal255 = null;
		ASN1Parser.constraintSpec_return constraintSpec253 = null;

		ASN1Parser.exceptionSpec_return exceptionSpec254 = null;


		CommonTree char_literal252_tree = null;
		CommonTree char_literal255_tree = null;
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");
		RewriteRuleSubtreeStream stream_constraintSpec = new RewriteRuleSubtreeStream(adaptor, "rule constraintSpec");
		RewriteRuleSubtreeStream stream_exceptionSpec = new RewriteRuleSubtreeStream(adaptor, "rule exceptionSpec");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:364:14: ( '(' constraintSpec ( exceptionSpec )? ')' -> ^( CONSTRAINT constraintSpec ( exceptionSpec )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:365:3: '(' constraintSpec ( exceptionSpec )? ')'
			{
				char_literal252 = (Token) match(input, 81, FOLLOW_81_in_constraint2609);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_81.add(char_literal252);


				pushFollow(FOLLOW_constraintSpec_in_constraint2611);
				constraintSpec253 = constraintSpec();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_constraintSpec.add(constraintSpec253.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:365:22: ( exceptionSpec )?
				int alt74 = 2;
				int LA74_0 = input.LA(1);

				if ((LA74_0 == 80)) {
					alt74 = 1;
				}
				switch (alt74) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:365:22: exceptionSpec
					{
						pushFollow(FOLLOW_exceptionSpec_in_constraint2613);
						exceptionSpec254 = exceptionSpec();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exceptionSpec.add(exceptionSpec254.getTree());

					}
					break;

				}


				char_literal255 = (Token) match(input, 82, FOLLOW_82_in_constraint2615);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_82.add(char_literal255);


				// AST REWRITE
				// elements: constraintSpec, exceptionSpec
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 366:3: -> ^( CONSTRAINT constraintSpec ( exceptionSpec )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:366:6: ^( CONSTRAINT constraintSpec ( exceptionSpec )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT, "CONSTRAINT")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_constraintSpec.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:366:34: ( exceptionSpec )?
							if (stream_exceptionSpec.hasNext()) {
								adaptor.addChild(root_1, stream_exceptionSpec.nextTree());

							}
							stream_exceptionSpec.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraint"


	public static class constraintSpec_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "constraintSpec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:369:1: constraintSpec : elementSetSpecs ;
	public final ASN1Parser.constraintSpec_return constraintSpec() throws RecognitionException {
		ASN1Parser.constraintSpec_return retval = new ASN1Parser.constraintSpec_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.elementSetSpecs_return elementSetSpecs256 = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:369:18: ( elementSetSpecs )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:370:3: elementSetSpecs
			{
				root_0 = (CommonTree) adaptor.nil();


				pushFollow(FOLLOW_elementSetSpecs_in_constraintSpec2642);
				elementSetSpecs256 = elementSetSpecs();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) adaptor.addChild(root_0, elementSetSpecs256.getTree());

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraintSpec"


	public static class elementSetSpecs_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "elementSetSpecs"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:372:1: elementSetSpecs : elementSetSpec ( extensionEndMarker ( ',' elementSetSpec )? )? -> ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? ) ;
	public final ASN1Parser.elementSetSpecs_return elementSetSpecs() throws RecognitionException {
		ASN1Parser.elementSetSpecs_return retval = new ASN1Parser.elementSetSpecs_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal259 = null;
		ASN1Parser.elementSetSpec_return elementSetSpec257 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker258 = null;

		ASN1Parser.elementSetSpec_return elementSetSpec260 = null;


		CommonTree char_literal259_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionEndMarker = new RewriteRuleSubtreeStream(adaptor, "rule extensionEndMarker");
		RewriteRuleSubtreeStream stream_elementSetSpec = new RewriteRuleSubtreeStream(adaptor, "rule elementSetSpec");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:372:19: ( elementSetSpec ( extensionEndMarker ( ',' elementSetSpec )? )? -> ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:373:3: elementSetSpec ( extensionEndMarker ( ',' elementSetSpec )? )?
			{
				pushFollow(FOLLOW_elementSetSpec_in_elementSetSpecs2654);
				elementSetSpec257 = elementSetSpec();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_elementSetSpec.add(elementSetSpec257.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:373:18: ( extensionEndMarker ( ',' elementSetSpec )? )?
				int alt76 = 2;
				int LA76_0 = input.LA(1);

				if ((LA76_0 == 83)) {
					alt76 = 1;
				}
				switch (alt76) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:373:19: extensionEndMarker ( ',' elementSetSpec )?
					{
						pushFollow(FOLLOW_extensionEndMarker_in_elementSetSpecs2657);
						extensionEndMarker258 = extensionEndMarker();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker258.getTree());

						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:373:38: ( ',' elementSetSpec )?
						int alt75 = 2;
						int LA75_0 = input.LA(1);

						if ((LA75_0 == 83)) {
							alt75 = 1;
						}
						switch (alt75) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:373:40: ',' elementSetSpec
							{
								char_literal259 = (Token) match(input, 83, FOLLOW_83_in_elementSetSpecs2661);
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_83.add(char_literal259);


								pushFollow(FOLLOW_elementSetSpec_in_elementSetSpecs2663);
								elementSetSpec260 = elementSetSpec();

								state._fsp--;
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_elementSetSpec.add(elementSetSpec260.getTree());

							}
							break;

						}


					}
					break;

				}


				// AST REWRITE
				// elements: extensionEndMarker, elementSetSpec, elementSetSpec
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 374:3: -> ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:374:6: ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(stream_elementSetSpec.nextNode(), root_1);

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:374:23: ( extensionEndMarker ( elementSetSpec )? )?
							if (stream_extensionEndMarker.hasNext() || stream_elementSetSpec.hasNext()) {
								adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:374:43: ( elementSetSpec )?
								if (stream_elementSetSpec.hasNext()) {
									adaptor.addChild(root_1, stream_elementSetSpec.nextTree());

								}
								stream_elementSetSpec.reset();

							}
							stream_extensionEndMarker.reset();
							stream_elementSetSpec.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elementSetSpecs"


	public static class elementSetSpec_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "elementSetSpec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:376:1: elementSetSpec : ( unions -> ^( UNION unions ) | 'ALL' exclusions -> ^( UNION 'ALL' exclusions ) );
	public final ASN1Parser.elementSetSpec_return elementSetSpec() throws RecognitionException {
		ASN1Parser.elementSetSpec_return retval = new ASN1Parser.elementSetSpec_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal262 = null;
		ASN1Parser.unions_return unions261 = null;

		ASN1Parser.exclusions_return exclusions263 = null;


		CommonTree string_literal262_tree = null;
		RewriteRuleTokenStream stream_92 = new RewriteRuleTokenStream(adaptor, "token 92");
		RewriteRuleSubtreeStream stream_unions = new RewriteRuleSubtreeStream(adaptor, "rule unions");
		RewriteRuleSubtreeStream stream_exclusions = new RewriteRuleSubtreeStream(adaptor, "rule exclusions");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:376:18: ( unions -> ^( UNION unions ) | 'ALL' exclusions -> ^( UNION 'ALL' exclusions ) )
			int alt77 = 2;
			int LA77_0 = input.LA(1);

			if ((LA77_0 == ID || LA77_0 == INT || LA77_0 == REAL_NUMBER || (LA77_0 >= 80 && LA77_0 <= 83) || (LA77_0 >= 96 && LA77_0 <= 100) || (
			                                                                                                                                    LA77_0
			                                                                                                                                    >= 106
			                                                                                                                                    &&
			                                                                                                                                    LA77_0
			                                                                                                                                    <= 107)
			     || LA77_0 == 111 || (LA77_0 >= 113 && LA77_0 <= 115) || (LA77_0 >= 120 && LA77_0 <= 123) || (LA77_0 >= 125 && LA77_0 <= 129)
			     || LA77_0 == 131 || (LA77_0 >= 133 && LA77_0 <= 134) || (LA77_0 >= 137 && LA77_0 <= 141) || LA77_0 == 143 || (LA77_0 >= 145
			                                                                                                                   && LA77_0 <= 147) || (
			                                                                                                                                        LA77_0
			                                                                                                                                        >= 149
			                                                                                                                                        &&
			                                                                                                                                        LA77_0
			                                                                                                                                        <= 154)
			     || LA77_0 == 158 || LA77_0 == 160)) {
				alt77 = 1;
			} else if ((LA77_0 == 92)) {
				alt77 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 77, 0, input);

				throw nvae;

			}
			switch (alt77) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:377:3: unions
				{
					pushFollow(FOLLOW_unions_in_elementSetSpec2695);
					unions261 = unions();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_unions.add(unions261.getTree());

					// AST REWRITE
					// elements: unions
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 377:10: -> ^( UNION unions )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:377:13: ^( UNION unions )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(UNION, "UNION")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_unions.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:378:5: 'ALL' exclusions
				{
					string_literal262 = (Token) match(input, 92, FOLLOW_92_in_elementSetSpec2709);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_92.add(string_literal262);


					pushFollow(FOLLOW_exclusions_in_elementSetSpec2711);
					exclusions263 = exclusions();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_exclusions.add(exclusions263.getTree());

					// AST REWRITE
					// elements: exclusions, 92
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 378:22: -> ^( UNION 'ALL' exclusions )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:378:25: ^( UNION 'ALL' exclusions )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(UNION, "UNION")
								                                        , root_1
								                                        );

								adaptor.addChild(
								                root_1,
								                stream_92.nextNode()
								                );

								adaptor.addChild(root_1, stream_exclusions.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elementSetSpec"


	public static class exclusions_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "exclusions"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:380:1: exclusions : 'EXCEPT' elements -> ^( elements ) ;
	public final ASN1Parser.exclusions_return exclusions() throws RecognitionException {
		ASN1Parser.exclusions_return retval = new ASN1Parser.exclusions_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal264 = null;
		ASN1Parser.elements_return elements265 = null;


		CommonTree string_literal264_tree = null;
		RewriteRuleTokenStream stream_107 = new RewriteRuleTokenStream(adaptor, "token 107");
		RewriteRuleSubtreeStream stream_elements = new RewriteRuleSubtreeStream(adaptor, "rule elements");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:380:14: ( 'EXCEPT' elements -> ^( elements ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:381:3: 'EXCEPT' elements
			{
				string_literal264 = (Token) match(input, 107, FOLLOW_107_in_exclusions2733);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_107.add(string_literal264);


				pushFollow(FOLLOW_elements_in_exclusions2735);
				elements265 = elements();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_elements.add(elements265.getTree());

				// AST REWRITE
				// elements: elements
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 382:3: -> ^( elements )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:382:6: ^( elements )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(stream_elements.nextNode(), root_1);

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exclusions"


	public static class unions_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "unions"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:384:1: unions : intersections ( unionMark intersections )* -> ^( VEC ( intersections )+ ) ;
	public final ASN1Parser.unions_return unions() throws RecognitionException {
		ASN1Parser.unions_return retval = new ASN1Parser.unions_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.intersections_return intersections266 = null;

		ASN1Parser.unionMark_return unionMark267 = null;

		ASN1Parser.intersections_return intersections268 = null;


		RewriteRuleSubtreeStream stream_unionMark = new RewriteRuleSubtreeStream(adaptor, "rule unionMark");
		RewriteRuleSubtreeStream stream_intersections = new RewriteRuleSubtreeStream(adaptor, "rule intersections");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:384:11: ( intersections ( unionMark intersections )* -> ^( VEC ( intersections )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:385:3: intersections ( unionMark intersections )*
			{
				pushFollow(FOLLOW_intersections_in_unions2757);
				intersections266 = intersections();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_intersections.add(intersections266.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:385:17: ( unionMark intersections )*
				loop78:
				do {
					int alt78 = 2;
					int LA78_0 = input.LA(1);

					if ((LA78_0 == 147 || LA78_0 == 160)) {
						alt78 = 1;
					}


					switch (alt78) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:385:18: unionMark intersections
						{
							pushFollow(FOLLOW_unionMark_in_unions2760);
							unionMark267 = unionMark();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_unionMark.add(unionMark267.getTree());

							pushFollow(FOLLOW_intersections_in_unions2762);
							intersections268 = intersections();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_intersections.add(intersections268.getTree());

						}
						break;

						default:
							break loop78;
					}
				} while (true);


				// AST REWRITE
				// elements: intersections
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 386:3: -> ^( VEC ( intersections )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:386:6: ^( VEC ( intersections )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_intersections.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_intersections.hasNext()) {
								adaptor.addChild(root_1, stream_intersections.nextTree());

							}
							stream_intersections.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unions"


	public static class intersections_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "intersections"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:388:1: intersections : intersectionElement ( intersectionMark intersectionElement )* -> ^( VEC ( intersectionElement )+ ) ;
	public final ASN1Parser.intersections_return intersections() throws RecognitionException {
		ASN1Parser.intersections_return retval = new ASN1Parser.intersections_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.intersectionElement_return intersectionElement269 = null;

		ASN1Parser.intersectionMark_return intersectionMark270 = null;

		ASN1Parser.intersectionElement_return intersectionElement271 = null;


		RewriteRuleSubtreeStream stream_intersectionMark = new RewriteRuleSubtreeStream(adaptor, "rule intersectionMark");
		RewriteRuleSubtreeStream stream_intersectionElement = new RewriteRuleSubtreeStream(adaptor, "rule intersectionElement");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:388:17: ( intersectionElement ( intersectionMark intersectionElement )* -> ^( VEC ( intersectionElement )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:389:3: intersectionElement ( intersectionMark intersectionElement )*
			{
				pushFollow(FOLLOW_intersectionElement_in_intersections2787);
				intersectionElement269 = intersectionElement();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_intersectionElement.add(intersectionElement269.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:389:23: ( intersectionMark intersectionElement )*
				loop79:
				do {
					int alt79 = 2;
					int LA79_0 = input.LA(1);

					if ((LA79_0 == 122 || LA79_0 == 158)) {
						alt79 = 1;
					}


					switch (alt79) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:389:24: intersectionMark intersectionElement
						{
							pushFollow(FOLLOW_intersectionMark_in_intersections2790);
							intersectionMark270 = intersectionMark();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_intersectionMark.add(intersectionMark270.getTree());

							pushFollow(FOLLOW_intersectionElement_in_intersections2792);
							intersectionElement271 = intersectionElement();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_intersectionElement.add(intersectionElement271.getTree());

						}
						break;

						default:
							break loop79;
					}
				} while (true);


				// AST REWRITE
				// elements: intersectionElement
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 390:3: -> ^( VEC ( intersectionElement )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:390:6: ^( VEC ( intersectionElement )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_intersectionElement.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_intersectionElement.hasNext()) {
								adaptor.addChild(root_1, stream_intersectionElement.nextTree());

							}
							stream_intersectionElement.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intersections"


	public static class intersectionElement_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "intersectionElement"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:392:1: intersectionElement : elements ( exclusions )? -> ^( INTERSECTION_ELEMENT elements ( exclusions )? ) ;
	public final ASN1Parser.intersectionElement_return intersectionElement() throws RecognitionException {
		ASN1Parser.intersectionElement_return retval = new ASN1Parser.intersectionElement_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.elements_return elements272 = null;

		ASN1Parser.exclusions_return exclusions273 = null;


		RewriteRuleSubtreeStream stream_exclusions = new RewriteRuleSubtreeStream(adaptor, "rule exclusions");
		RewriteRuleSubtreeStream stream_elements = new RewriteRuleSubtreeStream(adaptor, "rule elements");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:392:22: ( elements ( exclusions )? -> ^( INTERSECTION_ELEMENT elements ( exclusions )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:393:3: elements ( exclusions )?
			{
				pushFollow(FOLLOW_elements_in_intersectionElement2816);
				elements272 = elements();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_elements.add(elements272.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:393:12: ( exclusions )?
				int alt80 = 2;
				int LA80_0 = input.LA(1);

				if ((LA80_0 == 107)) {
					alt80 = 1;
				}
				switch (alt80) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:393:12: exclusions
					{
						pushFollow(FOLLOW_exclusions_in_intersectionElement2818);
						exclusions273 = exclusions();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exclusions.add(exclusions273.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: elements, exclusions
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 394:3: -> ^( INTERSECTION_ELEMENT elements ( exclusions )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:394:6: ^( INTERSECTION_ELEMENT elements ( exclusions )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(INTERSECTION_ELEMENT, "INTERSECTION_ELEMENT")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_elements.nextTree());

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:394:38: ( exclusions )?
							if (stream_exclusions.hasNext()) {
								adaptor.addChild(root_1, stream_exclusions.nextTree());

							}
							stream_exclusions.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intersectionElement"


	public static class elements_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "elements"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:396:1: elements : ( ( '(' )=> '(' elementSetSpec ')' -> ^( elementSetSpec ) | subtypeElements );
	public final ASN1Parser.elements_return elements() throws RecognitionException {
		ASN1Parser.elements_return retval = new ASN1Parser.elements_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal274 = null;
		Token char_literal276 = null;
		ASN1Parser.elementSetSpec_return elementSetSpec275 = null;

		ASN1Parser.subtypeElements_return subtypeElements277 = null;


		CommonTree char_literal274_tree = null;
		CommonTree char_literal276_tree = null;
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");
		RewriteRuleSubtreeStream stream_elementSetSpec = new RewriteRuleSubtreeStream(adaptor, "rule elementSetSpec");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:396:12: ( ( '(' )=> '(' elementSetSpec ')' -> ^( elementSetSpec ) | subtypeElements )
			int alt81 = 2;
			int LA81_0 = input.LA(1);

			if ((LA81_0 == 81)) {
				int LA81_1 = input.LA(2);

				if ((synpred6_ASN1())) {
					alt81 = 1;
				} else if ((true)) {
					alt81 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 81, 1, input);

					throw nvae;

				}
			} else if ((LA81_0 == ID || LA81_0 == INT || LA81_0 == REAL_NUMBER || LA81_0 == 80 || (LA81_0 >= 82 && LA81_0 <= 83) || (LA81_0 >= 96
			                                                                                                                         && LA81_0 <= 100)
			            || (LA81_0 >= 106 && LA81_0 <= 107) || LA81_0 == 111 || (LA81_0 >= 113 && LA81_0 <= 115) || (LA81_0 >= 120 && LA81_0 <= 123)
			            || (LA81_0 >= 125 && LA81_0 <= 129) || LA81_0 == 131 || (LA81_0 >= 133 && LA81_0 <= 134) || (LA81_0 >= 137 && LA81_0 <= 141)
			            || LA81_0 == 143 || (LA81_0 >= 145 && LA81_0 <= 147) || (LA81_0 >= 149 && LA81_0 <= 154) || LA81_0 == 158 || LA81_0 == 160)) {
				alt81 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 81, 0, input);

				throw nvae;

			}
			switch (alt81) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:397:3: ( '(' )=> '(' elementSetSpec ')'
				{
					char_literal274 = (Token) match(input, 81, FOLLOW_81_in_elements2850);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_81.add(char_literal274);


					pushFollow(FOLLOW_elementSetSpec_in_elements2852);
					elementSetSpec275 = elementSetSpec();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_elementSetSpec.add(elementSetSpec275.getTree());

					char_literal276 = (Token) match(input, 82, FOLLOW_82_in_elements2854);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_82.add(char_literal276);


					// AST REWRITE
					// elements: elementSetSpec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 397:35: -> ^( elementSetSpec )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:397:38: ^( elementSetSpec )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(stream_elementSetSpec.nextNode(), root_1);

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:398:4: subtypeElements
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_subtypeElements_in_elements2865);
					subtypeElements277 = subtypeElements();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, subtypeElements277.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elements"


	public static class subtypeElements_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "subtypeElements"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:400:1: subtypeElements : ( ( value )=> value -> ^( CONSTRAINT_VALUE value ) | valueRange | sizeConstraint | typeConstraint | innerTypeConstraint | patternConstraint );
	public final ASN1Parser.subtypeElements_return subtypeElements() throws RecognitionException {
		ASN1Parser.subtypeElements_return retval = new ASN1Parser.subtypeElements_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.value_return value278 = null;

		ASN1Parser.valueRange_return valueRange279 = null;

		ASN1Parser.sizeConstraint_return sizeConstraint280 = null;

		ASN1Parser.typeConstraint_return typeConstraint281 = null;

		ASN1Parser.innerTypeConstraint_return innerTypeConstraint282 = null;

		ASN1Parser.patternConstraint_return patternConstraint283 = null;


		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:400:19: ( ( value )=> value -> ^( CONSTRAINT_VALUE value ) | valueRange | sizeConstraint | typeConstraint | innerTypeConstraint | patternConstraint )
			int alt82 = 6;
			switch (input.LA(1)) {
				case 145: {
					int LA82_1 = input.LA(2);

					if ((LA82_1 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_1 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_1 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_1 == 122 || LA82_1 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_1 == 147 || LA82_1 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_1 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_1 == 85 || LA82_1 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 1, input);

						throw nvae;

					}
				}
				break;
				case 111: {
					int LA82_2 = input.LA(2);

					if ((LA82_2 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_2 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_2 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_2 == 122 || LA82_2 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_2 == 147 || LA82_2 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_2 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_2 == 85 || LA82_2 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 2, input);

						throw nvae;

					}
				}
				break;
				case 134: {
					int LA82_3 = input.LA(2);

					if ((LA82_3 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_3 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_3 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_3 == 122 || LA82_3 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_3 == 147 || LA82_3 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_3 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_3 == 85 || LA82_3 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 3, input);

						throw nvae;

					}
				}
				break;
				case 126: {
					int LA82_4 = input.LA(2);

					if ((LA82_4 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_4 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_4 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_4 == 122 || LA82_4 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_4 == 147 || LA82_4 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_4 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_4 == 85 || LA82_4 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 4, input);

						throw nvae;

					}
				}
				break;
				case ID: {
					int LA82_5 = input.LA(2);

					if ((LA82_5 == 85 || LA82_5 == 90)) {
						alt82 = 2;
					} else if ((synpred7_ASN1())) {
						alt82 = 1;
					} else if ((true)) {
						alt82 = 4;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 5, input);

						throw nvae;

					}
				}
				break;
				case INT: {
					int LA82_6 = input.LA(2);

					if ((LA82_6 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_6 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_6 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_6 == 122 || LA82_6 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_6 == 147 || LA82_6 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_6 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_6 == 85 || LA82_6 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 6, input);

						throw nvae;

					}
				}
				break;
				case REAL_NUMBER: {
					int LA82_7 = input.LA(2);

					if ((LA82_7 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_7 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_7 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_7 == 122 || LA82_7 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_7 == 147 || LA82_7 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_7 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_7 == 85 || LA82_7 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 7, input);

						throw nvae;

					}
				}
				break;
				case 131: {
					int LA82_8 = input.LA(2);

					if ((LA82_8 == 83) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_8 == 80) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_8 == 82) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_8 == 122 || LA82_8 == 158) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_8 == 147 || LA82_8 == 160) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_8 == 107) && (synpred7_ASN1())) {
						alt82 = 1;
					} else if ((LA82_8 == 85 || LA82_8 == 90)) {
						alt82 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 82, 8, input);

						throw nvae;

					}
				}
				break;
				case 125: {
					alt82 = 2;
				}
				break;
				case 141: {
					alt82 = 3;
				}
				break;
				case 80:
				case 81:
				case 82:
				case 83:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 106:
				case 107:
				case 113:
				case 114:
				case 115:
				case 120:
				case 121:
				case 122:
				case 123:
				case 127:
				case 128:
				case 129:
				case 137:
				case 138:
				case 139:
				case 140:
				case 143:
				case 146:
				case 147:
				case 149:
				case 150:
				case 151:
				case 152:
				case 154:
				case 158:
				case 160: {
					alt82 = 4;
				}
				break;
				case 153: {
					alt82 = 5;
				}
				break;
				case 133: {
					alt82 = 6;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);

					throw nvae;

			}

			switch (alt82) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:401:3: ( value )=> value
				{
					pushFollow(FOLLOW_value_in_subtypeElements2881);
					value278 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_value.add(value278.getTree());

					// AST REWRITE
					// elements: value
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 401:18: -> ^( CONSTRAINT_VALUE value )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:401:21: ^( CONSTRAINT_VALUE value )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(CONSTRAINT_VALUE, "CONSTRAINT_VALUE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_value.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:402:4: valueRange
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_valueRange_in_subtypeElements2894);
					valueRange279 = valueRange();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, valueRange279.getTree());

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:403:4: sizeConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_sizeConstraint_in_subtypeElements2899);
					sizeConstraint280 = sizeConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, sizeConstraint280.getTree());

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:404:4: typeConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_typeConstraint_in_subtypeElements2904);
					typeConstraint281 = typeConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, typeConstraint281.getTree());

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:405:4: innerTypeConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_innerTypeConstraint_in_subtypeElements2909);
					innerTypeConstraint282 = innerTypeConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, innerTypeConstraint282.getTree());

				}
				break;
				case 6:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:406:4: patternConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_patternConstraint_in_subtypeElements2914);
					patternConstraint283 = patternConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, patternConstraint283.getTree());

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subtypeElements"


	public static class innerTypeConstraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "innerTypeConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:408:1: innerTypeConstraint : ( 'WITH' 'COMPONENT' constraint -> ^( CONSTRAINT_INNER_TYPE constraint ) | 'WITH' 'COMPONENTS' '{' ( '...' ',' )? typeConstraints '}' -> ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints ) );
	public final ASN1Parser.innerTypeConstraint_return innerTypeConstraint() throws RecognitionException {
		ASN1Parser.innerTypeConstraint_return retval = new ASN1Parser.innerTypeConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal284 = null;
		Token string_literal285 = null;
		Token string_literal287 = null;
		Token string_literal288 = null;
		Token char_literal289 = null;
		Token string_literal290 = null;
		Token char_literal291 = null;
		Token char_literal293 = null;
		ASN1Parser.constraint_return constraint286 = null;

		ASN1Parser.typeConstraints_return typeConstraints292 = null;


		CommonTree string_literal284_tree = null;
		CommonTree string_literal285_tree = null;
		CommonTree string_literal287_tree = null;
		CommonTree string_literal288_tree = null;
		CommonTree char_literal289_tree = null;
		CommonTree string_literal290_tree = null;
		CommonTree char_literal291_tree = null;
		CommonTree char_literal293_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_153 = new RewriteRuleTokenStream(adaptor, "token 153");
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleTokenStream stream_86 = new RewriteRuleTokenStream(adaptor, "token 86");
		RewriteRuleTokenStream stream_102 = new RewriteRuleTokenStream(adaptor, "token 102");
		RewriteRuleTokenStream stream_101 = new RewriteRuleTokenStream(adaptor, "token 101");
		RewriteRuleSubtreeStream stream_typeConstraints = new RewriteRuleSubtreeStream(adaptor, "rule typeConstraints");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:408:22: ( 'WITH' 'COMPONENT' constraint -> ^( CONSTRAINT_INNER_TYPE constraint ) | 'WITH' 'COMPONENTS' '{' ( '...' ',' )? typeConstraints '}' -> ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints ) )
			int alt84 = 2;
			int LA84_0 = input.LA(1);

			if ((LA84_0 == 153)) {
				int LA84_1 = input.LA(2);

				if ((LA84_1 == 101)) {
					alt84 = 1;
				} else if ((LA84_1 == 102)) {
					alt84 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 84, 1, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 84, 0, input);

				throw nvae;

			}
			switch (alt84) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:409:3: 'WITH' 'COMPONENT' constraint
				{
					string_literal284 = (Token) match(input, 153, FOLLOW_153_in_innerTypeConstraint2925);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_153.add(string_literal284);


					string_literal285 = (Token) match(input, 101, FOLLOW_101_in_innerTypeConstraint2927);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_101.add(string_literal285);


					pushFollow(FOLLOW_constraint_in_innerTypeConstraint2929);
					constraint286 = constraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_constraint.add(constraint286.getTree());

					// AST REWRITE
					// elements: constraint
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 409:33: -> ^( CONSTRAINT_INNER_TYPE constraint )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:409:36: ^( CONSTRAINT_INNER_TYPE constraint )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(CONSTRAINT_INNER_TYPE, "CONSTRAINT_INNER_TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_constraint.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:410:4: 'WITH' 'COMPONENTS' '{' ( '...' ',' )? typeConstraints '}'
				{
					string_literal287 = (Token) match(input, 153, FOLLOW_153_in_innerTypeConstraint2942);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_153.add(string_literal287);


					string_literal288 = (Token) match(input, 102, FOLLOW_102_in_innerTypeConstraint2944);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_102.add(string_literal288);


					char_literal289 = (Token) match(input, 159, FOLLOW_159_in_innerTypeConstraint2946);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_159.add(char_literal289);


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:410:28: ( '...' ',' )?
					int alt83 = 2;
					int LA83_0 = input.LA(1);

					if ((LA83_0 == 86)) {
						alt83 = 1;
					}
					switch (alt83) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:410:29: '...' ','
						{
							string_literal290 = (Token) match(input, 86, FOLLOW_86_in_innerTypeConstraint2949);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_86.add(string_literal290);


							char_literal291 = (Token) match(input, 83, FOLLOW_83_in_innerTypeConstraint2951);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal291);


						}
						break;

					}


					pushFollow(FOLLOW_typeConstraints_in_innerTypeConstraint2955);
					typeConstraints292 = typeConstraints();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_typeConstraints.add(typeConstraints292.getTree());

					char_literal293 = (Token) match(input, 161, FOLLOW_161_in_innerTypeConstraint2957);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_161.add(char_literal293);


					// AST REWRITE
					// elements: 86, typeConstraints
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if (state.backtracking == 0) {

						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						                                                                     adaptor,
						                                                                     "rule retval",
						                                                                     retval != null ? retval.tree : null
						);

						root_0 = (CommonTree) adaptor.nil();
						// 411:3: -> ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints )
						{
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:411:6: ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(CONSTRAINT_INNER_TYPE, "CONSTRAINT_INNER_TYPE")
								                                        , root_1
								                                        );

								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:411:30: ( '...' )?
								if (stream_86.hasNext()) {
									adaptor.addChild(
									                root_1,
									                stream_86.nextNode()
									                );

								}
								stream_86.reset();

								adaptor.addChild(root_1, stream_typeConstraints.nextTree());

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "innerTypeConstraint"


	public static class typeConstraints_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "typeConstraints"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:413:1: typeConstraints : namedConstraint ( ',' namedConstraint )* -> ^( VEC ( namedConstraint )+ ) ;
	public final ASN1Parser.typeConstraints_return typeConstraints() throws RecognitionException {
		ASN1Parser.typeConstraints_return retval = new ASN1Parser.typeConstraints_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal295 = null;
		ASN1Parser.namedConstraint_return namedConstraint294 = null;

		ASN1Parser.namedConstraint_return namedConstraint296 = null;


		CommonTree char_literal295_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_namedConstraint = new RewriteRuleSubtreeStream(adaptor, "rule namedConstraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:413:19: ( namedConstraint ( ',' namedConstraint )* -> ^( VEC ( namedConstraint )+ ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:414:3: namedConstraint ( ',' namedConstraint )*
			{
				pushFollow(FOLLOW_namedConstraint_in_typeConstraints2983);
				namedConstraint294 = namedConstraint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_namedConstraint.add(namedConstraint294.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:414:19: ( ',' namedConstraint )*
				loop85:
				do {
					int alt85 = 2;
					int LA85_0 = input.LA(1);

					if ((LA85_0 == 83)) {
						alt85 = 1;
					}


					switch (alt85) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:414:20: ',' namedConstraint
						{
							char_literal295 = (Token) match(input, 83, FOLLOW_83_in_typeConstraints2986);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal295);


							pushFollow(FOLLOW_namedConstraint_in_typeConstraints2988);
							namedConstraint296 = namedConstraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_namedConstraint.add(namedConstraint296.getTree());

						}
						break;

						default:
							break loop85;
					}
				} while (true);


				// AST REWRITE
				// elements: namedConstraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 415:3: -> ^( VEC ( namedConstraint )+ )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:415:6: ^( VEC ( namedConstraint )+ )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(VEC, "VEC")
							                                        , root_1
							                                        );

							if (!(stream_namedConstraint.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_namedConstraint.hasNext()) {
								adaptor.addChild(root_1, stream_namedConstraint.nextTree());

							}
							stream_namedConstraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeConstraints"


	public static class namedConstraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "namedConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:417:1: namedConstraint : ID ( constraint )? ( presenceConstraint )? -> ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? ) ;
	public final ASN1Parser.namedConstraint_return namedConstraint() throws RecognitionException {
		ASN1Parser.namedConstraint_return retval = new ASN1Parser.namedConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID297 = null;
		ASN1Parser.constraint_return constraint298 = null;

		ASN1Parser.presenceConstraint_return presenceConstraint299 = null;


		CommonTree ID297_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_presenceConstraint = new RewriteRuleSubtreeStream(adaptor, "rule presenceConstraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:417:19: ( ID ( constraint )? ( presenceConstraint )? -> ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:418:3: ID ( constraint )? ( presenceConstraint )?
			{
				ID297 = (Token) match(input, ID, FOLLOW_ID_in_namedConstraint3014);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID297);


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:418:6: ( constraint )?
				int alt86 = 2;
				int LA86_0 = input.LA(1);

				if ((LA86_0 == 81)) {
					alt86 = 1;
				}
				switch (alt86) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:418:6: constraint
					{
						pushFollow(FOLLOW_constraint_in_namedConstraint3016);
						constraint298 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint298.getTree());

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:418:18: ( presenceConstraint )?
				int alt87 = 2;
				int LA87_0 = input.LA(1);

				if ((LA87_0 == 91 || LA87_0 == 132 || LA87_0 == 135)) {
					alt87 = 1;
				}
				switch (alt87) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:418:18: presenceConstraint
					{
						pushFollow(FOLLOW_presenceConstraint_in_namedConstraint3019);
						presenceConstraint299 = presenceConstraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_presenceConstraint.add(presenceConstraint299.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: ID, constraint, presenceConstraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 419:3: -> ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:419:6: ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(NAMED_CONSTRAINT, "NAMED_CONSTRAINT")
							                                        , root_1
							                                        );

							adaptor.addChild(
							                root_1,
							                stream_ID.nextNode()
							                );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:419:28: ( presenceConstraint )?
							if (stream_presenceConstraint.hasNext()) {
								adaptor.addChild(root_1, stream_presenceConstraint.nextTree());

							}
							stream_presenceConstraint.reset();

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:419:48: ( constraint )?
							if (stream_constraint.hasNext()) {
								adaptor.addChild(root_1, stream_constraint.nextTree());

							}
							stream_constraint.reset();

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedConstraint"


	public static class presenceConstraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "presenceConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:421:1: presenceConstraint : ( 'PRESENT' | 'ABSENT' | 'OPTIONAL' );
	public final ASN1Parser.presenceConstraint_return presenceConstraint() throws RecognitionException {
		ASN1Parser.presenceConstraint_return retval = new ASN1Parser.presenceConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set300 = null;

		CommonTree set300_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:421:21: ( 'PRESENT' | 'ABSENT' | 'OPTIONAL' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set300 = (Token) input.LT(1);

				if (input.LA(1) == 91 || input.LA(1) == 132 || input.LA(1) == 135) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set300)
						                );
					}
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "presenceConstraint"


	public static class typeConstraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "typeConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:424:1: typeConstraint : ( 'INCLUDES' )? type -> ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type ) ;
	public final ASN1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
		ASN1Parser.typeConstraint_return retval = new ASN1Parser.typeConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal301 = null;
		ASN1Parser.type_return type302 = null;


		CommonTree string_literal301_tree = null;
		RewriteRuleTokenStream stream_120 = new RewriteRuleTokenStream(adaptor, "token 120");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:424:18: ( ( 'INCLUDES' )? type -> ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:425:3: ( 'INCLUDES' )? type
			{
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:425:3: ( 'INCLUDES' )?
				int alt88 = 2;
				int LA88_0 = input.LA(1);

				if ((LA88_0 == 120)) {
					alt88 = 1;
				}
				switch (alt88) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:425:3: 'INCLUDES'
					{
						string_literal301 = (Token) match(input, 120, FOLLOW_120_in_typeConstraint3068);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_120.add(string_literal301);


					}
					break;

				}


				pushFollow(FOLLOW_type_in_typeConstraint3071);
				type302 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type302.getTree());

				// AST REWRITE
				// elements: 120, type
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 426:3: -> ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:426:6: ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT_TYPE, "CONSTRAINT_TYPE")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:426:24: ( 'INCLUDES' )?
							if (stream_120.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_120.nextNode()
								                );

							}
							stream_120.reset();

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeConstraint"


	public static class valueRange_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "valueRange"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:428:1: valueRange : lowerEndPoint '..' upperEndPoint -> ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint ) ;
	public final ASN1Parser.valueRange_return valueRange() throws RecognitionException {
		ASN1Parser.valueRange_return retval = new ASN1Parser.valueRange_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal304 = null;
		ASN1Parser.lowerEndPoint_return lowerEndPoint303 = null;

		ASN1Parser.upperEndPoint_return upperEndPoint305 = null;


		CommonTree string_literal304_tree = null;
		RewriteRuleTokenStream stream_85 = new RewriteRuleTokenStream(adaptor, "token 85");
		RewriteRuleSubtreeStream stream_upperEndPoint = new RewriteRuleSubtreeStream(adaptor, "rule upperEndPoint");
		RewriteRuleSubtreeStream stream_lowerEndPoint = new RewriteRuleSubtreeStream(adaptor, "rule lowerEndPoint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:428:14: ( lowerEndPoint '..' upperEndPoint -> ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:429:3: lowerEndPoint '..' upperEndPoint
			{
				pushFollow(FOLLOW_lowerEndPoint_in_valueRange3096);
				lowerEndPoint303 = lowerEndPoint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_lowerEndPoint.add(lowerEndPoint303.getTree());

				string_literal304 = (Token) match(input, 85, FOLLOW_85_in_valueRange3098);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_85.add(string_literal304);


				pushFollow(FOLLOW_upperEndPoint_in_valueRange3100);
				upperEndPoint305 = upperEndPoint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_upperEndPoint.add(upperEndPoint305.getTree());

				// AST REWRITE
				// elements: upperEndPoint, lowerEndPoint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 430:3: -> ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:430:6: ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT_VALUE_RANGE, "CONSTRAINT_VALUE_RANGE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_lowerEndPoint.nextTree());

							adaptor.addChild(root_1, stream_upperEndPoint.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueRange"


	public static class lowerEndPoint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "lowerEndPoint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:432:1: lowerEndPoint : lowerEndValue ( '<' )? -> ^( ENDPOINT ( '<' )? lowerEndValue ) ;
	public final ASN1Parser.lowerEndPoint_return lowerEndPoint() throws RecognitionException {
		ASN1Parser.lowerEndPoint_return retval = new ASN1Parser.lowerEndPoint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal307 = null;
		ASN1Parser.lowerEndValue_return lowerEndValue306 = null;


		CommonTree char_literal307_tree = null;
		RewriteRuleTokenStream stream_90 = new RewriteRuleTokenStream(adaptor, "token 90");
		RewriteRuleSubtreeStream stream_lowerEndValue = new RewriteRuleSubtreeStream(adaptor, "rule lowerEndValue");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:432:17: ( lowerEndValue ( '<' )? -> ^( ENDPOINT ( '<' )? lowerEndValue ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:433:3: lowerEndValue ( '<' )?
			{
				pushFollow(FOLLOW_lowerEndValue_in_lowerEndPoint3124);
				lowerEndValue306 = lowerEndValue();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_lowerEndValue.add(lowerEndValue306.getTree());

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:433:17: ( '<' )?
				int alt89 = 2;
				int LA89_0 = input.LA(1);

				if ((LA89_0 == 90)) {
					alt89 = 1;
				}
				switch (alt89) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:433:17: '<'
					{
						char_literal307 = (Token) match(input, 90, FOLLOW_90_in_lowerEndPoint3126);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_90.add(char_literal307);


					}
					break;

				}


				// AST REWRITE
				// elements: 90, lowerEndValue
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 434:3: -> ^( ENDPOINT ( '<' )? lowerEndValue )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:434:6: ^( ENDPOINT ( '<' )? lowerEndValue )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(ENDPOINT, "ENDPOINT")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:434:17: ( '<' )?
							if (stream_90.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_90.nextNode()
								                );

							}
							stream_90.reset();

							adaptor.addChild(root_1, stream_lowerEndValue.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lowerEndPoint"


	public static class upperEndPoint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "upperEndPoint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:436:1: upperEndPoint : ( '<' )? upperEndValue -> ^( ENDPOINT ( '<' )? upperEndValue ) ;
	public final ASN1Parser.upperEndPoint_return upperEndPoint() throws RecognitionException {
		ASN1Parser.upperEndPoint_return retval = new ASN1Parser.upperEndPoint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal308 = null;
		ASN1Parser.upperEndValue_return upperEndValue309 = null;


		CommonTree char_literal308_tree = null;
		RewriteRuleTokenStream stream_90 = new RewriteRuleTokenStream(adaptor, "token 90");
		RewriteRuleSubtreeStream stream_upperEndValue = new RewriteRuleSubtreeStream(adaptor, "rule upperEndValue");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:436:17: ( ( '<' )? upperEndValue -> ^( ENDPOINT ( '<' )? upperEndValue ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:437:3: ( '<' )? upperEndValue
			{
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:437:3: ( '<' )?
				int alt90 = 2;
				int LA90_0 = input.LA(1);

				if ((LA90_0 == 90)) {
					alt90 = 1;
				}
				switch (alt90) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:437:3: '<'
					{
						char_literal308 = (Token) match(input, 90, FOLLOW_90_in_upperEndPoint3152);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_90.add(char_literal308);


					}
					break;

				}


				pushFollow(FOLLOW_upperEndValue_in_upperEndPoint3155);
				upperEndValue309 = upperEndValue();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_upperEndValue.add(upperEndValue309.getTree());

				// AST REWRITE
				// elements: 90, upperEndValue
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 438:3: -> ^( ENDPOINT ( '<' )? upperEndValue )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:438:6: ^( ENDPOINT ( '<' )? upperEndValue )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(ENDPOINT, "ENDPOINT")
							                                        , root_1
							                                        );

							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:438:17: ( '<' )?
							if (stream_90.hasNext()) {
								adaptor.addChild(
								                root_1,
								                stream_90.nextNode()
								                );

							}
							stream_90.reset();

							adaptor.addChild(root_1, stream_upperEndValue.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "upperEndPoint"


	public static class lowerEndValue_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "lowerEndValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:440:1: lowerEndValue : ( value | 'MIN' );
	public final ASN1Parser.lowerEndValue_return lowerEndValue() throws RecognitionException {
		ASN1Parser.lowerEndValue_return retval = new ASN1Parser.lowerEndValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal311 = null;
		ASN1Parser.value_return value310 = null;


		CommonTree string_literal311_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:440:17: ( value | 'MIN' )
			int alt91 = 2;
			int LA91_0 = input.LA(1);

			if ((LA91_0 == ID || LA91_0 == INT || LA91_0 == REAL_NUMBER || LA91_0 == 111 || LA91_0 == 126 || LA91_0 == 131 || LA91_0 == 134
			     || LA91_0 == 145)) {
				alt91 = 1;
			} else if ((LA91_0 == 125)) {
				alt91 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 91, 0, input);

				throw nvae;

			}
			switch (alt91) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:441:3: value
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_value_in_lowerEndValue3180);
					value310 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, value310.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:442:5: 'MIN'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal311 = (Token) match(input, 125, FOLLOW_125_in_lowerEndValue3187);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal311_tree =
						(CommonTree) adaptor.create(string_literal311)
						;
						adaptor.addChild(root_0, string_literal311_tree);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lowerEndValue"


	public static class upperEndValue_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "upperEndValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:444:1: upperEndValue : ( value | 'MAX' );
	public final ASN1Parser.upperEndValue_return upperEndValue() throws RecognitionException {
		ASN1Parser.upperEndValue_return retval = new ASN1Parser.upperEndValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal313 = null;
		ASN1Parser.value_return value312 = null;


		CommonTree string_literal313_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:444:17: ( value | 'MAX' )
			int alt92 = 2;
			int LA92_0 = input.LA(1);

			if ((LA92_0 == ID || LA92_0 == INT || LA92_0 == REAL_NUMBER || LA92_0 == 111 || LA92_0 == 126 || LA92_0 == 131 || LA92_0 == 134
			     || LA92_0 == 145)) {
				alt92 = 1;
			} else if ((LA92_0 == 124)) {
				alt92 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 92, 0, input);

				throw nvae;

			}
			switch (alt92) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:445:3: value
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_value_in_upperEndValue3199);
					value312 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, value312.getTree());

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:446:5: 'MAX'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal313 = (Token) match(input, 124, FOLLOW_124_in_upperEndValue3206);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal313_tree =
						(CommonTree) adaptor.create(string_literal313)
						;
						adaptor.addChild(root_0, string_literal313_tree);
					}

				}
				break;

			}
			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "upperEndValue"


	public static class sizeConstraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "sizeConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:448:1: sizeConstraint : 'SIZE' constraint -> ^( CONSTRAINT_SIZE constraint ) ;
	public final ASN1Parser.sizeConstraint_return sizeConstraint() throws RecognitionException {
		ASN1Parser.sizeConstraint_return retval = new ASN1Parser.sizeConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal314 = null;
		ASN1Parser.constraint_return constraint315 = null;


		CommonTree string_literal314_tree = null;
		RewriteRuleTokenStream stream_141 = new RewriteRuleTokenStream(adaptor, "token 141");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:448:18: ( 'SIZE' constraint -> ^( CONSTRAINT_SIZE constraint ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:449:3: 'SIZE' constraint
			{
				string_literal314 = (Token) match(input, 141, FOLLOW_141_in_sizeConstraint3218);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_141.add(string_literal314);


				pushFollow(FOLLOW_constraint_in_sizeConstraint3220);
				constraint315 = constraint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_constraint.add(constraint315.getTree());

				// AST REWRITE
				// elements: constraint
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 449:21: -> ^( CONSTRAINT_SIZE constraint )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:449:24: ^( CONSTRAINT_SIZE constraint )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT_SIZE, "CONSTRAINT_SIZE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_constraint.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sizeConstraint"


	public static class patternConstraint_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "patternConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:451:1: patternConstraint : 'PATTERN' value -> ^( CONSTRAINT_PATTERN value ) ;
	public final ASN1Parser.patternConstraint_return patternConstraint() throws RecognitionException {
		ASN1Parser.patternConstraint_return retval = new ASN1Parser.patternConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal316 = null;
		ASN1Parser.value_return value317 = null;


		CommonTree string_literal316_tree = null;
		RewriteRuleTokenStream stream_133 = new RewriteRuleTokenStream(adaptor, "token 133");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:451:20: ( 'PATTERN' value -> ^( CONSTRAINT_PATTERN value ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:452:3: 'PATTERN' value
			{
				string_literal316 = (Token) match(input, 133, FOLLOW_133_in_patternConstraint3239);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_133.add(string_literal316);


				pushFollow(FOLLOW_value_in_patternConstraint3241);
				value317 = value();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_value.add(value317.getTree());

				// AST REWRITE
				// elements: value
				// token labels: 
				// rule labels: retval
				// token list labels: 
				// rule list labels: 
				// wildcard labels: 
				if (state.backtracking == 0) {

					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
					                                                                     adaptor,
					                                                                     "rule retval",
					                                                                     retval != null ? retval.tree : null
					);

					root_0 = (CommonTree) adaptor.nil();
					// 452:19: -> ^( CONSTRAINT_PATTERN value )
					{
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:452:22: ^( CONSTRAINT_PATTERN value )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT_PATTERN, "CONSTRAINT_PATTERN")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_value.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
				}

			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "patternConstraint"


	public static class unionMark_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "unionMark"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:454:1: unionMark : ( '|' | 'UNION' ) ;
	public final ASN1Parser.unionMark_return unionMark() throws RecognitionException {
		ASN1Parser.unionMark_return retval = new ASN1Parser.unionMark_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set318 = null;

		CommonTree set318_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:454:13: ( ( '|' | 'UNION' ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set318 = (Token) input.LT(1);

				if (input.LA(1) == 147 || input.LA(1) == 160) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set318)
						                );
					}
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unionMark"


	public static class intersectionMark_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "intersectionMark"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:457:1: intersectionMark : ( '^' | 'INTERSECTION' ) ;
	public final ASN1Parser.intersectionMark_return intersectionMark() throws RecognitionException {
		ASN1Parser.intersectionMark_return retval = new ASN1Parser.intersectionMark_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set319 = null;

		CommonTree set319_tree = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:457:20: ( ( '^' | 'INTERSECTION' ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set319 = (Token) input.LT(1);

				if (input.LA(1) == 122 || input.LA(1) == 158) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set319)
						                );
					}
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}


			}

			retval.stop = input.LT(-1);


			if (state.backtracking == 0) {

				retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException e) {
			throw e;
		} finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intersectionMark"

	// $ANTLR start synpred1_ASN1
	public final void synpred1_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:165:3: ( ( CLASS_DEF )? ID '::=' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:165:4: ( CLASS_DEF )? ID '::='
		{
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:165:4: ( CLASS_DEF )?
			int alt93 = 2;
			int LA93_0 = input.LA(1);

			if ((LA93_0 == CLASS_DEF)) {
				alt93 = 1;
			}
			switch (alt93) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:165:4: CLASS_DEF
				{
					match(input, CLASS_DEF, FOLLOW_CLASS_DEF_in_synpred1_ASN1778);
					if (state.failed) return;

				}
				break;

			}


			match(input, ID, FOLLOW_ID_in_synpred1_ASN1781);
			if (state.failed) return;

			match(input, 88, FOLLOW_88_in_synpred1_ASN1783);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_ASN1

	// $ANTLR start synpred2_ASN1
	public final void synpred2_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:199:4: ( 'SEQUENCE' ( constraint )? 'OF' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:199:5: 'SEQUENCE' ( constraint )? 'OF'
		{
			match(input, 139, FOLLOW_139_in_synpred2_ASN11084);
			if (state.failed) return;

			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:199:16: ( constraint )?
			int alt94 = 2;
			int LA94_0 = input.LA(1);

			if ((LA94_0 == 81)) {
				alt94 = 1;
			}
			switch (alt94) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:199:16: constraint
				{
					pushFollow(FOLLOW_constraint_in_synpred2_ASN11086);
					constraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;

			}


			match(input, 130, FOLLOW_130_in_synpred2_ASN11089);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_ASN1

	// $ANTLR start synpred3_ASN1
	public final void synpred3_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:201:4: ( 'SET' ( constraint )? 'OF' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:201:5: 'SET' ( constraint )? 'OF'
		{
			match(input, 140, FOLLOW_140_in_synpred3_ASN11122);
			if (state.failed) return;

			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:201:11: ( constraint )?
			int alt95 = 2;
			int LA95_0 = input.LA(1);

			if ((LA95_0 == 81)) {
				alt95 = 1;
			}
			switch (alt95) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:201:11: constraint
				{
					pushFollow(FOLLOW_constraint_in_synpred3_ASN11124);
					constraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;

			}


			match(input, 130, FOLLOW_130_in_synpred3_ASN11127);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_ASN1

	// $ANTLR start synpred4_ASN1
	public final void synpred4_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:228:3: ( namedNumber )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:228:4: namedNumber
		{
			pushFollow(FOLLOW_namedNumber_in_synpred4_ASN11418);
			namedNumber();

			state._fsp--;
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_ASN1

	// $ANTLR start synpred5_ASN1
	public final void synpred5_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:289:4: ( VALUE_ID )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:289:5: VALUE_ID
		{
			match(input, VALUE_ID, FOLLOW_VALUE_ID_in_synpred5_ASN11883);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_ASN1

	// $ANTLR start synpred6_ASN1
	public final void synpred6_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:397:3: ( '(' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:397:4: '('
		{
			match(input, 81, FOLLOW_81_in_synpred6_ASN12845);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_ASN1

	// $ANTLR start synpred7_ASN1
	public final void synpred7_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:401:3: ( value )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1.g:401:4: value
		{
			pushFollow(FOLLOW_value_in_synpred7_ASN12878);
			value();

			state._fsp--;
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_ASN1

	// Delegated rules

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

	public final boolean synpred7_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred6_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred5_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred2_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred4_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred3_ASN1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_ASN1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}


	public static final BitSet FOLLOW_module_in_parse277                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_moduleIdentifier_in_module305                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000010000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_104_in_module307                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0020500041000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_tagDefault_in_module312                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000400001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionDefault_in_module315                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_module318                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_95_in_module322                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000200L,
	                                                                                                                               0x0080200000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exports_in_module324                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000200L,
	                                                                                                                               0x0080000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_imports_in_module327                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000200L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_assignmentList_in_module330                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000020000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_105_in_module332                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_moduleIdentifier364                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definitiveIdentifier_in_moduleIdentifier366                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_definitiveIdentifier389                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definitiveObjIdComponent_in_definitiveIdentifier391                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_definitiveIdentifier394                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_definitiveObjIdComponent414                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definitiveObjIdComponent419                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_definitiveObjIdComponent432                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_110_in_extensionDefault452                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0040000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_118_in_extensionDefault454                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_taggingMethod_in_tagDefault472                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000010000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_144_in_tagDefault474                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_109_in_exports517                                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000010000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_92_in_exports519                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_exports521                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_109_in_exports534                                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolList_in_exports536                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_exports538                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbol_in_symbolList558                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_symbolList562                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbol_in_symbolList564                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_symbol589                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_119_in_imports610                                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolsFromModuleList_in_imports612                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_imports614                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolsFromModule_in_symbolsFromModuleList633                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolList_in_symbolsFromModule656                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0001000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_112_in_symbolsFromModule658                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_globalModuleReference_in_symbolsFromModule660                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_globalModuleReference682                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000008L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_assignedIdentifier_in_globalModuleReference684                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_objectIdentifierValue_in_assignedIdentifier705                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedValue_in_assignedIdentifier709                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedValue725                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000100000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_84_in_definedValue727                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedValue731                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_assignment_in_assignmentList755                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000202L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_typeAssignment_in_assignment788                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_valueAssignment_in_assignment793                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_valueAssignment805                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_valueAssignment807                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_valueAssignment809                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_valueAssignment811                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_valueAssignment813                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_booleanValue_in_value839                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_numberValue_in_value852                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_objectIdentifierValue_in_value865                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_134_in_numberValue886                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_126_in_numberValue899                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_numberValue912                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_numberValue926                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_REAL_NUMBER_in_numberValue941                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_131_in_objectIdentifierValue960                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_145_in_booleanValue969                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_111_in_booleanValue980                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_CLASS_DEF_in_typeAssignment998                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_typeAssignment1001                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_typeAssignment1003                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_typeAssignment1005                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_booleanType_in_type1031                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_realType_in_type1044                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_integerType_in_type1057                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_taggedType_in_type1070                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sequenceOfType_in_type1095                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sequenceType_in_type1108                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_setOfType_in_type1132                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_setType_in_type1145                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_choiceType_in_type1158                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_128_in_type1171                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0010000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_116_in_type1173                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_characterStringType_in_type1186                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_bitStringType_in_type1199                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumeratedType_in_type1212                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_129_in_type1225                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000004000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_142_in_type1227                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_type1229                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedType_in_type1245                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_selectionType_in_type1258                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedType1280                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000100000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_84_in_definedType1282                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedType1286                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_definedType1288                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_restrictedStringType_in_definedType1309                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_definedType1311                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_selectionType1335                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000004000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_90_in_selectionType1337                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_selectionType1339                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_106_in_enumeratedType1361                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_enumeratedType1363                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumerations_in_enumeratedType1365                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_enumeratedType1367                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumerationItem_in_enumerations1389                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_enumerations1392                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumerationItem_in_enumerations1394                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_enumerationItem1423                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_enumerationItem1428                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_96_in_bitStringType1448                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000004000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_142_in_bitStringType1450                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedBitList_in_bitStringType1452                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_namedBitList1473                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_namedBitList1475                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_namedBitList1478                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_namedBitList1480                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_namedBitList1484                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_nameNumberForm1508                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_nameNumberForm1510                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_nameNumberForm1512                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_nameNumberForm1514                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_99_in_characterStringType1535                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000004000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_142_in_characterStringType1537                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_characterStringType1539                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_97_in_restrictedStringType1567                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_113_in_restrictedStringType1572                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_114_in_restrictedStringType1577                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_115_in_restrictedStringType1582                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_123_in_restrictedStringType1587                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_127_in_restrictedStringType1592                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_137_in_restrictedStringType1597                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_146_in_restrictedStringType1602                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_143_in_restrictedStringType1607                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_150_in_restrictedStringType1612                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_149_in_restrictedStringType1617                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_151_in_restrictedStringType1622                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_152_in_restrictedStringType1627                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_100_in_choiceType1639                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_choiceType1641                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_alternativesTypeLists_in_choiceType1643                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_choiceType1645                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_choiceType1647                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_alternativeTypeList_in_alternativesTypeLists1670                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_alternativesTypeLists1673                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAndException_in_alternativesTypeLists1675                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_alternativesTypeLists1678                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternativesList_in_alternativesTypeLists1680         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_alternativesTypeLists1684                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_alternativeTypeList1717                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_alternativeTypeList1720                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_alternativeTypeList1722                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1742  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionAdditionAlternativesList1745                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1747  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternativesGroup_in_extensionAdditionAlternative1768 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_extensionAdditionAlternative1772                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_155_in_extensionAdditionAlternativesGroup1781                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_extensionAdditionAlternativesGroup1784                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000800000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_87_in_extensionAdditionAlternativesGroup1786                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_alternativeTypeList_in_extensionAdditionAlternativesGroup1791          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000020000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_157_in_extensionAdditionAlternativesGroup1793                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_140_in_setType1820                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_setType1822                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000400000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeLists_in_setType1824                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_setType1827                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_setType1829                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_140_in_setOfType1855                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_setOfType1857                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_setOfType1860                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sOfComponentType_in_setOfType1862                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_sOfComponentType1886                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_sOfComponentType1890                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_139_in_sequenceType1903                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_sequenceType1905                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000400000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeLists_in_sequenceType1907                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_sequenceType1910                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_sequenceType1912                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeList_in_componentTypeLists1936                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_componentTypeLists1939                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAndException_in_componentTypeLists1941                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditions_in_componentTypeLists1943                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_componentTypeLists1947                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeList_in_componentTypeLists1949                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAndException_in_componentTypeLists2000                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditions_in_componentTypeLists2002                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_componentTypeLists2005                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentType_in_componentTypeList2034                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_componentTypeList2037                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentType_in_componentTypeList2039                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_componentType2063                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000008000000000L,
	                                                                                                                               0x0000000000000010L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeOption_in_componentType2065                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_102_in_componentType2084                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_componentType2086                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_componentType2088                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_132_in_componentTypeOption2108                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_103_in_componentTypeOption2120                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_componentTypeOption2122                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionAdditions2143                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAddition_in_extensionAdditions2145                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionAdditions2148                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAddition_in_extensionAdditions2150                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentType_in_extensionAddition2175                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionGroup_in_extensionAddition2179                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_155_in_extensionAdditionGroup2190                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_extensionAdditionGroup2193                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000800000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_87_in_extensionAdditionGroup2195                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeList_in_extensionAdditionGroup2199                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000020000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_157_in_extensionAdditionGroup2201                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionEndMarker2224                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_86_in_extensionEndMarker2226                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_86_in_extensionAndException2245                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000010000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exceptionSpec_in_extensionAndException2247                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_80_in_exceptionSpec2270                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedValue_in_exceptionSpec2272                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_80_in_exceptionSpec2290                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_exceptionSpec2292                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000800000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_87_in_exceptionSpec2294                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_exceptionSpec2296                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_80_in_exceptionSpec2316                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_exceptionSpec2318                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_139_in_sequenceOfType2342                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_sequenceOfType2344                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_sequenceOfType2347                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sOfComponentType_in_sequenceOfType2349                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_sequenceOfType2351                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_namedType2373                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_namedType2375                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_154_in_taggedType2397                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L,
	                                                                                                                               0x0000000020000000L,
	                                                                                                                               0x0000000000100100L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_tagClass_in_taggedType2399                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_classNumber_in_taggedType2402                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000010000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_156_in_taggedType2404                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A2E141F40020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_taggingMethod_in_taggedType2406                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_taggedType2409                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_classNumber2436                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedValue_in_classNumber2440                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_138_in_realType2469                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_realType2471                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_121_in_integerType2493                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_integerType2495                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_integerType2499                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumberList_in_integerType2501                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_integerType2503                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_namedNumberList2528                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_namedNumberList2531                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_namedNumberList2533                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_namedNumber2555                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_namedNumber2557                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_namedNumber2559                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_namedNumber2561                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_98_in_booleanType2583                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_booleanType2585                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_constraint2609                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F10020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraintSpec_in_constraint2611                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000050000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exceptionSpec_in_constraint2613                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_constraint2615                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpecs_in_constraintSpec2642                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpec_in_elementSetSpecs2654                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_elementSetSpecs2657                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_elementSetSpecs2661                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F10020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpec_in_elementSetSpecs2663                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_unions_in_elementSetSpec2695                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_92_in_elementSetSpec2709                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000080000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exclusions_in_elementSetSpec2711                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_107_in_exclusions2733                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F00020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elements_in_exclusions2735                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersections_in_unions2757                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000100080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_unionMark_in_unions2760                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F00020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersections_in_unions2762                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000100080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersectionElement_in_intersections2787                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0400000000000000L,
	                                                                                                                               0x0000000040000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersectionMark_in_intersections2790                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F00020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersectionElement_in_intersections2792                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0400000000000000L,
	                                                                                                                               0x0000000040000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elements_in_intersectionElement2816                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000080000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exclusions_in_intersectionElement2818                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_elements2850                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F10020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpec_in_elements2852                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_elements2854                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_subtypeElements_in_elements2865                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_subtypeElements2881                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_valueRange_in_subtypeElements2894                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sizeConstraint_in_subtypeElements2899                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_typeConstraint_in_subtypeElements2904                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_innerTypeConstraint_in_subtypeElements2909                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_patternConstraint_in_subtypeElements2914                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_153_in_innerTypeConstraint2925                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000002000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_101_in_innerTypeConstraint2927                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_innerTypeConstraint2929                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_153_in_innerTypeConstraint2942                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_102_in_innerTypeConstraint2944                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_innerTypeConstraint2946                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_86_in_innerTypeConstraint2949                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_innerTypeConstraint2951                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_typeConstraints_in_innerTypeConstraint2955                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_innerTypeConstraint2957                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedConstraint_in_typeConstraints2983                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_typeConstraints2986                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedConstraint_in_typeConstraints2988                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_namedConstraint3014                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000008020000L,
	                                                                                                                               0x0000000000000090L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_namedConstraint3016                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000008000000L,
	                                                                                                                               0x0000000000000090L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_presenceConstraint_in_namedConstraint3019                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_120_in_typeConstraint3068                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_typeConstraint3071                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_lowerEndPoint_in_valueRange3096                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000200000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_85_in_valueRange3098                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x5000800004000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_upperEndPoint_in_valueRange3100                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_lowerEndValue_in_lowerEndPoint3124                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000004000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_90_in_lowerEndPoint3126                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_90_in_upperEndPoint3152                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x5000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_upperEndValue_in_upperEndPoint3155                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_lowerEndValue3180                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_125_in_lowerEndValue3187                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_upperEndValue3199                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_124_in_upperEndValue3206                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_141_in_sizeConstraint3218                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_sizeConstraint3220                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_133_in_patternConstraint3239                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_patternConstraint3241                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_CLASS_DEF_in_synpred1_ASN1778                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_synpred1_ASN1781                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_synpred1_ASN1783                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_139_in_synpred2_ASN11084                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_synpred2_ASN11086                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_synpred2_ASN11089                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_140_in_synpred3_ASN11122                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_synpred3_ASN11124                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_synpred3_ASN11127                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_synpred4_ASN11418                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_VALUE_ID_in_synpred5_ASN11883                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_synpred6_ASN12845                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_synpred7_ASN12878                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);

}