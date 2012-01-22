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

// $ANTLR 3.4 /home/lastrix/dev/java/ASN1S/antlr/ASN1.g 2011-12-07 12:23:49

package org.lastrix.asn1s.schema.compiler.generated;

//import org.lastrix.asn1s.schema.compiler.*;
//import java.util.List;
//import java.util.Collections;


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

	public String getGrammarFileName() { return "/home/lastrix/dev/java/ASN1S/antlr/ASN1.g"; }


	public static class parse_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "parse"
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:98:1: parse : ( module )+ ;
	public final ASN1Parser.parse_return parse() throws RecognitionException {
		ASN1Parser.parse_return retval = new ASN1Parser.parse_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.module_return module1 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:98:7: ( ( module )+ )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:98:9: ( module )+
			{
				root_0 = (CommonTree) adaptor.nil();


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:98:9: ( module )+
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:98:9: module
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:100:1: module : moduleIdentifier 'DEFINITIONS' ( tagDefault )? ( extensionDefault )? '::=' 'BEGIN' ( exports )? ( imports )? assignmentList 'END' -> ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList ) ;
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
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:100:25: ( moduleIdentifier 'DEFINITIONS' ( tagDefault )? ( extensionDefault )? '::=' 'BEGIN' ( exports )? ( imports )? assignmentList 'END' -> ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:101:3: moduleIdentifier 'DEFINITIONS' ( tagDefault )? ( extensionDefault )? '::=' 'BEGIN' ( exports )? ( imports )? assignmentList 'END'
			{
				pushFollow(FOLLOW_moduleIdentifier_in_module305);
				moduleIdentifier2 = moduleIdentifier();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_moduleIdentifier.add(moduleIdentifier2.getTree());

				string_literal3 = (Token) match(input, 104, FOLLOW_104_in_module307);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_104.add(string_literal3);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:102:3: ( tagDefault )?
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == 94 || LA2_0 == 108 || LA2_0 == 117)) {
					alt2 = 1;
				}
				switch (alt2) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:102:3: tagDefault
					{
						pushFollow(FOLLOW_tagDefault_in_module312);
						tagDefault4 = tagDefault();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_tagDefault.add(tagDefault4.getTree());

					}
					break;

				}


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:102:15: ( extensionDefault )?
				int alt3 = 2;
				int LA3_0 = input.LA(1);

				if ((LA3_0 == 110)) {
					alt3 = 1;
				}
				switch (alt3) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:102:15: extensionDefault
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


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:11: ( exports )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);

				if ((LA4_0 == 109)) {
					alt4 = 1;
				}
				switch (alt4) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:11: exports
					{
						pushFollow(FOLLOW_exports_in_module324);
						exports8 = exports();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exports.add(exports8.getTree());

					}
					break;

				}


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:20: ( imports )?
				int alt5 = 2;
				int LA5_0 = input.LA(1);

				if ((LA5_0 == 119)) {
					alt5 = 1;
				}
				switch (alt5) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:20: imports
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
				// elements: assignmentList, extensionDefault, exports, imports, tagDefault, moduleIdentifier
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
					// 103:50: -> ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:53: ^( MODULE moduleIdentifier ( tagDefault )? ( extensionDefault )? ( exports )? ( imports )? assignmentList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(MODULE, "MODULE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_moduleIdentifier.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:79: ( tagDefault )?
							if (stream_tagDefault.hasNext()) {
								adaptor.addChild(root_1, stream_tagDefault.nextTree());

							}
							stream_tagDefault.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:91: ( extensionDefault )?
							if (stream_extensionDefault.hasNext()) {
								adaptor.addChild(root_1, stream_extensionDefault.nextTree());

							}
							stream_extensionDefault.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:109: ( exports )?
							if (stream_exports.hasNext()) {
								adaptor.addChild(root_1, stream_exports.nextTree());

							}
							stream_exports.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:103:118: ( imports )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:106:1: moduleIdentifier : ID ( definitiveIdentifier )? -> ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? ) ;
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
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:106:18: ( ID ( definitiveIdentifier )? -> ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:107:2: ID ( definitiveIdentifier )?
			{
				ID12 = (Token) match(input, ID, FOLLOW_ID_in_moduleIdentifier364);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID12);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:107:5: ( definitiveIdentifier )?
				int alt6 = 2;
				int LA6_0 = input.LA(1);

				if ((LA6_0 == 159)) {
					alt6 = 1;
				}
				switch (alt6) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:107:5: definitiveIdentifier
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
				// elements: ID, definitiveIdentifier
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
					// 107:27: -> ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:107:30: ^( MODULE_IDENTIFIER ID ( definitiveIdentifier )? )
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

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:107:53: ( definitiveIdentifier )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:111:1: definitiveIdentifier : '{' definitiveObjIdComponent ( ',' definitiveObjIdComponent )* '}' -> ^( VEC ( definitiveObjIdComponent )+ ) ;
	public final ASN1Parser.definitiveIdentifier_return definitiveIdentifier() throws RecognitionException {
		ASN1Parser.definitiveIdentifier_return retval = new ASN1Parser.definitiveIdentifier_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal14 = null;
		Token char_literal16 = null;
		Token char_literal18 = null;
		ASN1Parser.definitiveObjIdComponent_return definitiveObjIdComponent15 = null;

		ASN1Parser.definitiveObjIdComponent_return definitiveObjIdComponent17 = null;


		CommonTree char_literal14_tree = null;
		CommonTree char_literal16_tree = null;
		CommonTree char_literal18_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_definitiveObjIdComponent = new RewriteRuleSubtreeStream(adaptor, "rule definitiveObjIdComponent");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:111:22: ( '{' definitiveObjIdComponent ( ',' definitiveObjIdComponent )* '}' -> ^( VEC ( definitiveObjIdComponent )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:112:2: '{' definitiveObjIdComponent ( ',' definitiveObjIdComponent )* '}'
			{
				char_literal14 = (Token) match(input, 159, FOLLOW_159_in_definitiveIdentifier389);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal14);


				pushFollow(FOLLOW_definitiveObjIdComponent_in_definitiveIdentifier391);
				definitiveObjIdComponent15 = definitiveObjIdComponent();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_definitiveObjIdComponent.add(definitiveObjIdComponent15.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:112:31: ( ',' definitiveObjIdComponent )*
				loop7:
				do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == 83)) {
						alt7 = 1;
					}


					switch (alt7) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:112:32: ',' definitiveObjIdComponent
						{
							char_literal16 = (Token) match(input, 83, FOLLOW_83_in_definitiveIdentifier394);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal16);


							pushFollow(FOLLOW_definitiveObjIdComponent_in_definitiveIdentifier396);
							definitiveObjIdComponent17 = definitiveObjIdComponent();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_definitiveObjIdComponent.add(definitiveObjIdComponent17.getTree());

						}
						break;

						default:
							break loop7;
					}
				} while (true);


				char_literal18 = (Token) match(input, 161, FOLLOW_161_in_definitiveIdentifier400);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal18);


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
					// 113:2: -> ^( VEC ( definitiveObjIdComponent )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:113:5: ^( VEC ( definitiveObjIdComponent )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:116:1: definitiveObjIdComponent : ( nameNumberForm | ID -> ^( NAME_FORM ID ) | INT -> ^( NUMBER_FORM INT ) );
	public final ASN1Parser.definitiveObjIdComponent_return definitiveObjIdComponent() throws RecognitionException {
		ASN1Parser.definitiveObjIdComponent_return retval = new ASN1Parser.definitiveObjIdComponent_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID20 = null;
		Token INT21 = null;
		ASN1Parser.nameNumberForm_return nameNumberForm19 = null;


		CommonTree ID20_tree = null;
		CommonTree INT21_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:116:25: ( nameNumberForm | ID -> ^( NAME_FORM ID ) | INT -> ^( NUMBER_FORM INT ) )
			int alt8 = 3;
			int LA8_0 = input.LA(1);

			if ((LA8_0 == ID)) {
				int LA8_1 = input.LA(2);

				if ((LA8_1 == 81)) {
					alt8 = 1;
				} else if ((LA8_1 == 83 || LA8_1 == 161)) {
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:117:3: nameNumberForm
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_nameNumberForm_in_definitiveObjIdComponent420);
					nameNumberForm19 = nameNumberForm();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, nameNumberForm19.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:118:4: ID
				{
					ID20 = (Token) match(input, ID, FOLLOW_ID_in_definitiveObjIdComponent425);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID20);


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
						// 118:7: -> ^( NAME_FORM ID )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:118:10: ^( NAME_FORM ID )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:119:4: INT
				{
					INT21 = (Token) match(input, INT, FOLLOW_INT_in_definitiveObjIdComponent438);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_INT.add(INT21);


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
						// 119:8: -> ^( NUMBER_FORM INT )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:119:11: ^( NUMBER_FORM INT )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:121:1: extensionDefault : 'EXTENSIBILITY' 'IMPLIED' -> ^( EXTENSIBILITY_IMPLIED ) ;
	public final ASN1Parser.extensionDefault_return extensionDefault() throws RecognitionException {
		ASN1Parser.extensionDefault_return retval = new ASN1Parser.extensionDefault_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal22 = null;
		Token string_literal23 = null;

		CommonTree string_literal22_tree = null;
		CommonTree string_literal23_tree = null;
		RewriteRuleTokenStream stream_110 = new RewriteRuleTokenStream(adaptor, "token 110");
		RewriteRuleTokenStream stream_118 = new RewriteRuleTokenStream(adaptor, "token 118");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:121:19: ( 'EXTENSIBILITY' 'IMPLIED' -> ^( EXTENSIBILITY_IMPLIED ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:122:3: 'EXTENSIBILITY' 'IMPLIED'
			{
				string_literal22 = (Token) match(input, 110, FOLLOW_110_in_extensionDefault458);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_110.add(string_literal22);


				string_literal23 = (Token) match(input, 118, FOLLOW_118_in_extensionDefault460);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_118.add(string_literal23);


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
					// 122:29: -> ^( EXTENSIBILITY_IMPLIED )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:122:32: ^( EXTENSIBILITY_IMPLIED )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:124:1: tagDefault : taggingMethod 'TAGS' -> ^( TAGGING_METHOD taggingMethod ) ;
	public final ASN1Parser.tagDefault_return tagDefault() throws RecognitionException {
		ASN1Parser.tagDefault_return retval = new ASN1Parser.tagDefault_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal25 = null;
		ASN1Parser.taggingMethod_return taggingMethod24 = null;


		CommonTree string_literal25_tree = null;
		RewriteRuleTokenStream stream_144 = new RewriteRuleTokenStream(adaptor, "token 144");
		RewriteRuleSubtreeStream stream_taggingMethod = new RewriteRuleSubtreeStream(adaptor, "rule taggingMethod");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:124:14: ( taggingMethod 'TAGS' -> ^( TAGGING_METHOD taggingMethod ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:125:3: taggingMethod 'TAGS'
			{
				pushFollow(FOLLOW_taggingMethod_in_tagDefault478);
				taggingMethod24 = taggingMethod();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_taggingMethod.add(taggingMethod24.getTree());

				string_literal25 = (Token) match(input, 144, FOLLOW_144_in_tagDefault480);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_144.add(string_literal25);


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
					// 125:24: -> ^( TAGGING_METHOD taggingMethod )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:125:27: ^( TAGGING_METHOD taggingMethod )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:127:1: taggingMethod : ( 'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC' );
	public final ASN1Parser.taggingMethod_return taggingMethod() throws RecognitionException {
		ASN1Parser.taggingMethod_return retval = new ASN1Parser.taggingMethod_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set26 = null;

		CommonTree set26_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:127:17: ( 'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC' )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set26 = (Token) input.LT(1);

				if (input.LA(1) == 94 || input.LA(1) == 108 || input.LA(1) == 117) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set26)
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:132:1: exports : ( 'EXPORTS' 'ALL' ';' -> ^( EXPORTS ALL ) | 'EXPORTS' symbolList ';' -> ^( EXPORTS symbolList ) );
	public final ASN1Parser.exports_return exports() throws RecognitionException {
		ASN1Parser.exports_return retval = new ASN1Parser.exports_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal27 = null;
		Token string_literal28 = null;
		Token char_literal29 = null;
		Token string_literal30 = null;
		Token char_literal32 = null;
		ASN1Parser.symbolList_return symbolList31 = null;


		CommonTree string_literal27_tree = null;
		CommonTree string_literal28_tree = null;
		CommonTree char_literal29_tree = null;
		CommonTree string_literal30_tree = null;
		CommonTree char_literal32_tree = null;
		RewriteRuleTokenStream stream_109 = new RewriteRuleTokenStream(adaptor, "token 109");
		RewriteRuleTokenStream stream_92 = new RewriteRuleTokenStream(adaptor, "token 92");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_symbolList = new RewriteRuleSubtreeStream(adaptor, "rule symbolList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:132:12: ( 'EXPORTS' 'ALL' ';' -> ^( EXPORTS ALL ) | 'EXPORTS' symbolList ';' -> ^( EXPORTS symbolList ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:133:3: 'EXPORTS' 'ALL' ';'
				{
					string_literal27 = (Token) match(input, 109, FOLLOW_109_in_exports523);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_109.add(string_literal27);


					string_literal28 = (Token) match(input, 92, FOLLOW_92_in_exports525);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_92.add(string_literal28);


					char_literal29 = (Token) match(input, 89, FOLLOW_89_in_exports527);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_89.add(char_literal29);


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
						// 133:23: -> ^( EXPORTS ALL )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:133:26: ^( EXPORTS ALL )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:134:4: 'EXPORTS' symbolList ';'
				{
					string_literal30 = (Token) match(input, 109, FOLLOW_109_in_exports540);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_109.add(string_literal30);


					pushFollow(FOLLOW_symbolList_in_exports542);
					symbolList31 = symbolList();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_symbolList.add(symbolList31.getTree());

					char_literal32 = (Token) match(input, 89, FOLLOW_89_in_exports544);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_89.add(char_literal32);


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
						// 134:29: -> ^( EXPORTS symbolList )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:134:32: ^( EXPORTS symbolList )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:136:1: symbolList : symbol ( ',' symbol )* -> ^( VEC ( symbol )+ ) ;
	public final ASN1Parser.symbolList_return symbolList() throws RecognitionException {
		ASN1Parser.symbolList_return retval = new ASN1Parser.symbolList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal34 = null;
		ASN1Parser.symbol_return symbol33 = null;

		ASN1Parser.symbol_return symbol35 = null;


		CommonTree char_literal34_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_symbol = new RewriteRuleSubtreeStream(adaptor, "rule symbol");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:136:14: ( symbol ( ',' symbol )* -> ^( VEC ( symbol )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:137:3: symbol ( ',' symbol )*
			{
				pushFollow(FOLLOW_symbol_in_symbolList564);
				symbol33 = symbol();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_symbol.add(symbol33.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:137:10: ( ',' symbol )*
				loop10:
				do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == 83)) {
						alt10 = 1;
					}


					switch (alt10) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:137:12: ',' symbol
						{
							char_literal34 = (Token) match(input, 83, FOLLOW_83_in_symbolList568);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal34);


							pushFollow(FOLLOW_symbol_in_symbolList570);
							symbol35 = symbol();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_symbol.add(symbol35.getTree());

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
					// 137:25: -> ^( VEC ( symbol )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:137:28: ^( VEC ( symbol )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:140:1: symbol : ID -> ^( SYMBOL ID ) ;
	public final ASN1Parser.symbol_return symbol() throws RecognitionException {
		ASN1Parser.symbol_return retval = new ASN1Parser.symbol_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID36 = null;

		CommonTree ID36_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:140:11: ( ID -> ^( SYMBOL ID ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:141:3: ID
			{
				ID36 = (Token) match(input, ID, FOLLOW_ID_in_symbol595);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID36);


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
					// 141:6: -> ^( SYMBOL ID )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:141:9: ^( SYMBOL ID )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:143:1: imports : 'IMPORTS' symbolsFromModuleList ';' -> ^( IMPORTS symbolsFromModuleList ) ;
	public final ASN1Parser.imports_return imports() throws RecognitionException {
		ASN1Parser.imports_return retval = new ASN1Parser.imports_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal37 = null;
		Token char_literal39 = null;
		ASN1Parser.symbolsFromModuleList_return symbolsFromModuleList38 = null;


		CommonTree string_literal37_tree = null;
		CommonTree char_literal39_tree = null;
		RewriteRuleTokenStream stream_119 = new RewriteRuleTokenStream(adaptor, "token 119");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_symbolsFromModuleList = new RewriteRuleSubtreeStream(adaptor, "rule symbolsFromModuleList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:143:12: ( 'IMPORTS' symbolsFromModuleList ';' -> ^( IMPORTS symbolsFromModuleList ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:144:3: 'IMPORTS' symbolsFromModuleList ';'
			{
				string_literal37 = (Token) match(input, 119, FOLLOW_119_in_imports616);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_119.add(string_literal37);


				pushFollow(FOLLOW_symbolsFromModuleList_in_imports618);
				symbolsFromModuleList38 = symbolsFromModuleList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_symbolsFromModuleList.add(symbolsFromModuleList38.getTree());

				char_literal39 = (Token) match(input, 89, FOLLOW_89_in_imports620);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_89.add(char_literal39);


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
					// 144:39: -> ^( IMPORTS symbolsFromModuleList )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:144:42: ^( IMPORTS symbolsFromModuleList )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:146:1: symbolsFromModuleList : ( symbolsFromModule )+ -> ^( VEC ( symbolsFromModule )+ ) ;
	public final ASN1Parser.symbolsFromModuleList_return symbolsFromModuleList() throws RecognitionException {
		ASN1Parser.symbolsFromModuleList_return retval = new ASN1Parser.symbolsFromModuleList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.symbolsFromModule_return symbolsFromModule40 = null;


		RewriteRuleSubtreeStream stream_symbolsFromModule = new RewriteRuleSubtreeStream(adaptor, "rule symbolsFromModule");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:146:24: ( ( symbolsFromModule )+ -> ^( VEC ( symbolsFromModule )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:147:3: ( symbolsFromModule )+
			{
				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:147:3: ( symbolsFromModule )+
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:147:3: symbolsFromModule
						{
							pushFollow(FOLLOW_symbolsFromModule_in_symbolsFromModuleList639);
							symbolsFromModule40 = symbolsFromModule();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_symbolsFromModule.add(symbolsFromModule40.getTree());

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
					// 147:22: -> ^( VEC ( symbolsFromModule )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:147:25: ^( VEC ( symbolsFromModule )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:149:1: symbolsFromModule : symbolList 'FROM' globalModuleReference -> ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList ) ;
	public final ASN1Parser.symbolsFromModule_return symbolsFromModule() throws RecognitionException {
		ASN1Parser.symbolsFromModule_return retval = new ASN1Parser.symbolsFromModule_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal42 = null;
		ASN1Parser.symbolList_return symbolList41 = null;

		ASN1Parser.globalModuleReference_return globalModuleReference43 = null;


		CommonTree string_literal42_tree = null;
		RewriteRuleTokenStream stream_112 = new RewriteRuleTokenStream(adaptor, "token 112");
		RewriteRuleSubtreeStream stream_globalModuleReference = new RewriteRuleSubtreeStream(adaptor, "rule globalModuleReference");
		RewriteRuleSubtreeStream stream_symbolList = new RewriteRuleSubtreeStream(adaptor, "rule symbolList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:149:20: ( symbolList 'FROM' globalModuleReference -> ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:150:3: symbolList 'FROM' globalModuleReference
			{
				pushFollow(FOLLOW_symbolList_in_symbolsFromModule662);
				symbolList41 = symbolList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_symbolList.add(symbolList41.getTree());

				string_literal42 = (Token) match(input, 112, FOLLOW_112_in_symbolsFromModule664);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_112.add(string_literal42);


				pushFollow(FOLLOW_globalModuleReference_in_symbolsFromModule666);
				globalModuleReference43 = globalModuleReference();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_globalModuleReference.add(globalModuleReference43.getTree());

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
					// 150:43: -> ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:150:46: ^( SYMBOLS_FROM_MODULE globalModuleReference symbolList )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:153:1: globalModuleReference : ID ( assignedIdentifier )? -> ^( GLOBAL_MODULE_REFERENCE ID ) ;
	public final ASN1Parser.globalModuleReference_return globalModuleReference() throws RecognitionException {
		ASN1Parser.globalModuleReference_return retval = new ASN1Parser.globalModuleReference_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID44 = null;
		ASN1Parser.assignedIdentifier_return assignedIdentifier45 = null;


		CommonTree ID44_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_assignedIdentifier = new RewriteRuleSubtreeStream(adaptor, "rule assignedIdentifier");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:153:24: ( ID ( assignedIdentifier )? -> ^( GLOBAL_MODULE_REFERENCE ID ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:154:3: ID ( assignedIdentifier )?
			{
				ID44 = (Token) match(input, ID, FOLLOW_ID_in_globalModuleReference688);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID44);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:154:6: ( assignedIdentifier )?
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
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:154:6: assignedIdentifier
					{
						pushFollow(FOLLOW_assignedIdentifier_in_globalModuleReference690);
						assignedIdentifier45 = assignedIdentifier();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_assignedIdentifier.add(assignedIdentifier45.getTree());

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
					// 154:26: -> ^( GLOBAL_MODULE_REFERENCE ID )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:154:29: ^( GLOBAL_MODULE_REFERENCE ID )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:156:1: assignedIdentifier : ( objectIdentifierValue | definedValue ) ;
	public final ASN1Parser.assignedIdentifier_return assignedIdentifier() throws RecognitionException {
		ASN1Parser.assignedIdentifier_return retval = new ASN1Parser.assignedIdentifier_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.objectIdentifierValue_return objectIdentifierValue46 = null;

		ASN1Parser.definedValue_return definedValue47 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:156:21: ( ( objectIdentifierValue | definedValue ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:157:3: ( objectIdentifierValue | definedValue )
			{
				root_0 = (CommonTree) adaptor.nil();


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:157:3: ( objectIdentifierValue | definedValue )
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
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:157:4: objectIdentifierValue
					{
						pushFollow(FOLLOW_objectIdentifierValue_in_assignedIdentifier711);
						objectIdentifierValue46 = objectIdentifierValue();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) adaptor.addChild(root_0, objectIdentifierValue46.getTree());

					}
					break;
					case 2:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:157:28: definedValue
					{
						pushFollow(FOLLOW_definedValue_in_assignedIdentifier715);
						definedValue47 = definedValue();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) adaptor.addChild(root_0, definedValue47.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:161:1: definedValue : ( ID '.' )? ID -> ^( VALUE_REFERENCE ID ( ID )? ) ;
	public final ASN1Parser.definedValue_return definedValue() throws RecognitionException {
		ASN1Parser.definedValue_return retval = new ASN1Parser.definedValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID48 = null;
		Token char_literal49 = null;
		Token ID50 = null;

		CommonTree ID48_tree = null;
		CommonTree char_literal49_tree = null;
		CommonTree ID50_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_84 = new RewriteRuleTokenStream(adaptor, "token 84");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:161:16: ( ( ID '.' )? ID -> ^( VALUE_REFERENCE ID ( ID )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:162:3: ( ID '.' )? ID
			{
				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:162:3: ( ID '.' )?
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
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:162:4: ID '.'
					{
						ID48 = (Token) match(input, ID, FOLLOW_ID_in_definedValue731);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_ID.add(ID48);


						char_literal49 = (Token) match(input, 84, FOLLOW_84_in_definedValue733);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_84.add(char_literal49);


					}
					break;

				}


				ID50 = (Token) match(input, ID, FOLLOW_ID_in_definedValue737);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID50);


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
					// 162:16: -> ^( VALUE_REFERENCE ID ( ID )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:162:19: ^( VALUE_REFERENCE ID ( ID )? )
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

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:162:40: ( ID )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:165:1: assignmentList : ( assignment )+ -> ^( VEC ( assignment )+ ) ;
	public final ASN1Parser.assignmentList_return assignmentList() throws RecognitionException {
		ASN1Parser.assignmentList_return retval = new ASN1Parser.assignmentList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.assignment_return assignment51 = null;


		RewriteRuleSubtreeStream stream_assignment = new RewriteRuleSubtreeStream(adaptor, "rule assignment");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:165:18: ( ( assignment )+ -> ^( VEC ( assignment )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:166:3: ( assignment )+
			{
				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:166:3: ( assignment )+
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:166:3: assignment
						{
							pushFollow(FOLLOW_assignment_in_assignmentList761);
							assignment51 = assignment();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_assignment.add(assignment51.getTree());

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
					// 166:15: -> ^( VEC ( assignment )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:166:18: ^( VEC ( assignment )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:168:1: assignment : ( ( ( CLASS_DEF )? ID '::=' )=> typeAssignment | valueAssignment );
	public final ASN1Parser.assignment_return assignment() throws RecognitionException {
		ASN1Parser.assignment_return retval = new ASN1Parser.assignment_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.typeAssignment_return typeAssignment52 = null;

		ASN1Parser.valueAssignment_return valueAssignment53 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:168:14: ( ( ( CLASS_DEF )? ID '::=' )=> typeAssignment | valueAssignment )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:169:3: ( ( CLASS_DEF )? ID '::=' )=> typeAssignment
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_typeAssignment_in_assignment794);
					typeAssignment52 = typeAssignment();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, typeAssignment52.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:170:4: valueAssignment
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_valueAssignment_in_assignment799);
					valueAssignment53 = valueAssignment();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, valueAssignment53.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:172:1: valueAssignment : ID type '::=' value ( ';' )? -> ^( VALUE_ASSIGNMENT ID type value ) ;
	public final ASN1Parser.valueAssignment_return valueAssignment() throws RecognitionException {
		ASN1Parser.valueAssignment_return retval = new ASN1Parser.valueAssignment_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID54 = null;
		Token string_literal56 = null;
		Token char_literal58 = null;
		ASN1Parser.type_return type55 = null;

		ASN1Parser.value_return value57 = null;


		CommonTree ID54_tree = null;
		CommonTree string_literal56_tree = null;
		CommonTree char_literal58_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_88 = new RewriteRuleTokenStream(adaptor, "token 88");
		RewriteRuleTokenStream stream_89 = new RewriteRuleTokenStream(adaptor, "token 89");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:172:19: ( ID type '::=' value ( ';' )? -> ^( VALUE_ASSIGNMENT ID type value ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:173:3: ID type '::=' value ( ';' )?
			{
				ID54 = (Token) match(input, ID, FOLLOW_ID_in_valueAssignment811);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID54);


				pushFollow(FOLLOW_type_in_valueAssignment813);
				type55 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type55.getTree());

				string_literal56 = (Token) match(input, 88, FOLLOW_88_in_valueAssignment815);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_88.add(string_literal56);


				pushFollow(FOLLOW_value_in_valueAssignment817);
				value57 = value();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_value.add(value57.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:173:23: ( ';' )?
				int alt17 = 2;
				int LA17_0 = input.LA(1);

				if ((LA17_0 == 89)) {
					alt17 = 1;
				}
				switch (alt17) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:173:23: ';'
					{
						char_literal58 = (Token) match(input, 89, FOLLOW_89_in_valueAssignment819);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_89.add(char_literal58);


					}
					break;

				}


				// AST REWRITE
				// elements: ID, value, type
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
					// 173:28: -> ^( VALUE_ASSIGNMENT ID type value )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:173:31: ^( VALUE_ASSIGNMENT ID type value )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:175:1: value : ( booleanValue -> ^( VALUE booleanValue ) | numberValue -> ^( VALUE numberValue ) | objectIdentifierValue -> ^( VALUE objectIdentifierValue ) );
	public final ASN1Parser.value_return value() throws RecognitionException {
		ASN1Parser.value_return retval = new ASN1Parser.value_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.booleanValue_return booleanValue59 = null;

		ASN1Parser.numberValue_return numberValue60 = null;

		ASN1Parser.objectIdentifierValue_return objectIdentifierValue61 = null;


		RewriteRuleSubtreeStream stream_objectIdentifierValue = new RewriteRuleSubtreeStream(adaptor, "rule objectIdentifierValue");
		RewriteRuleSubtreeStream stream_numberValue = new RewriteRuleSubtreeStream(adaptor, "rule numberValue");
		RewriteRuleSubtreeStream stream_booleanValue = new RewriteRuleSubtreeStream(adaptor, "rule booleanValue");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:175:10: ( booleanValue -> ^( VALUE booleanValue ) | numberValue -> ^( VALUE numberValue ) | objectIdentifierValue -> ^( VALUE objectIdentifierValue ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:176:3: booleanValue
				{
					pushFollow(FOLLOW_booleanValue_in_value845);
					booleanValue59 = booleanValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_booleanValue.add(booleanValue59.getTree());

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
						// 176:16: -> ^( VALUE booleanValue )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:176:19: ^( VALUE booleanValue )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:177:4: numberValue
				{
					pushFollow(FOLLOW_numberValue_in_value858);
					numberValue60 = numberValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_numberValue.add(numberValue60.getTree());

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
						// 177:16: -> ^( VALUE numberValue )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:177:19: ^( VALUE numberValue )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:178:4: objectIdentifierValue
				{
					pushFollow(FOLLOW_objectIdentifierValue_in_value871);
					objectIdentifierValue61 = objectIdentifierValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_objectIdentifierValue.add(objectIdentifierValue61.getTree());

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
						// 178:26: -> ^( VALUE objectIdentifierValue )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:178:29: ^( VALUE objectIdentifierValue )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:181:1: numberValue : ( 'PLUS-INFINITY' -> ^( NUMBER PLUS_INFINITY ) | 'MINUS-INFINITY' -> ^( NUMBER MINUS_INFINITY ) | ID -> ^( NUMBER ID ) | ( INT ) -> ^( NUMBER INT ) | REAL_NUMBER -> ^( NUMBER REAL_NUMBER ) );
	public final ASN1Parser.numberValue_return numberValue() throws RecognitionException {
		ASN1Parser.numberValue_return retval = new ASN1Parser.numberValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal62 = null;
		Token string_literal63 = null;
		Token ID64 = null;
		Token INT65 = null;
		Token REAL_NUMBER66 = null;

		CommonTree string_literal62_tree = null;
		CommonTree string_literal63_tree = null;
		CommonTree ID64_tree = null;
		CommonTree INT65_tree = null;
		CommonTree REAL_NUMBER66_tree = null;
		RewriteRuleTokenStream stream_134 = new RewriteRuleTokenStream(adaptor, "token 134");
		RewriteRuleTokenStream stream_126 = new RewriteRuleTokenStream(adaptor, "token 126");
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_REAL_NUMBER = new RewriteRuleTokenStream(adaptor, "token REAL_NUMBER");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:181:15: ( 'PLUS-INFINITY' -> ^( NUMBER PLUS_INFINITY ) | 'MINUS-INFINITY' -> ^( NUMBER MINUS_INFINITY ) | ID -> ^( NUMBER ID ) | ( INT ) -> ^( NUMBER INT ) | REAL_NUMBER -> ^( NUMBER REAL_NUMBER ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:182:3: 'PLUS-INFINITY'
				{
					string_literal62 = (Token) match(input, 134, FOLLOW_134_in_numberValue892);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_134.add(string_literal62);


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
						// 182:19: -> ^( NUMBER PLUS_INFINITY )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:182:22: ^( NUMBER PLUS_INFINITY )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:183:4: 'MINUS-INFINITY'
				{
					string_literal63 = (Token) match(input, 126, FOLLOW_126_in_numberValue905);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_126.add(string_literal63);


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
						// 183:21: -> ^( NUMBER MINUS_INFINITY )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:183:24: ^( NUMBER MINUS_INFINITY )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:184:4: ID
				{
					ID64 = (Token) match(input, ID, FOLLOW_ID_in_numberValue918);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID64);


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
						// 184:7: -> ^( NUMBER ID )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:184:10: ^( NUMBER ID )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:185:4: ( INT )
				{
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:185:4: ( INT )
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:185:5: INT
					{
						INT65 = (Token) match(input, INT, FOLLOW_INT_in_numberValue932);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT65);


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
						// 185:10: -> ^( NUMBER INT )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:185:13: ^( NUMBER INT )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:186:4: REAL_NUMBER
				{
					REAL_NUMBER66 = (Token) match(input, REAL_NUMBER, FOLLOW_REAL_NUMBER_in_numberValue947);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_REAL_NUMBER.add(REAL_NUMBER66);


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
						// 186:16: -> ^( NUMBER REAL_NUMBER )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:186:19: ^( NUMBER REAL_NUMBER )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:188:1: objectIdentifierValue : 'OID_VALUE' ;
	public final ASN1Parser.objectIdentifierValue_return objectIdentifierValue() throws RecognitionException {
		ASN1Parser.objectIdentifierValue_return retval = new ASN1Parser.objectIdentifierValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal67 = null;

		CommonTree string_literal67_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:188:24: ( 'OID_VALUE' )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:189:3: 'OID_VALUE'
			{
				root_0 = (CommonTree) adaptor.nil();


				string_literal67 = (Token) match(input, 131, FOLLOW_131_in_objectIdentifierValue966);
				if (state.failed) return retval;
				if (state.backtracking == 0) {
					string_literal67_tree =
					(CommonTree) adaptor.create(string_literal67)
					;
					adaptor.addChild(root_0, string_literal67_tree);
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:191:1: booleanValue : ( 'TRUE' -> ^( TRUE ) | 'FALSE' -> ^( FALSE ) );
	public final ASN1Parser.booleanValue_return booleanValue() throws RecognitionException {
		ASN1Parser.booleanValue_return retval = new ASN1Parser.booleanValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal68 = null;
		Token string_literal69 = null;

		CommonTree string_literal68_tree = null;
		CommonTree string_literal69_tree = null;
		RewriteRuleTokenStream stream_145 = new RewriteRuleTokenStream(adaptor, "token 145");
		RewriteRuleTokenStream stream_111 = new RewriteRuleTokenStream(adaptor, "token 111");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:191:13: ( 'TRUE' -> ^( TRUE ) | 'FALSE' -> ^( FALSE ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:192:3: 'TRUE'
				{
					string_literal68 = (Token) match(input, 145, FOLLOW_145_in_booleanValue975);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_145.add(string_literal68);


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
						// 192:10: -> ^( TRUE )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:192:13: ^( TRUE )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:193:4: 'FALSE'
				{
					string_literal69 = (Token) match(input, 111, FOLLOW_111_in_booleanValue986);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_111.add(string_literal69);


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
						// 193:12: -> ^( FALSE )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:193:15: ^( FALSE )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:195:1: typeAssignment : ( CLASS_DEF )? ID '::=' type -> ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type ) ;
	public final ASN1Parser.typeAssignment_return typeAssignment() throws RecognitionException {
		ASN1Parser.typeAssignment_return retval = new ASN1Parser.typeAssignment_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token CLASS_DEF70 = null;
		Token ID71 = null;
		Token string_literal72 = null;
		ASN1Parser.type_return type73 = null;


		CommonTree CLASS_DEF70_tree = null;
		CommonTree ID71_tree = null;
		CommonTree string_literal72_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_CLASS_DEF = new RewriteRuleTokenStream(adaptor, "token CLASS_DEF");
		RewriteRuleTokenStream stream_88 = new RewriteRuleTokenStream(adaptor, "token 88");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:195:18: ( ( CLASS_DEF )? ID '::=' type -> ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:196:3: ( CLASS_DEF )? ID '::=' type
			{
				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:196:3: ( CLASS_DEF )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);

				if ((LA21_0 == CLASS_DEF)) {
					alt21 = 1;
				}
				switch (alt21) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:196:3: CLASS_DEF
					{
						CLASS_DEF70 = (Token) match(input, CLASS_DEF, FOLLOW_CLASS_DEF_in_typeAssignment1004);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_CLASS_DEF.add(CLASS_DEF70);


					}
					break;

				}


				ID71 = (Token) match(input, ID, FOLLOW_ID_in_typeAssignment1007);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID71);


				string_literal72 = (Token) match(input, 88, FOLLOW_88_in_typeAssignment1009);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_88.add(string_literal72);


				pushFollow(FOLLOW_type_in_typeAssignment1011);
				type73 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type73.getTree());

				// AST REWRITE
				// elements: type, CLASS_DEF, ID
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
					// 196:28: -> ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:196:31: ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? type )
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

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:196:52: ( CLASS_DEF )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:198:1: type : ( booleanType -> ^( TYPE booleanType ) | realType -> ^( TYPE realType ) | integerType -> ^( TYPE integerType ) | taggedType -> ^( TYPE taggedType ) | ( 'SEQUENCE' ( constraint )? 'OF' )=> sequenceOfType -> ^( TYPE sequenceOfType ) | sequenceType -> ^( TYPE sequenceType ) | ( 'SET' ( constraint )? 'OF' )=> setOfType -> ^( TYPE setOfType ) | setType -> ^( TYPE setType ) | choiceType -> ^( TYPE choiceType ) | 'OBJECT' 'IDENTIFIER' -> ^( TYPE OID ) | characterStringType -> ^( TYPE characterStringType ) | bitStringType -> ^( TYPE bitStringType ) | enumeratedType -> ^( TYPE enumeratedType ) | 'OCTET' 'STRING' ( constraint )? -> ^( TYPE OCTET_STRING ( constraint )? ) | definedType -> ^( TYPE definedType ) | selectionType -> ^( TYPE selectionType ) );
	public final ASN1Parser.type_return type() throws RecognitionException {
		ASN1Parser.type_return retval = new ASN1Parser.type_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal83 = null;
		Token string_literal84 = null;
		Token string_literal88 = null;
		Token string_literal89 = null;
		ASN1Parser.booleanType_return booleanType74 = null;

		ASN1Parser.realType_return realType75 = null;

		ASN1Parser.integerType_return integerType76 = null;

		ASN1Parser.taggedType_return taggedType77 = null;

		ASN1Parser.sequenceOfType_return sequenceOfType78 = null;

		ASN1Parser.sequenceType_return sequenceType79 = null;

		ASN1Parser.setOfType_return setOfType80 = null;

		ASN1Parser.setType_return setType81 = null;

		ASN1Parser.choiceType_return choiceType82 = null;

		ASN1Parser.characterStringType_return characterStringType85 = null;

		ASN1Parser.bitStringType_return bitStringType86 = null;

		ASN1Parser.enumeratedType_return enumeratedType87 = null;

		ASN1Parser.constraint_return constraint90 = null;

		ASN1Parser.definedType_return definedType91 = null;

		ASN1Parser.selectionType_return selectionType92 = null;


		CommonTree string_literal83_tree = null;
		CommonTree string_literal84_tree = null;
		CommonTree string_literal88_tree = null;
		CommonTree string_literal89_tree = null;
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
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:198:9: ( booleanType -> ^( TYPE booleanType ) | realType -> ^( TYPE realType ) | integerType -> ^( TYPE integerType ) | taggedType -> ^( TYPE taggedType ) | ( 'SEQUENCE' ( constraint )? 'OF' )=> sequenceOfType -> ^( TYPE sequenceOfType ) | sequenceType -> ^( TYPE sequenceType ) | ( 'SET' ( constraint )? 'OF' )=> setOfType -> ^( TYPE setOfType ) | setType -> ^( TYPE setType ) | choiceType -> ^( TYPE choiceType ) | 'OBJECT' 'IDENTIFIER' -> ^( TYPE OID ) | characterStringType -> ^( TYPE characterStringType ) | bitStringType -> ^( TYPE bitStringType ) | enumeratedType -> ^( TYPE enumeratedType ) | 'OCTET' 'STRING' ( constraint )? -> ^( TYPE OCTET_STRING ( constraint )? ) | definedType -> ^( TYPE definedType ) | selectionType -> ^( TYPE selectionType ) )
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

					if ((LA23_13 == CLASS_DEF || LA23_13 == ID || (LA23_13 >= 80 && LA23_13 <= 84) || (LA23_13 >= 87 && LA23_13 <= 88) || (LA23_13
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:199:3: booleanType
				{
					pushFollow(FOLLOW_booleanType_in_type1037);
					booleanType74 = booleanType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_booleanType.add(booleanType74.getTree());

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
						// 199:15: -> ^( TYPE booleanType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:199:18: ^( TYPE booleanType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:200:4: realType
				{
					pushFollow(FOLLOW_realType_in_type1050);
					realType75 = realType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_realType.add(realType75.getTree());

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
						// 200:13: -> ^( TYPE realType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:200:16: ^( TYPE realType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:201:4: integerType
				{
					pushFollow(FOLLOW_integerType_in_type1063);
					integerType76 = integerType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_integerType.add(integerType76.getTree());

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
						// 201:16: -> ^( TYPE integerType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:201:19: ^( TYPE integerType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:202:4: taggedType
				{
					pushFollow(FOLLOW_taggedType_in_type1076);
					taggedType77 = taggedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_taggedType.add(taggedType77.getTree());

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
						// 202:15: -> ^( TYPE taggedType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:202:18: ^( TYPE taggedType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:203:4: ( 'SEQUENCE' ( constraint )? 'OF' )=> sequenceOfType
				{
					pushFollow(FOLLOW_sequenceOfType_in_type1101);
					sequenceOfType78 = sequenceOfType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_sequenceOfType.add(sequenceOfType78.getTree());

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
						// 203:53: -> ^( TYPE sequenceOfType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:203:56: ^( TYPE sequenceOfType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:204:4: sequenceType
				{
					pushFollow(FOLLOW_sequenceType_in_type1114);
					sequenceType79 = sequenceType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_sequenceType.add(sequenceType79.getTree());

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
						// 204:17: -> ^( TYPE sequenceType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:204:20: ^( TYPE sequenceType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:205:4: ( 'SET' ( constraint )? 'OF' )=> setOfType
				{
					pushFollow(FOLLOW_setOfType_in_type1138);
					setOfType80 = setOfType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_setOfType.add(setOfType80.getTree());

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
						// 205:42: -> ^( TYPE setOfType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:205:45: ^( TYPE setOfType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:206:4: setType
				{
					pushFollow(FOLLOW_setType_in_type1151);
					setType81 = setType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_setType.add(setType81.getTree());

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
						// 206:12: -> ^( TYPE setType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:206:15: ^( TYPE setType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:207:4: choiceType
				{
					pushFollow(FOLLOW_choiceType_in_type1164);
					choiceType82 = choiceType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_choiceType.add(choiceType82.getTree());

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
						// 207:15: -> ^( TYPE choiceType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:207:18: ^( TYPE choiceType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:208:4: 'OBJECT' 'IDENTIFIER'
				{
					string_literal83 = (Token) match(input, 128, FOLLOW_128_in_type1177);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_128.add(string_literal83);


					string_literal84 = (Token) match(input, 116, FOLLOW_116_in_type1179);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_116.add(string_literal84);


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
						// 208:26: -> ^( TYPE OID )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:208:29: ^( TYPE OID )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:209:4: characterStringType
				{
					pushFollow(FOLLOW_characterStringType_in_type1192);
					characterStringType85 = characterStringType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_characterStringType.add(characterStringType85.getTree());

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
						// 209:24: -> ^( TYPE characterStringType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:209:27: ^( TYPE characterStringType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:210:4: bitStringType
				{
					pushFollow(FOLLOW_bitStringType_in_type1205);
					bitStringType86 = bitStringType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_bitStringType.add(bitStringType86.getTree());

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
						// 210:18: -> ^( TYPE bitStringType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:210:21: ^( TYPE bitStringType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:211:4: enumeratedType
				{
					pushFollow(FOLLOW_enumeratedType_in_type1218);
					enumeratedType87 = enumeratedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_enumeratedType.add(enumeratedType87.getTree());

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
						// 211:19: -> ^( TYPE enumeratedType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:211:22: ^( TYPE enumeratedType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:212:4: 'OCTET' 'STRING' ( constraint )?
				{
					string_literal88 = (Token) match(input, 129, FOLLOW_129_in_type1231);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_129.add(string_literal88);


					string_literal89 = (Token) match(input, 142, FOLLOW_142_in_type1233);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_142.add(string_literal89);


					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:212:21: ( constraint )?
					int alt22 = 2;
					int LA22_0 = input.LA(1);

					if ((LA22_0 == 81)) {
						alt22 = 1;
					}
					switch (alt22) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:212:21: constraint
						{
							pushFollow(FOLLOW_constraint_in_type1235);
							constraint90 = constraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_constraint.add(constraint90.getTree());

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
						// 212:32: -> ^( TYPE OCTET_STRING ( constraint )? )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:212:35: ^( TYPE OCTET_STRING ( constraint )? )
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

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:212:55: ( constraint )?
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:213:4: definedType
				{
					pushFollow(FOLLOW_definedType_in_type1251);
					definedType91 = definedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_definedType.add(definedType91.getTree());

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
						// 213:16: -> ^( TYPE definedType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:213:19: ^( TYPE definedType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:214:4: selectionType
				{
					pushFollow(FOLLOW_selectionType_in_type1264);
					selectionType92 = selectionType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_selectionType.add(selectionType92.getTree());

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
						// 214:18: -> ^( TYPE selectionType )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:214:21: ^( TYPE selectionType )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:217:1: definedType : ( ( ID '.' )? ID ( constraint )? -> ^( TYPE_REFERENCE ID ( ID )? ( constraint )? ) | restrictedStringType ( constraint )? -> ^( CSTRING restrictedStringType ( constraint )? ) );
	public final ASN1Parser.definedType_return definedType() throws RecognitionException {
		ASN1Parser.definedType_return retval = new ASN1Parser.definedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID93 = null;
		Token char_literal94 = null;
		Token ID95 = null;
		ASN1Parser.constraint_return constraint96 = null;

		ASN1Parser.restrictedStringType_return restrictedStringType97 = null;

		ASN1Parser.constraint_return constraint98 = null;


		CommonTree ID93_tree = null;
		CommonTree char_literal94_tree = null;
		CommonTree ID95_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_84 = new RewriteRuleTokenStream(adaptor, "token 84");
		RewriteRuleSubtreeStream stream_restrictedStringType = new RewriteRuleSubtreeStream(adaptor, "rule restrictedStringType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:217:15: ( ( ID '.' )? ID ( constraint )? -> ^( TYPE_REFERENCE ID ( ID )? ( constraint )? ) | restrictedStringType ( constraint )? -> ^( CSTRING restrictedStringType ( constraint )? ) )
			int alt27 = 2;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == ID)) {
				alt27 = 1;
			} else if ((LA27_0 == CLASS_DEF || (LA27_0 >= 80 && LA27_0 <= 83) || (LA27_0 >= 87 && LA27_0 <= 88) || LA27_0 == 97 || LA27_0 == 103
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:3: ( ID '.' )? ID ( constraint )?
				{
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:3: ( ID '.' )?
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:4: ID '.'
						{
							ID93 = (Token) match(input, ID, FOLLOW_ID_in_definedType1286);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_ID.add(ID93);


							char_literal94 = (Token) match(input, 84, FOLLOW_84_in_definedType1288);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_84.add(char_literal94);


						}
						break;

					}


					ID95 = (Token) match(input, ID, FOLLOW_ID_in_definedType1292);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID95);


					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:16: ( constraint )?
					int alt25 = 2;
					int LA25_0 = input.LA(1);

					if ((LA25_0 == 81)) {
						alt25 = 1;
					}
					switch (alt25) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:16: constraint
						{
							pushFollow(FOLLOW_constraint_in_definedType1294);
							constraint96 = constraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_constraint.add(constraint96.getTree());

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
						// 218:28: -> ^( TYPE_REFERENCE ID ( ID )? ( constraint )? )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:31: ^( TYPE_REFERENCE ID ( ID )? ( constraint )? )
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

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:51: ( ID )?
								if (stream_ID.hasNext()) {
									adaptor.addChild(
									                root_1,
									                stream_ID.nextNode()
									                );

								}
								stream_ID.reset();

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:218:55: ( constraint )?
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:219:5: restrictedStringType ( constraint )?
				{
					pushFollow(FOLLOW_restrictedStringType_in_definedType1315);
					restrictedStringType97 = restrictedStringType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_restrictedStringType.add(restrictedStringType97.getTree());

					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:219:26: ( constraint )?
					int alt26 = 2;
					int LA26_0 = input.LA(1);

					if ((LA26_0 == 81)) {
						alt26 = 1;
					}
					switch (alt26) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:219:26: constraint
						{
							pushFollow(FOLLOW_constraint_in_definedType1317);
							constraint98 = constraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_constraint.add(constraint98.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: restrictedStringType, constraint
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
						// 219:38: -> ^( CSTRING restrictedStringType ( constraint )? )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:219:41: ^( CSTRING restrictedStringType ( constraint )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(CSTRING, "CSTRING")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_restrictedStringType.nextTree());

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:219:72: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:221:1: selectionType : ID '<' type -> ^( SELECTION_TYPE ID type ) ;
	public final ASN1Parser.selectionType_return selectionType() throws RecognitionException {
		ASN1Parser.selectionType_return retval = new ASN1Parser.selectionType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID99 = null;
		Token char_literal100 = null;
		ASN1Parser.type_return type101 = null;


		CommonTree ID99_tree = null;
		CommonTree char_literal100_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_90 = new RewriteRuleTokenStream(adaptor, "token 90");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:221:17: ( ID '<' type -> ^( SELECTION_TYPE ID type ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:222:3: ID '<' type
			{
				ID99 = (Token) match(input, ID, FOLLOW_ID_in_selectionType1341);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID99);


				char_literal100 = (Token) match(input, 90, FOLLOW_90_in_selectionType1343);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_90.add(char_literal100);


				pushFollow(FOLLOW_type_in_selectionType1345);
				type101 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type101.getTree());

				// AST REWRITE
				// elements: ID, type
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
					// 222:15: -> ^( SELECTION_TYPE ID type )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:222:18: ^( SELECTION_TYPE ID type )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:224:1: enumeratedType : 'ENUMERATED' '{' enumerations '}' -> ^( ENUMERATION enumerations ) ;
	public final ASN1Parser.enumeratedType_return enumeratedType() throws RecognitionException {
		ASN1Parser.enumeratedType_return retval = new ASN1Parser.enumeratedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal102 = null;
		Token char_literal103 = null;
		Token char_literal105 = null;
		ASN1Parser.enumerations_return enumerations104 = null;


		CommonTree string_literal102_tree = null;
		CommonTree char_literal103_tree = null;
		CommonTree char_literal105_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_106 = new RewriteRuleTokenStream(adaptor, "token 106");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_enumerations = new RewriteRuleSubtreeStream(adaptor, "rule enumerations");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:224:18: ( 'ENUMERATED' '{' enumerations '}' -> ^( ENUMERATION enumerations ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:225:3: 'ENUMERATED' '{' enumerations '}'
			{
				string_literal102 = (Token) match(input, 106, FOLLOW_106_in_enumeratedType1367);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_106.add(string_literal102);


				char_literal103 = (Token) match(input, 159, FOLLOW_159_in_enumeratedType1369);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal103);


				pushFollow(FOLLOW_enumerations_in_enumeratedType1371);
				enumerations104 = enumerations();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_enumerations.add(enumerations104.getTree());

				char_literal105 = (Token) match(input, 161, FOLLOW_161_in_enumeratedType1373);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal105);


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
					// 226:3: -> ^( ENUMERATION enumerations )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:226:6: ^( ENUMERATION enumerations )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:228:1: enumerations : enumerationItem ( ',' enumerationItem )* -> ^( VEC ( enumerationItem )+ ) ;
	public final ASN1Parser.enumerations_return enumerations() throws RecognitionException {
		ASN1Parser.enumerations_return retval = new ASN1Parser.enumerations_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal107 = null;
		ASN1Parser.enumerationItem_return enumerationItem106 = null;

		ASN1Parser.enumerationItem_return enumerationItem108 = null;


		CommonTree char_literal107_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_enumerationItem = new RewriteRuleSubtreeStream(adaptor, "rule enumerationItem");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:228:16: ( enumerationItem ( ',' enumerationItem )* -> ^( VEC ( enumerationItem )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:229:3: enumerationItem ( ',' enumerationItem )*
			{
				pushFollow(FOLLOW_enumerationItem_in_enumerations1395);
				enumerationItem106 = enumerationItem();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_enumerationItem.add(enumerationItem106.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:229:19: ( ',' enumerationItem )*
				loop28:
				do {
					int alt28 = 2;
					int LA28_0 = input.LA(1);

					if ((LA28_0 == 83)) {
						alt28 = 1;
					}


					switch (alt28) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:229:20: ',' enumerationItem
						{
							char_literal107 = (Token) match(input, 83, FOLLOW_83_in_enumerations1398);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal107);


							pushFollow(FOLLOW_enumerationItem_in_enumerations1400);
							enumerationItem108 = enumerationItem();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_enumerationItem.add(enumerationItem108.getTree());

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
					// 229:42: -> ^( VEC ( enumerationItem )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:229:45: ^( VEC ( enumerationItem )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:231:1: enumerationItem : ( ( namedNumber )=> namedNumber | ID -> ^( ENUMERATION_ITEM ID ) );
	public final ASN1Parser.enumerationItem_return enumerationItem() throws RecognitionException {
		ASN1Parser.enumerationItem_return retval = new ASN1Parser.enumerationItem_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID110 = null;
		ASN1Parser.namedNumber_return namedNumber109 = null;


		CommonTree ID110_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:231:19: ( ( namedNumber )=> namedNumber | ID -> ^( ENUMERATION_ITEM ID ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:232:3: ( namedNumber )=> namedNumber
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_namedNumber_in_enumerationItem1429);
					namedNumber109 = namedNumber();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, namedNumber109.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:233:4: ID
				{
					ID110 = (Token) match(input, ID, FOLLOW_ID_in_enumerationItem1434);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_ID.add(ID110);


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
						// 233:7: -> ^( ENUMERATION_ITEM ID )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:233:10: ^( ENUMERATION_ITEM ID )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:235:1: bitStringType : 'BIT' 'STRING' ( namedBitList )? -> ^( BIT_STRING namedBitList ) ;
	public final ASN1Parser.bitStringType_return bitStringType() throws RecognitionException {
		ASN1Parser.bitStringType_return retval = new ASN1Parser.bitStringType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal111 = null;
		Token string_literal112 = null;
		ASN1Parser.namedBitList_return namedBitList113 = null;


		CommonTree string_literal111_tree = null;
		CommonTree string_literal112_tree = null;
		RewriteRuleTokenStream stream_96 = new RewriteRuleTokenStream(adaptor, "token 96");
		RewriteRuleTokenStream stream_142 = new RewriteRuleTokenStream(adaptor, "token 142");
		RewriteRuleSubtreeStream stream_namedBitList = new RewriteRuleSubtreeStream(adaptor, "rule namedBitList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:235:17: ( 'BIT' 'STRING' ( namedBitList )? -> ^( BIT_STRING namedBitList ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:236:3: 'BIT' 'STRING' ( namedBitList )?
			{
				string_literal111 = (Token) match(input, 96, FOLLOW_96_in_bitStringType1454);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_96.add(string_literal111);


				string_literal112 = (Token) match(input, 142, FOLLOW_142_in_bitStringType1456);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_142.add(string_literal112);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:236:18: ( namedBitList )?
				int alt30 = 2;
				int LA30_0 = input.LA(1);

				if ((LA30_0 == 159)) {
					alt30 = 1;
				}
				switch (alt30) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:236:18: namedBitList
					{
						pushFollow(FOLLOW_namedBitList_in_bitStringType1458);
						namedBitList113 = namedBitList();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_namedBitList.add(namedBitList113.getTree());

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
					// 236:32: -> ^( BIT_STRING namedBitList )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:236:35: ^( BIT_STRING namedBitList )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:238:1: namedBitList : '{' nameNumberForm ( ',' nameNumberForm )* '}' -> ^( VEC ( nameNumberForm )+ ) ;
	public final ASN1Parser.namedBitList_return namedBitList() throws RecognitionException {
		ASN1Parser.namedBitList_return retval = new ASN1Parser.namedBitList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal114 = null;
		Token char_literal116 = null;
		Token char_literal118 = null;
		ASN1Parser.nameNumberForm_return nameNumberForm115 = null;

		ASN1Parser.nameNumberForm_return nameNumberForm117 = null;


		CommonTree char_literal114_tree = null;
		CommonTree char_literal116_tree = null;
		CommonTree char_literal118_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_nameNumberForm = new RewriteRuleSubtreeStream(adaptor, "rule nameNumberForm");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:238:16: ( '{' nameNumberForm ( ',' nameNumberForm )* '}' -> ^( VEC ( nameNumberForm )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:239:3: '{' nameNumberForm ( ',' nameNumberForm )* '}'
			{
				char_literal114 = (Token) match(input, 159, FOLLOW_159_in_namedBitList1479);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal114);


				pushFollow(FOLLOW_nameNumberForm_in_namedBitList1481);
				nameNumberForm115 = nameNumberForm();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_nameNumberForm.add(nameNumberForm115.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:239:22: ( ',' nameNumberForm )*
				loop31:
				do {
					int alt31 = 2;
					int LA31_0 = input.LA(1);

					if ((LA31_0 == 83)) {
						alt31 = 1;
					}


					switch (alt31) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:239:23: ',' nameNumberForm
						{
							char_literal116 = (Token) match(input, 83, FOLLOW_83_in_namedBitList1484);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal116);


							pushFollow(FOLLOW_nameNumberForm_in_namedBitList1486);
							nameNumberForm117 = nameNumberForm();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_nameNumberForm.add(nameNumberForm117.getTree());

						}
						break;

						default:
							break loop31;
					}
				} while (true);


				char_literal118 = (Token) match(input, 161, FOLLOW_161_in_namedBitList1490);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal118);


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
					// 240:3: -> ^( VEC ( nameNumberForm )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:240:6: ^( VEC ( nameNumberForm )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:243:1: nameNumberForm : ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) ;
	public final ASN1Parser.nameNumberForm_return nameNumberForm() throws RecognitionException {
		ASN1Parser.nameNumberForm_return retval = new ASN1Parser.nameNumberForm_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID119 = null;
		Token char_literal120 = null;
		Token INT121 = null;
		Token char_literal122 = null;

		CommonTree ID119_tree = null;
		CommonTree char_literal120_tree = null;
		CommonTree INT121_tree = null;
		CommonTree char_literal122_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:243:18: ( ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:244:3: ID '(' INT ')'
			{
				ID119 = (Token) match(input, ID, FOLLOW_ID_in_nameNumberForm1514);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID119);


				char_literal120 = (Token) match(input, 81, FOLLOW_81_in_nameNumberForm1516);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_81.add(char_literal120);


				INT121 = (Token) match(input, INT, FOLLOW_INT_in_nameNumberForm1518);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_INT.add(INT121);


				char_literal122 = (Token) match(input, 82, FOLLOW_82_in_nameNumberForm1520);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_82.add(char_literal122);


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
					// 244:18: -> ^( NAME_NUMBER_FORM ID INT )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:244:21: ^( NAME_NUMBER_FORM ID INT )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:246:1: characterStringType : 'CHARACTER' 'STRING' ( constraint )? -> ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? ) ;
	public final ASN1Parser.characterStringType_return characterStringType() throws RecognitionException {
		ASN1Parser.characterStringType_return retval = new ASN1Parser.characterStringType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal123 = null;
		Token string_literal124 = null;
		ASN1Parser.constraint_return constraint125 = null;


		CommonTree string_literal123_tree = null;
		CommonTree string_literal124_tree = null;
		RewriteRuleTokenStream stream_99 = new RewriteRuleTokenStream(adaptor, "token 99");
		RewriteRuleTokenStream stream_142 = new RewriteRuleTokenStream(adaptor, "token 142");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:246:22: ( 'CHARACTER' 'STRING' ( constraint )? -> ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:247:3: 'CHARACTER' 'STRING' ( constraint )?
			{
				string_literal123 = (Token) match(input, 99, FOLLOW_99_in_characterStringType1541);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_99.add(string_literal123);


				string_literal124 = (Token) match(input, 142, FOLLOW_142_in_characterStringType1543);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_142.add(string_literal124);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:247:24: ( constraint )?
				int alt32 = 2;
				int LA32_0 = input.LA(1);

				if ((LA32_0 == 81)) {
					alt32 = 1;
				}
				switch (alt32) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:247:24: constraint
					{
						pushFollow(FOLLOW_constraint_in_characterStringType1545);
						constraint125 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint125.getTree());

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
					// 247:35: -> ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:247:38: ^( CSTRING UNRESTRICTED_CSTRING ( constraint )? )
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

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:247:70: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:250:1: restrictedStringType : (| 'BMPString' | 'GeneralString' | 'GraphicString' | 'IA5String' | 'ISO646String' | 'NumericString' | 'PrintableString' | 'TeletexString' | 'T61String' | 'UniversalString' | 'UTF8String' | 'VideotexString' | 'VisibleString' );
	public final ASN1Parser.restrictedStringType_return restrictedStringType() throws RecognitionException {
		ASN1Parser.restrictedStringType_return retval = new ASN1Parser.restrictedStringType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

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
		Token string_literal137 = null;
		Token string_literal138 = null;

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
		CommonTree string_literal137_tree = null;
		CommonTree string_literal138_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:251:2: (| 'BMPString' | 'GeneralString' | 'GraphicString' | 'IA5String' | 'ISO646String' | 'NumericString' | 'PrintableString' | 'TeletexString' | 'T61String' | 'UniversalString' | 'UTF8String' | 'VideotexString' | 'VisibleString' )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:252:2: 
				{
					root_0 = (CommonTree) adaptor.nil();


				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:252:4: 'BMPString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal126 = (Token) match(input, 97, FOLLOW_97_in_restrictedStringType1573);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal126_tree =
						(CommonTree) adaptor.create(string_literal126)
						;
						adaptor.addChild(root_0, string_literal126_tree);
					}

				}
				break;
				case 3:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:253:4: 'GeneralString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal127 = (Token) match(input, 113, FOLLOW_113_in_restrictedStringType1578);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal127_tree =
						(CommonTree) adaptor.create(string_literal127)
						;
						adaptor.addChild(root_0, string_literal127_tree);
					}

				}
				break;
				case 4:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:254:4: 'GraphicString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal128 = (Token) match(input, 114, FOLLOW_114_in_restrictedStringType1583);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal128_tree =
						(CommonTree) adaptor.create(string_literal128)
						;
						adaptor.addChild(root_0, string_literal128_tree);
					}

				}
				break;
				case 5:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:255:4: 'IA5String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal129 = (Token) match(input, 115, FOLLOW_115_in_restrictedStringType1588);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal129_tree =
						(CommonTree) adaptor.create(string_literal129)
						;
						adaptor.addChild(root_0, string_literal129_tree);
					}

				}
				break;
				case 6:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:256:4: 'ISO646String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal130 = (Token) match(input, 123, FOLLOW_123_in_restrictedStringType1593);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal130_tree =
						(CommonTree) adaptor.create(string_literal130)
						;
						adaptor.addChild(root_0, string_literal130_tree);
					}

				}
				break;
				case 7:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:257:4: 'NumericString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal131 = (Token) match(input, 127, FOLLOW_127_in_restrictedStringType1598);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal131_tree =
						(CommonTree) adaptor.create(string_literal131)
						;
						adaptor.addChild(root_0, string_literal131_tree);
					}

				}
				break;
				case 8:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:258:4: 'PrintableString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal132 = (Token) match(input, 137, FOLLOW_137_in_restrictedStringType1603);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal132_tree =
						(CommonTree) adaptor.create(string_literal132)
						;
						adaptor.addChild(root_0, string_literal132_tree);
					}

				}
				break;
				case 9:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:259:4: 'TeletexString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal133 = (Token) match(input, 146, FOLLOW_146_in_restrictedStringType1608);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal133_tree =
						(CommonTree) adaptor.create(string_literal133)
						;
						adaptor.addChild(root_0, string_literal133_tree);
					}

				}
				break;
				case 10:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:260:4: 'T61String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal134 = (Token) match(input, 143, FOLLOW_143_in_restrictedStringType1613);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal134_tree =
						(CommonTree) adaptor.create(string_literal134)
						;
						adaptor.addChild(root_0, string_literal134_tree);
					}

				}
				break;
				case 11:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:261:4: 'UniversalString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal135 = (Token) match(input, 150, FOLLOW_150_in_restrictedStringType1618);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal135_tree =
						(CommonTree) adaptor.create(string_literal135)
						;
						adaptor.addChild(root_0, string_literal135_tree);
					}

				}
				break;
				case 12:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:262:4: 'UTF8String'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal136 = (Token) match(input, 149, FOLLOW_149_in_restrictedStringType1623);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal136_tree =
						(CommonTree) adaptor.create(string_literal136)
						;
						adaptor.addChild(root_0, string_literal136_tree);
					}

				}
				break;
				case 13:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:263:4: 'VideotexString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal137 = (Token) match(input, 151, FOLLOW_151_in_restrictedStringType1628);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal137_tree =
						(CommonTree) adaptor.create(string_literal137)
						;
						adaptor.addChild(root_0, string_literal137_tree);
					}

				}
				break;
				case 14:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:264:4: 'VisibleString'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal138 = (Token) match(input, 152, FOLLOW_152_in_restrictedStringType1633);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal138_tree =
						(CommonTree) adaptor.create(string_literal138)
						;
						adaptor.addChild(root_0, string_literal138_tree);
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:266:1: choiceType : 'CHOICE' '{' alternativesTypeLists '}' ( constraint )? -> ^( CHOICE alternativesTypeLists ( constraint )? ) ;
	public final ASN1Parser.choiceType_return choiceType() throws RecognitionException {
		ASN1Parser.choiceType_return retval = new ASN1Parser.choiceType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal139 = null;
		Token char_literal140 = null;
		Token char_literal142 = null;
		ASN1Parser.alternativesTypeLists_return alternativesTypeLists141 = null;

		ASN1Parser.constraint_return constraint143 = null;


		CommonTree string_literal139_tree = null;
		CommonTree char_literal140_tree = null;
		CommonTree char_literal142_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleTokenStream stream_100 = new RewriteRuleTokenStream(adaptor, "token 100");
		RewriteRuleSubtreeStream stream_alternativesTypeLists = new RewriteRuleSubtreeStream(adaptor, "rule alternativesTypeLists");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:266:14: ( 'CHOICE' '{' alternativesTypeLists '}' ( constraint )? -> ^( CHOICE alternativesTypeLists ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:267:3: 'CHOICE' '{' alternativesTypeLists '}' ( constraint )?
			{
				string_literal139 = (Token) match(input, 100, FOLLOW_100_in_choiceType1645);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_100.add(string_literal139);


				char_literal140 = (Token) match(input, 159, FOLLOW_159_in_choiceType1647);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal140);


				pushFollow(FOLLOW_alternativesTypeLists_in_choiceType1649);
				alternativesTypeLists141 = alternativesTypeLists();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_alternativesTypeLists.add(alternativesTypeLists141.getTree());

				char_literal142 = (Token) match(input, 161, FOLLOW_161_in_choiceType1651);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal142);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:267:42: ( constraint )?
				int alt34 = 2;
				int LA34_0 = input.LA(1);

				if ((LA34_0 == 81)) {
					alt34 = 1;
				}
				switch (alt34) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:267:42: constraint
					{
						pushFollow(FOLLOW_constraint_in_choiceType1653);
						constraint143 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint143.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: alternativesTypeLists, constraint
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
					// 267:54: -> ^( CHOICE alternativesTypeLists ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:267:57: ^( CHOICE alternativesTypeLists ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CHOICE, "CHOICE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_alternativesTypeLists.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:267:88: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:269:1: alternativesTypeLists : alternativeTypeList ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )? -> ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? ) ;
	public final ASN1Parser.alternativesTypeLists_return alternativesTypeLists() throws RecognitionException {
		ASN1Parser.alternativesTypeLists_return retval = new ASN1Parser.alternativesTypeLists_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal145 = null;
		Token char_literal147 = null;
		ASN1Parser.alternativeTypeList_return alternativeTypeList144 = null;

		ASN1Parser.extensionAndException_return extensionAndException146 = null;

		ASN1Parser.extensionAdditionAlternativesList_return extensionAdditionAlternativesList148 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker149 = null;


		CommonTree char_literal145_tree = null;
		CommonTree char_literal147_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAndException = new RewriteRuleSubtreeStream(adaptor, "rule extensionAndException");
		RewriteRuleSubtreeStream stream_alternativeTypeList = new RewriteRuleSubtreeStream(adaptor, "rule alternativeTypeList");
		RewriteRuleSubtreeStream stream_extensionEndMarker = new RewriteRuleSubtreeStream(adaptor, "rule extensionEndMarker");
		RewriteRuleSubtreeStream stream_extensionAdditionAlternativesList = new RewriteRuleSubtreeStream(
		                                                                                                adaptor,
		                                                                                                "rule extensionAdditionAlternativesList"
		);
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:269:24: ( alternativeTypeList ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )? -> ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:3: alternativeTypeList ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )?
			{
				pushFollow(FOLLOW_alternativeTypeList_in_alternativesTypeLists1676);
				alternativeTypeList144 = alternativeTypeList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_alternativeTypeList.add(alternativeTypeList144.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:23: ( ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )? )?
				int alt37 = 2;
				int LA37_0 = input.LA(1);

				if ((LA37_0 == 83)) {
					alt37 = 1;
				}
				switch (alt37) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:24: ',' extensionAndException ( ',' extensionAdditionAlternativesList )? ( extensionEndMarker )?
					{
						char_literal145 = (Token) match(input, 83, FOLLOW_83_in_alternativesTypeLists1679);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_83.add(char_literal145);


						pushFollow(FOLLOW_extensionAndException_in_alternativesTypeLists1681);
						extensionAndException146 = extensionAndException();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionAndException.add(extensionAndException146.getTree());

						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:50: ( ',' extensionAdditionAlternativesList )?
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
								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:51: ',' extensionAdditionAlternativesList
							{
								char_literal147 = (Token) match(input, 83, FOLLOW_83_in_alternativesTypeLists1684);
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_83.add(char_literal147);


								pushFollow(FOLLOW_extensionAdditionAlternativesList_in_alternativesTypeLists1686);
								extensionAdditionAlternativesList148 = extensionAdditionAlternativesList();

								state._fsp--;
								if (state.failed) return retval;
								if (state.backtracking == 0) {
									stream_extensionAdditionAlternativesList.add(extensionAdditionAlternativesList148.getTree());
								}

							}
							break;

						}


						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:91: ( extensionEndMarker )?
						int alt36 = 2;
						int LA36_0 = input.LA(1);

						if ((LA36_0 == 83)) {
							alt36 = 1;
						}
						switch (alt36) {
							case 1:
								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:270:91: extensionEndMarker
							{
								pushFollow(FOLLOW_extensionEndMarker_in_alternativesTypeLists1690);
								extensionEndMarker149 = extensionEndMarker();

								state._fsp--;
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker149.getTree());

							}
							break;

						}


					}
					break;

				}


				// AST REWRITE
				// elements: extensionEndMarker, extensionAdditionAlternativesList, alternativeTypeList, extensionAndException
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
					// 271:3: -> ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:271:6: ^( alternativeTypeList ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(stream_alternativeTypeList.nextNode(), root_1);

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:271:28: ( extensionAndException ( extensionAdditionAlternativesList )? ( extensionEndMarker )? )?
							if (stream_extensionEndMarker.hasNext() || stream_extensionAdditionAlternativesList.hasNext()
							    || stream_extensionAndException.hasNext()) {
								adaptor.addChild(root_1, stream_extensionAndException.nextTree());

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:271:51: ( extensionAdditionAlternativesList )?
								if (stream_extensionAdditionAlternativesList.hasNext()) {
									adaptor.addChild(root_1, stream_extensionAdditionAlternativesList.nextTree());

								}
								stream_extensionAdditionAlternativesList.reset();

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:271:86: ( extensionEndMarker )?
								if (stream_extensionEndMarker.hasNext()) {
									adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

								}
								stream_extensionEndMarker.reset();

							}
							stream_extensionEndMarker.reset();
							stream_extensionAdditionAlternativesList.reset();
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:273:1: alternativeTypeList : namedType ( ',' namedType )* -> ^( VEC ( namedType )+ ) ;
	public final ASN1Parser.alternativeTypeList_return alternativeTypeList() throws RecognitionException {
		ASN1Parser.alternativeTypeList_return retval = new ASN1Parser.alternativeTypeList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal151 = null;
		ASN1Parser.namedType_return namedType150 = null;

		ASN1Parser.namedType_return namedType152 = null;


		CommonTree char_literal151_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_namedType = new RewriteRuleSubtreeStream(adaptor, "rule namedType");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:273:22: ( namedType ( ',' namedType )* -> ^( VEC ( namedType )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:274:3: namedType ( ',' namedType )*
			{
				pushFollow(FOLLOW_namedType_in_alternativeTypeList1723);
				namedType150 = namedType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_namedType.add(namedType150.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:274:13: ( ',' namedType )*
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:274:14: ',' namedType
						{
							char_literal151 = (Token) match(input, 83, FOLLOW_83_in_alternativeTypeList1726);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal151);


							pushFollow(FOLLOW_namedType_in_alternativeTypeList1728);
							namedType152 = namedType();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_namedType.add(namedType152.getTree());

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
					// 274:30: -> ^( VEC ( namedType )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:274:33: ^( VEC ( namedType )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:276:1: extensionAdditionAlternativesList : extensionAdditionAlternative ( ',' extensionAdditionAlternative )* -> ^( VEC ( extensionAdditionAlternative )+ ) ;
	public final ASN1Parser.extensionAdditionAlternativesList_return extensionAdditionAlternativesList() throws RecognitionException {
		ASN1Parser.extensionAdditionAlternativesList_return retval = new ASN1Parser.extensionAdditionAlternativesList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal154 = null;
		ASN1Parser.extensionAdditionAlternative_return extensionAdditionAlternative153 = null;

		ASN1Parser.extensionAdditionAlternative_return extensionAdditionAlternative155 = null;


		CommonTree char_literal154_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAdditionAlternative = new RewriteRuleSubtreeStream(adaptor, "rule extensionAdditionAlternative");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:276:34: ( extensionAdditionAlternative ( ',' extensionAdditionAlternative )* -> ^( VEC ( extensionAdditionAlternative )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:277:3: extensionAdditionAlternative ( ',' extensionAdditionAlternative )*
			{
				pushFollow(FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1748);
				extensionAdditionAlternative153 = extensionAdditionAlternative();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_extensionAdditionAlternative.add(extensionAdditionAlternative153.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:277:32: ( ',' extensionAdditionAlternative )*
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:277:33: ',' extensionAdditionAlternative
						{
							char_literal154 = (Token) match(input, 83, FOLLOW_83_in_extensionAdditionAlternativesList1751);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal154);


							pushFollow(FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1753);
							extensionAdditionAlternative155 = extensionAdditionAlternative();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionAdditionAlternative.add(extensionAdditionAlternative155.getTree());

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
					// 277:68: -> ^( VEC ( extensionAdditionAlternative )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:277:71: ^( VEC ( extensionAdditionAlternative )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:279:1: extensionAdditionAlternative : ( extensionAdditionAlternativesGroup | namedType );
	public final ASN1Parser.extensionAdditionAlternative_return extensionAdditionAlternative() throws RecognitionException {
		ASN1Parser.extensionAdditionAlternative_return retval = new ASN1Parser.extensionAdditionAlternative_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.extensionAdditionAlternativesGroup_return extensionAdditionAlternativesGroup156 = null;

		ASN1Parser.namedType_return namedType157 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:279:30: ( extensionAdditionAlternativesGroup | namedType )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:280:3: extensionAdditionAlternativesGroup
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_extensionAdditionAlternativesGroup_in_extensionAdditionAlternative1774);
					extensionAdditionAlternativesGroup156 = extensionAdditionAlternativesGroup();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, extensionAdditionAlternativesGroup156.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:280:40: namedType
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_namedType_in_extensionAdditionAlternative1778);
					namedType157 = namedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, namedType157.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:282:1: extensionAdditionAlternativesGroup : '[[' ( INT ':' )? alternativeTypeList ']]' -> ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList ) ;
	public final ASN1Parser.extensionAdditionAlternativesGroup_return extensionAdditionAlternativesGroup() throws RecognitionException {
		ASN1Parser.extensionAdditionAlternativesGroup_return retval = new ASN1Parser.extensionAdditionAlternativesGroup_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal158 = null;
		Token INT159 = null;
		Token char_literal160 = null;
		Token string_literal162 = null;
		ASN1Parser.alternativeTypeList_return alternativeTypeList161 = null;


		CommonTree string_literal158_tree = null;
		CommonTree INT159_tree = null;
		CommonTree char_literal160_tree = null;
		CommonTree string_literal162_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_157 = new RewriteRuleTokenStream(adaptor, "token 157");
		RewriteRuleTokenStream stream_87 = new RewriteRuleTokenStream(adaptor, "token 87");
		RewriteRuleTokenStream stream_155 = new RewriteRuleTokenStream(adaptor, "token 155");
		RewriteRuleSubtreeStream stream_alternativeTypeList = new RewriteRuleSubtreeStream(adaptor, "rule alternativeTypeList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:282:35: ( '[[' ( INT ':' )? alternativeTypeList ']]' -> ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:283:3: '[[' ( INT ':' )? alternativeTypeList ']]'
			{
				string_literal158 = (Token) match(input, 155, FOLLOW_155_in_extensionAdditionAlternativesGroup1787);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_155.add(string_literal158);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:283:8: ( INT ':' )?
				int alt41 = 2;
				int LA41_0 = input.LA(1);

				if ((LA41_0 == INT)) {
					alt41 = 1;
				}
				switch (alt41) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:283:9: INT ':'
					{
						INT159 = (Token) match(input, INT, FOLLOW_INT_in_extensionAdditionAlternativesGroup1790);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT159);


						char_literal160 = (Token) match(input, 87, FOLLOW_87_in_extensionAdditionAlternativesGroup1792);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_87.add(char_literal160);


					}
					break;

				}


				pushFollow(FOLLOW_alternativeTypeList_in_extensionAdditionAlternativesGroup1797);
				alternativeTypeList161 = alternativeTypeList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_alternativeTypeList.add(alternativeTypeList161.getTree());

				string_literal162 = (Token) match(input, 157, FOLLOW_157_in_extensionAdditionAlternativesGroup1799);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_157.add(string_literal162);


				// AST REWRITE
				// elements: INT, alternativeTypeList
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
					// 284:3: -> ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:284:6: ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( INT )? alternativeTypeList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(
							                                                                   EXTENSION_ADDITION_ALTERNATIVES_GROUP,
							                                                                   "EXTENSION_ADDITION_ALTERNATIVES_GROUP"
							                                                                   )
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:284:46: ( INT )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:286:1: setType : 'SET' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SET ( componentTypeLists )? ( constraint )? ) ;
	public final ASN1Parser.setType_return setType() throws RecognitionException {
		ASN1Parser.setType_return retval = new ASN1Parser.setType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal163 = null;
		Token char_literal164 = null;
		Token char_literal166 = null;
		ASN1Parser.componentTypeLists_return componentTypeLists165 = null;

		ASN1Parser.constraint_return constraint167 = null;


		CommonTree string_literal163_tree = null;
		CommonTree char_literal164_tree = null;
		CommonTree char_literal166_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleTokenStream stream_140 = new RewriteRuleTokenStream(adaptor, "token 140");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_componentTypeLists = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeLists");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:286:12: ( 'SET' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SET ( componentTypeLists )? ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:3: 'SET' '{' ( componentTypeLists )? '}' ( constraint )?
			{
				string_literal163 = (Token) match(input, 140, FOLLOW_140_in_setType1826);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_140.add(string_literal163);


				char_literal164 = (Token) match(input, 159, FOLLOW_159_in_setType1828);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal164);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:13: ( componentTypeLists )?
				int alt42 = 2;
				int LA42_0 = input.LA(1);

				if ((LA42_0 == ID || LA42_0 == 86 || LA42_0 == 102)) {
					alt42 = 1;
				}
				switch (alt42) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:13: componentTypeLists
					{
						pushFollow(FOLLOW_componentTypeLists_in_setType1830);
						componentTypeLists165 = componentTypeLists();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_componentTypeLists.add(componentTypeLists165.getTree());

					}
					break;

				}


				char_literal166 = (Token) match(input, 161, FOLLOW_161_in_setType1833);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal166);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:37: ( constraint )?
				int alt43 = 2;
				int LA43_0 = input.LA(1);

				if ((LA43_0 == 81)) {
					alt43 = 1;
				}
				switch (alt43) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:37: constraint
					{
						pushFollow(FOLLOW_constraint_in_setType1835);
						constraint167 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint167.getTree());

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
					// 287:49: -> ^( SET ( componentTypeLists )? ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:52: ^( SET ( componentTypeLists )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SET, "SET")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:58: ( componentTypeLists )?
							if (stream_componentTypeLists.hasNext()) {
								adaptor.addChild(root_1, stream_componentTypeLists.nextTree());

							}
							stream_componentTypeLists.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:287:78: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:289:1: setOfType : 'SET' ( constraint )? 'OF' sOfComponentType -> ^( SETOF sOfComponentType ( constraint )? ) ;
	public final ASN1Parser.setOfType_return setOfType() throws RecognitionException {
		ASN1Parser.setOfType_return retval = new ASN1Parser.setOfType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal168 = null;
		Token string_literal170 = null;
		ASN1Parser.constraint_return constraint169 = null;

		ASN1Parser.sOfComponentType_return sOfComponentType171 = null;


		CommonTree string_literal168_tree = null;
		CommonTree string_literal170_tree = null;
		RewriteRuleTokenStream stream_140 = new RewriteRuleTokenStream(adaptor, "token 140");
		RewriteRuleTokenStream stream_130 = new RewriteRuleTokenStream(adaptor, "token 130");
		RewriteRuleSubtreeStream stream_sOfComponentType = new RewriteRuleSubtreeStream(adaptor, "rule sOfComponentType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:289:13: ( 'SET' ( constraint )? 'OF' sOfComponentType -> ^( SETOF sOfComponentType ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:290:3: 'SET' ( constraint )? 'OF' sOfComponentType
			{
				string_literal168 = (Token) match(input, 140, FOLLOW_140_in_setOfType1861);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_140.add(string_literal168);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:290:9: ( constraint )?
				int alt44 = 2;
				int LA44_0 = input.LA(1);

				if ((LA44_0 == 81)) {
					alt44 = 1;
				}
				switch (alt44) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:290:9: constraint
					{
						pushFollow(FOLLOW_constraint_in_setOfType1863);
						constraint169 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint169.getTree());

					}
					break;

				}


				string_literal170 = (Token) match(input, 130, FOLLOW_130_in_setOfType1866);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_130.add(string_literal170);


				pushFollow(FOLLOW_sOfComponentType_in_setOfType1868);
				sOfComponentType171 = sOfComponentType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_sOfComponentType.add(sOfComponentType171.getTree());

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
					// 290:43: -> ^( SETOF sOfComponentType ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:290:46: ^( SETOF sOfComponentType ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SETOF, "SETOF")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_sOfComponentType.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:290:71: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:292:1: sOfComponentType : ( ( VALUE_ID )=> namedType | type );
	public final ASN1Parser.sOfComponentType_return sOfComponentType() throws RecognitionException {
		ASN1Parser.sOfComponentType_return retval = new ASN1Parser.sOfComponentType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.namedType_return namedType172 = null;

		ASN1Parser.type_return type173 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:293:2: ( ( VALUE_ID )=> namedType | type )
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
			} else if ((LA45_0 == CLASS_DEF || (LA45_0 >= 80 && LA45_0 <= 83) || (LA45_0 >= 87 && LA45_0 <= 88) || (LA45_0 >= 96 && LA45_0 <= 100)
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:293:4: ( VALUE_ID )=> namedType
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_namedType_in_sOfComponentType1892);
					namedType172 = namedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, namedType172.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:293:28: type
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_type_in_sOfComponentType1896);
					type173 = type();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, type173.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:295:1: sequenceType : 'SEQUENCE' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SEQUENCE ( componentTypeLists )? ( constraint )? ) ;
	public final ASN1Parser.sequenceType_return sequenceType() throws RecognitionException {
		ASN1Parser.sequenceType_return retval = new ASN1Parser.sequenceType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal174 = null;
		Token char_literal175 = null;
		Token char_literal177 = null;
		ASN1Parser.componentTypeLists_return componentTypeLists176 = null;

		ASN1Parser.constraint_return constraint178 = null;


		CommonTree string_literal174_tree = null;
		CommonTree char_literal175_tree = null;
		CommonTree char_literal177_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_139 = new RewriteRuleTokenStream(adaptor, "token 139");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_componentTypeLists = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeLists");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:295:16: ( 'SEQUENCE' '{' ( componentTypeLists )? '}' ( constraint )? -> ^( SEQUENCE ( componentTypeLists )? ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:3: 'SEQUENCE' '{' ( componentTypeLists )? '}' ( constraint )?
			{
				string_literal174 = (Token) match(input, 139, FOLLOW_139_in_sequenceType1909);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_139.add(string_literal174);


				char_literal175 = (Token) match(input, 159, FOLLOW_159_in_sequenceType1911);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_159.add(char_literal175);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:18: ( componentTypeLists )?
				int alt46 = 2;
				int LA46_0 = input.LA(1);

				if ((LA46_0 == ID || LA46_0 == 86 || LA46_0 == 102)) {
					alt46 = 1;
				}
				switch (alt46) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:18: componentTypeLists
					{
						pushFollow(FOLLOW_componentTypeLists_in_sequenceType1913);
						componentTypeLists176 = componentTypeLists();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_componentTypeLists.add(componentTypeLists176.getTree());

					}
					break;

				}


				char_literal177 = (Token) match(input, 161, FOLLOW_161_in_sequenceType1916);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_161.add(char_literal177);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:42: ( constraint )?
				int alt47 = 2;
				int LA47_0 = input.LA(1);

				if ((LA47_0 == 81)) {
					alt47 = 1;
				}
				switch (alt47) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:42: constraint
					{
						pushFollow(FOLLOW_constraint_in_sequenceType1918);
						constraint178 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint178.getTree());

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
					// 297:53: -> ^( SEQUENCE ( componentTypeLists )? ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:56: ^( SEQUENCE ( componentTypeLists )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SEQUENCE, "SEQUENCE")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:67: ( componentTypeLists )?
							if (stream_componentTypeLists.hasNext()) {
								adaptor.addChild(root_1, stream_componentTypeLists.nextTree());

							}
							stream_componentTypeLists.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:297:87: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:299:1: componentTypeLists : ( componentTypeList ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? -> ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? ) | extensionAndException ( extensionAdditions )? ( extensionEndMarker )? -> ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? ) );
	public final ASN1Parser.componentTypeLists_return componentTypeLists() throws RecognitionException {
		ASN1Parser.componentTypeLists_return retval = new ASN1Parser.componentTypeLists_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal180 = null;
		ASN1Parser.componentTypeList_return componentTypeList179 = null;

		ASN1Parser.extensionAndException_return extensionAndException181 = null;

		ASN1Parser.extensionAdditions_return extensionAdditions182 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker183 = null;

		ASN1Parser.componentTypeList_return componentTypeList184 = null;

		ASN1Parser.extensionAndException_return extensionAndException185 = null;

		ASN1Parser.extensionAdditions_return extensionAdditions186 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker187 = null;


		CommonTree char_literal180_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAndException = new RewriteRuleSubtreeStream(adaptor, "rule extensionAndException");
		RewriteRuleSubtreeStream stream_extensionEndMarker = new RewriteRuleSubtreeStream(adaptor, "rule extensionEndMarker");
		RewriteRuleSubtreeStream stream_componentTypeList = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeList");
		RewriteRuleSubtreeStream stream_extensionAdditions = new RewriteRuleSubtreeStream(adaptor, "rule extensionAdditions");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:299:21: ( componentTypeList ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? -> ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? ) | extensionAndException ( extensionAdditions )? ( extensionEndMarker )? -> ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:3: componentTypeList ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )?
				{
					pushFollow(FOLLOW_componentTypeList_in_componentTypeLists1942);
					componentTypeList179 = componentTypeList();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_componentTypeList.add(componentTypeList179.getTree());

					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:21: ( ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )?
					int alt51 = 2;
					int LA51_0 = input.LA(1);

					if ((LA51_0 == 83)) {
						alt51 = 1;
					}
					switch (alt51) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:22: ',' extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )?
						{
							char_literal180 = (Token) match(input, 83, FOLLOW_83_in_componentTypeLists1945);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal180);


							pushFollow(FOLLOW_extensionAndException_in_componentTypeLists1947);
							extensionAndException181 = extensionAndException();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionAndException.add(extensionAndException181.getTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:48: ( extensionAdditions )?
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
									// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:48: extensionAdditions
								{
									pushFollow(FOLLOW_extensionAdditions_in_componentTypeLists1949);
									extensionAdditions182 = extensionAdditions();

									state._fsp--;
									if (state.failed) return retval;
									if (state.backtracking == 0) stream_extensionAdditions.add(extensionAdditions182.getTree());

								}
								break;

							}


							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:68: ( extensionEndMarker ( componentTypeList )? )?
							int alt50 = 2;
							int LA50_0 = input.LA(1);

							if ((LA50_0 == 83)) {
								alt50 = 1;
							}
							switch (alt50) {
								case 1:
									// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:69: extensionEndMarker ( componentTypeList )?
								{
									pushFollow(FOLLOW_extensionEndMarker_in_componentTypeLists1953);
									extensionEndMarker183 = extensionEndMarker();

									state._fsp--;
									if (state.failed) return retval;
									if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker183.getTree());

									// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:88: ( componentTypeList )?
									int alt49 = 2;
									int LA49_0 = input.LA(1);

									if ((LA49_0 == ID || LA49_0 == 102)) {
										alt49 = 1;
									}
									switch (alt49) {
										case 1:
											// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:300:88: componentTypeList
										{
											pushFollow(FOLLOW_componentTypeList_in_componentTypeLists1955);
											componentTypeList184 = componentTypeList();

											state._fsp--;
											if (state.failed) return retval;
											if (state.backtracking == 0) stream_componentTypeList.add(componentTypeList184.getTree());

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
					// elements: extensionAndException, extensionAdditions, componentTypeList, componentTypeList, extensionEndMarker
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
						// 301:3: -> ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:301:6: ^( componentTypeList ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(stream_componentTypeList.nextNode(), root_1);

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:301:26: ( extensionAndException ( extensionAdditions )? ( extensionEndMarker ( componentTypeList )? )? )?
								if (stream_extensionAndException.hasNext() || stream_extensionAdditions.hasNext()
								    || stream_extensionEndMarker.hasNext()) {
									adaptor.addChild(root_1, stream_extensionAndException.nextTree());

									// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:301:49: ( extensionAdditions )?
									if (stream_extensionAdditions.hasNext()) {
										adaptor.addChild(root_1, stream_extensionAdditions.nextTree());

									}
									stream_extensionAdditions.reset();

									// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:301:69: ( extensionEndMarker ( componentTypeList )? )?
									if (stream_componentTypeList.hasNext() || stream_extensionEndMarker.hasNext()) {
										adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

										// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:301:89: ( componentTypeList )?
										if (stream_componentTypeList.hasNext()) {
											adaptor.addChild(root_1, stream_componentTypeList.nextTree());

										}
										stream_componentTypeList.reset();

									}
									stream_componentTypeList.reset();
									stream_extensionEndMarker.reset();

								}
								stream_extensionAndException.reset();
								stream_extensionAdditions.reset();
								stream_extensionEndMarker.reset();

								adaptor.addChild(root_0, root_1);
							}

						}


						retval.tree = root_0;
					}

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:302:4: extensionAndException ( extensionAdditions )? ( extensionEndMarker )?
				{
					pushFollow(FOLLOW_extensionAndException_in_componentTypeLists2006);
					extensionAndException185 = extensionAndException();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_extensionAndException.add(extensionAndException185.getTree());

					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:302:26: ( extensionAdditions )?
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:302:26: extensionAdditions
						{
							pushFollow(FOLLOW_extensionAdditions_in_componentTypeLists2008);
							extensionAdditions186 = extensionAdditions();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionAdditions.add(extensionAdditions186.getTree());

						}
						break;

					}


					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:302:46: ( extensionEndMarker )?
					int alt53 = 2;
					int LA53_0 = input.LA(1);

					if ((LA53_0 == 83)) {
						alt53 = 1;
					}
					switch (alt53) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:302:46: extensionEndMarker
						{
							pushFollow(FOLLOW_extensionEndMarker_in_componentTypeLists2011);
							extensionEndMarker187 = extensionEndMarker();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker187.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: extensionEndMarker, extensionAdditions, extensionAndException
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
						// 303:3: -> ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:303:6: ^( extensionAndException ( extensionAdditions )? ( extensionEndMarker )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(stream_extensionAndException.nextNode(), root_1);

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:303:30: ( extensionAdditions )?
								if (stream_extensionAdditions.hasNext()) {
									adaptor.addChild(root_1, stream_extensionAdditions.nextTree());

								}
								stream_extensionAdditions.reset();

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:303:50: ( extensionEndMarker )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:305:1: componentTypeList : componentType ( ',' componentType )* -> ^( VEC ( componentType )+ ) ;
	public final ASN1Parser.componentTypeList_return componentTypeList() throws RecognitionException {
		ASN1Parser.componentTypeList_return retval = new ASN1Parser.componentTypeList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal189 = null;
		ASN1Parser.componentType_return componentType188 = null;

		ASN1Parser.componentType_return componentType190 = null;


		CommonTree char_literal189_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_componentType = new RewriteRuleSubtreeStream(adaptor, "rule componentType");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:305:20: ( componentType ( ',' componentType )* -> ^( VEC ( componentType )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:306:3: componentType ( ',' componentType )*
			{
				pushFollow(FOLLOW_componentType_in_componentTypeList2040);
				componentType188 = componentType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_componentType.add(componentType188.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:306:17: ( ',' componentType )*
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
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:306:18: ',' componentType
						{
							char_literal189 = (Token) match(input, 83, FOLLOW_83_in_componentTypeList2043);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal189);


							pushFollow(FOLLOW_componentType_in_componentTypeList2045);
							componentType190 = componentType();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_componentType.add(componentType190.getTree());

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
					// 306:38: -> ^( VEC ( componentType )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:306:41: ^( VEC ( componentType )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:308:1: componentType : ( namedType ( componentTypeOption )? -> ^( COMPONENT_TYPE namedType ( componentTypeOption )? ) | 'COMPONENTS' 'OF' type -> ^( COMPONENT_TYPE type ) );
	public final ASN1Parser.componentType_return componentType() throws RecognitionException {
		ASN1Parser.componentType_return retval = new ASN1Parser.componentType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal193 = null;
		Token string_literal194 = null;
		ASN1Parser.namedType_return namedType191 = null;

		ASN1Parser.componentTypeOption_return componentTypeOption192 = null;

		ASN1Parser.type_return type195 = null;


		CommonTree string_literal193_tree = null;
		CommonTree string_literal194_tree = null;
		RewriteRuleTokenStream stream_102 = new RewriteRuleTokenStream(adaptor, "token 102");
		RewriteRuleTokenStream stream_130 = new RewriteRuleTokenStream(adaptor, "token 130");
		RewriteRuleSubtreeStream stream_namedType = new RewriteRuleSubtreeStream(adaptor, "rule namedType");
		RewriteRuleSubtreeStream stream_componentTypeOption = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeOption");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:308:17: ( namedType ( componentTypeOption )? -> ^( COMPONENT_TYPE namedType ( componentTypeOption )? ) | 'COMPONENTS' 'OF' type -> ^( COMPONENT_TYPE type ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:309:3: namedType ( componentTypeOption )?
				{
					pushFollow(FOLLOW_namedType_in_componentType2069);
					namedType191 = namedType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_namedType.add(namedType191.getTree());

					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:309:13: ( componentTypeOption )?
					int alt56 = 2;
					int LA56_0 = input.LA(1);

					if ((LA56_0 == 103 || LA56_0 == 132)) {
						alt56 = 1;
					}
					switch (alt56) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:309:13: componentTypeOption
						{
							pushFollow(FOLLOW_componentTypeOption_in_componentType2071);
							componentTypeOption192 = componentTypeOption();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_componentTypeOption.add(componentTypeOption192.getTree());

						}
						break;

					}


					// AST REWRITE
					// elements: componentTypeOption, namedType
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
						// 309:34: -> ^( COMPONENT_TYPE namedType ( componentTypeOption )? )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:309:37: ^( COMPONENT_TYPE namedType ( componentTypeOption )? )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(COMPONENT_TYPE, "COMPONENT_TYPE")
								                                        , root_1
								                                        );

								adaptor.addChild(root_1, stream_namedType.nextTree());

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:309:65: ( componentTypeOption )?
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:310:4: 'COMPONENTS' 'OF' type
				{
					string_literal193 = (Token) match(input, 102, FOLLOW_102_in_componentType2090);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_102.add(string_literal193);


					string_literal194 = (Token) match(input, 130, FOLLOW_130_in_componentType2092);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_130.add(string_literal194);


					pushFollow(FOLLOW_type_in_componentType2094);
					type195 = type();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_type.add(type195.getTree());

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
						// 310:27: -> ^( COMPONENT_TYPE type )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:310:30: ^( COMPONENT_TYPE type )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:312:1: componentTypeOption : ( 'OPTIONAL' -> ^( COMPONENT_TYPE_OPTION ) | 'DEFAULT' value -> ^( COMPONENT_TYPE_OPTION value ) );
	public final ASN1Parser.componentTypeOption_return componentTypeOption() throws RecognitionException {
		ASN1Parser.componentTypeOption_return retval = new ASN1Parser.componentTypeOption_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal196 = null;
		Token string_literal197 = null;
		ASN1Parser.value_return value198 = null;


		CommonTree string_literal196_tree = null;
		CommonTree string_literal197_tree = null;
		RewriteRuleTokenStream stream_132 = new RewriteRuleTokenStream(adaptor, "token 132");
		RewriteRuleTokenStream stream_103 = new RewriteRuleTokenStream(adaptor, "token 103");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:312:22: ( 'OPTIONAL' -> ^( COMPONENT_TYPE_OPTION ) | 'DEFAULT' value -> ^( COMPONENT_TYPE_OPTION value ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:313:3: 'OPTIONAL'
				{
					string_literal196 = (Token) match(input, 132, FOLLOW_132_in_componentTypeOption2114);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_132.add(string_literal196);


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
						// 313:14: -> ^( COMPONENT_TYPE_OPTION )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:313:17: ^( COMPONENT_TYPE_OPTION )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:314:4: 'DEFAULT' value
				{
					string_literal197 = (Token) match(input, 103, FOLLOW_103_in_componentTypeOption2126);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_103.add(string_literal197);


					pushFollow(FOLLOW_value_in_componentTypeOption2128);
					value198 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_value.add(value198.getTree());

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
						// 314:20: -> ^( COMPONENT_TYPE_OPTION value )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:314:23: ^( COMPONENT_TYPE_OPTION value )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:316:1: extensionAdditions : ',' extensionAddition ( ',' extensionAddition )? -> ^( VEC ( extensionAddition )+ ) ;
	public final ASN1Parser.extensionAdditions_return extensionAdditions() throws RecognitionException {
		ASN1Parser.extensionAdditions_return retval = new ASN1Parser.extensionAdditions_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal199 = null;
		Token char_literal201 = null;
		ASN1Parser.extensionAddition_return extensionAddition200 = null;

		ASN1Parser.extensionAddition_return extensionAddition202 = null;


		CommonTree char_literal199_tree = null;
		CommonTree char_literal201_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionAddition = new RewriteRuleSubtreeStream(adaptor, "rule extensionAddition");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:316:21: ( ',' extensionAddition ( ',' extensionAddition )? -> ^( VEC ( extensionAddition )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:317:3: ',' extensionAddition ( ',' extensionAddition )?
			{
				char_literal199 = (Token) match(input, 83, FOLLOW_83_in_extensionAdditions2149);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_83.add(char_literal199);


				pushFollow(FOLLOW_extensionAddition_in_extensionAdditions2151);
				extensionAddition200 = extensionAddition();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_extensionAddition.add(extensionAddition200.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:317:25: ( ',' extensionAddition )?
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
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:317:26: ',' extensionAddition
					{
						char_literal201 = (Token) match(input, 83, FOLLOW_83_in_extensionAdditions2154);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_83.add(char_literal201);


						pushFollow(FOLLOW_extensionAddition_in_extensionAdditions2156);
						extensionAddition202 = extensionAddition();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionAddition.add(extensionAddition202.getTree());

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
					// 317:50: -> ^( VEC ( extensionAddition )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:317:53: ^( VEC ( extensionAddition )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:319:1: extensionAddition : ( componentType | extensionAdditionGroup );
	public final ASN1Parser.extensionAddition_return extensionAddition() throws RecognitionException {
		ASN1Parser.extensionAddition_return retval = new ASN1Parser.extensionAddition_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.componentType_return componentType203 = null;

		ASN1Parser.extensionAdditionGroup_return extensionAdditionGroup204 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:319:20: ( componentType | extensionAdditionGroup )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:320:3: componentType
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_componentType_in_extensionAddition2181);
					componentType203 = componentType();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, componentType203.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:320:19: extensionAdditionGroup
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_extensionAdditionGroup_in_extensionAddition2185);
					extensionAdditionGroup204 = extensionAdditionGroup();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, extensionAdditionGroup204.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:321:1: extensionAdditionGroup : '[[' ( INT ':' )? componentTypeList ']]' -> ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList ) ;
	public final ASN1Parser.extensionAdditionGroup_return extensionAdditionGroup() throws RecognitionException {
		ASN1Parser.extensionAdditionGroup_return retval = new ASN1Parser.extensionAdditionGroup_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal205 = null;
		Token INT206 = null;
		Token char_literal207 = null;
		Token string_literal209 = null;
		ASN1Parser.componentTypeList_return componentTypeList208 = null;


		CommonTree string_literal205_tree = null;
		CommonTree INT206_tree = null;
		CommonTree char_literal207_tree = null;
		CommonTree string_literal209_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_157 = new RewriteRuleTokenStream(adaptor, "token 157");
		RewriteRuleTokenStream stream_87 = new RewriteRuleTokenStream(adaptor, "token 87");
		RewriteRuleTokenStream stream_155 = new RewriteRuleTokenStream(adaptor, "token 155");
		RewriteRuleSubtreeStream stream_componentTypeList = new RewriteRuleSubtreeStream(adaptor, "rule componentTypeList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:321:25: ( '[[' ( INT ':' )? componentTypeList ']]' -> ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:322:3: '[[' ( INT ':' )? componentTypeList ']]'
			{
				string_literal205 = (Token) match(input, 155, FOLLOW_155_in_extensionAdditionGroup2196);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_155.add(string_literal205);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:322:8: ( INT ':' )?
				int alt61 = 2;
				int LA61_0 = input.LA(1);

				if ((LA61_0 == INT)) {
					alt61 = 1;
				}
				switch (alt61) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:322:9: INT ':'
					{
						INT206 = (Token) match(input, INT, FOLLOW_INT_in_extensionAdditionGroup2199);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT206);


						char_literal207 = (Token) match(input, 87, FOLLOW_87_in_extensionAdditionGroup2201);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_87.add(char_literal207);


					}
					break;

				}


				pushFollow(FOLLOW_componentTypeList_in_extensionAdditionGroup2205);
				componentTypeList208 = componentTypeList();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_componentTypeList.add(componentTypeList208.getTree());

				string_literal209 = (Token) match(input, 157, FOLLOW_157_in_extensionAdditionGroup2207);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_157.add(string_literal209);


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
					// 322:42: -> ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:322:45: ^( EXTENSION_ADDITION_GROUP ( INT )? componentTypeList )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(EXTENSION_ADDITION_GROUP, "EXTENSION_ADDITION_GROUP")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:322:72: ( INT )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:324:1: extensionEndMarker : ',' '...' -> ^( EXTENSION_END_MARKER ) ;
	public final ASN1Parser.extensionEndMarker_return extensionEndMarker() throws RecognitionException {
		ASN1Parser.extensionEndMarker_return retval = new ASN1Parser.extensionEndMarker_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal210 = null;
		Token string_literal211 = null;

		CommonTree char_literal210_tree = null;
		CommonTree string_literal211_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleTokenStream stream_86 = new RewriteRuleTokenStream(adaptor, "token 86");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:324:21: ( ',' '...' -> ^( EXTENSION_END_MARKER ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:325:3: ',' '...'
			{
				char_literal210 = (Token) match(input, 83, FOLLOW_83_in_extensionEndMarker2230);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_83.add(char_literal210);


				string_literal211 = (Token) match(input, 86, FOLLOW_86_in_extensionEndMarker2232);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_86.add(string_literal211);


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
					// 325:13: -> ^( EXTENSION_END_MARKER )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:325:16: ^( EXTENSION_END_MARKER )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:327:1: extensionAndException : '...' ( exceptionSpec )? -> ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? ) ;
	public final ASN1Parser.extensionAndException_return extensionAndException() throws RecognitionException {
		ASN1Parser.extensionAndException_return retval = new ASN1Parser.extensionAndException_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal212 = null;
		ASN1Parser.exceptionSpec_return exceptionSpec213 = null;


		CommonTree string_literal212_tree = null;
		RewriteRuleTokenStream stream_86 = new RewriteRuleTokenStream(adaptor, "token 86");
		RewriteRuleSubtreeStream stream_exceptionSpec = new RewriteRuleSubtreeStream(adaptor, "rule exceptionSpec");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:327:24: ( '...' ( exceptionSpec )? -> ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:328:3: '...' ( exceptionSpec )?
			{
				string_literal212 = (Token) match(input, 86, FOLLOW_86_in_extensionAndException2251);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_86.add(string_literal212);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:328:9: ( exceptionSpec )?
				int alt62 = 2;
				int LA62_0 = input.LA(1);

				if ((LA62_0 == 80)) {
					alt62 = 1;
				}
				switch (alt62) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:328:9: exceptionSpec
					{
						pushFollow(FOLLOW_exceptionSpec_in_extensionAndException2253);
						exceptionSpec213 = exceptionSpec();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exceptionSpec.add(exceptionSpec213.getTree());

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
					// 328:24: -> ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:328:27: ^( EXTENSION_AND_EXCEPTION ( exceptionSpec )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(EXTENSION_AND_EXCEPTION, "EXTENSION_AND_EXCEPTION")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:328:53: ( exceptionSpec )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:330:1: exceptionSpec : ( ( '!' definedValue ) -> ^( EXCEPTION_SPEC definedValue ) | ( '!' type ':' value ) -> ^( EXCEPTION_SPEC type value ) | ( '!' INT ) -> ^( EXCEPTION_SPEC INT ) );
	public final ASN1Parser.exceptionSpec_return exceptionSpec() throws RecognitionException {
		ASN1Parser.exceptionSpec_return retval = new ASN1Parser.exceptionSpec_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal214 = null;
		Token char_literal216 = null;
		Token char_literal218 = null;
		Token char_literal220 = null;
		Token INT221 = null;
		ASN1Parser.definedValue_return definedValue215 = null;

		ASN1Parser.type_return type217 = null;

		ASN1Parser.value_return value219 = null;


		CommonTree char_literal214_tree = null;
		CommonTree char_literal216_tree = null;
		CommonTree char_literal218_tree = null;
		CommonTree char_literal220_tree = null;
		CommonTree INT221_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_80 = new RewriteRuleTokenStream(adaptor, "token 80");
		RewriteRuleTokenStream stream_87 = new RewriteRuleTokenStream(adaptor, "token 87");
		RewriteRuleSubtreeStream stream_definedValue = new RewriteRuleSubtreeStream(adaptor, "rule definedValue");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:330:17: ( ( '!' definedValue ) -> ^( EXCEPTION_SPEC definedValue ) | ( '!' type ':' value ) -> ^( EXCEPTION_SPEC type value ) | ( '!' INT ) -> ^( EXCEPTION_SPEC INT ) )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:331:3: ( '!' definedValue )
				{
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:331:3: ( '!' definedValue )
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:331:4: '!' definedValue
					{
						char_literal214 = (Token) match(input, 80, FOLLOW_80_in_exceptionSpec2276);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_80.add(char_literal214);


						pushFollow(FOLLOW_definedValue_in_exceptionSpec2278);
						definedValue215 = definedValue();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_definedValue.add(definedValue215.getTree());

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
						// 331:23: -> ^( EXCEPTION_SPEC definedValue )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:331:26: ^( EXCEPTION_SPEC definedValue )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:332:5: ( '!' type ':' value )
				{
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:332:5: ( '!' type ':' value )
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:332:7: '!' type ':' value
					{
						char_literal216 = (Token) match(input, 80, FOLLOW_80_in_exceptionSpec2296);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_80.add(char_literal216);


						pushFollow(FOLLOW_type_in_exceptionSpec2298);
						type217 = type();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_type.add(type217.getTree());

						char_literal218 = (Token) match(input, 87, FOLLOW_87_in_exceptionSpec2300);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_87.add(char_literal218);


						pushFollow(FOLLOW_value_in_exceptionSpec2302);
						value219 = value();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_value.add(value219.getTree());

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
						// 332:28: -> ^( EXCEPTION_SPEC type value )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:332:31: ^( EXCEPTION_SPEC type value )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:333:5: ( '!' INT )
				{
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:333:5: ( '!' INT )
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:333:7: '!' INT
					{
						char_literal220 = (Token) match(input, 80, FOLLOW_80_in_exceptionSpec2322);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_80.add(char_literal220);


						INT221 = (Token) match(input, INT, FOLLOW_INT_in_exceptionSpec2324);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_INT.add(INT221);


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
						// 333:17: -> ^( EXCEPTION_SPEC INT )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:333:20: ^( EXCEPTION_SPEC INT )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:336:1: sequenceOfType : 'SEQUENCE' ( constraint )? 'OF' sOfComponentType -> ^( SEQUENCEOF sOfComponentType ( constraint )? ) ;
	public final ASN1Parser.sequenceOfType_return sequenceOfType() throws RecognitionException {
		ASN1Parser.sequenceOfType_return retval = new ASN1Parser.sequenceOfType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal222 = null;
		Token string_literal224 = null;
		ASN1Parser.constraint_return constraint223 = null;

		ASN1Parser.sOfComponentType_return sOfComponentType225 = null;


		CommonTree string_literal222_tree = null;
		CommonTree string_literal224_tree = null;
		RewriteRuleTokenStream stream_139 = new RewriteRuleTokenStream(adaptor, "token 139");
		RewriteRuleTokenStream stream_130 = new RewriteRuleTokenStream(adaptor, "token 130");
		RewriteRuleSubtreeStream stream_sOfComponentType = new RewriteRuleSubtreeStream(adaptor, "rule sOfComponentType");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:336:18: ( 'SEQUENCE' ( constraint )? 'OF' sOfComponentType -> ^( SEQUENCEOF sOfComponentType ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:337:2: 'SEQUENCE' ( constraint )? 'OF' sOfComponentType
			{
				string_literal222 = (Token) match(input, 139, FOLLOW_139_in_sequenceOfType2348);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_139.add(string_literal222);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:337:13: ( constraint )?
				int alt64 = 2;
				int LA64_0 = input.LA(1);

				if ((LA64_0 == 81)) {
					alt64 = 1;
				}
				switch (alt64) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:337:13: constraint
					{
						pushFollow(FOLLOW_constraint_in_sequenceOfType2350);
						constraint223 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint223.getTree());

					}
					break;

				}


				string_literal224 = (Token) match(input, 130, FOLLOW_130_in_sequenceOfType2353);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_130.add(string_literal224);


				pushFollow(FOLLOW_sOfComponentType_in_sequenceOfType2355);
				sOfComponentType225 = sOfComponentType();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_sOfComponentType.add(sOfComponentType225.getTree());

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
					// 337:47: -> ^( SEQUENCEOF sOfComponentType ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:337:50: ^( SEQUENCEOF sOfComponentType ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(SEQUENCEOF, "SEQUENCEOF")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_sOfComponentType.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:337:80: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:339:1: namedType : ID type -> ^( NAMED_TYPE ID type ) ;
	public final ASN1Parser.namedType_return namedType() throws RecognitionException {
		ASN1Parser.namedType_return retval = new ASN1Parser.namedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID226 = null;
		ASN1Parser.type_return type227 = null;


		CommonTree ID226_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:340:2: ( ID type -> ^( NAMED_TYPE ID type ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:341:2: ID type
			{
				ID226 = (Token) match(input, ID, FOLLOW_ID_in_namedType2376);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID226);


				pushFollow(FOLLOW_type_in_namedType2378);
				type227 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type227.getTree());

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
					// 341:10: -> ^( NAMED_TYPE ID type )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:341:13: ^( NAMED_TYPE ID type )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:343:1: taggedType : '[' ( tagClass )? classNumber ']' ( taggingMethod )? type -> ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type ) ;
	public final ASN1Parser.taggedType_return taggedType() throws RecognitionException {
		ASN1Parser.taggedType_return retval = new ASN1Parser.taggedType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal228 = null;
		Token char_literal231 = null;
		ASN1Parser.tagClass_return tagClass229 = null;

		ASN1Parser.classNumber_return classNumber230 = null;

		ASN1Parser.taggingMethod_return taggingMethod232 = null;

		ASN1Parser.type_return type233 = null;


		CommonTree char_literal228_tree = null;
		CommonTree char_literal231_tree = null;
		RewriteRuleTokenStream stream_156 = new RewriteRuleTokenStream(adaptor, "token 156");
		RewriteRuleTokenStream stream_154 = new RewriteRuleTokenStream(adaptor, "token 154");
		RewriteRuleSubtreeStream stream_taggingMethod = new RewriteRuleSubtreeStream(adaptor, "rule taggingMethod");
		RewriteRuleSubtreeStream stream_classNumber = new RewriteRuleSubtreeStream(adaptor, "rule classNumber");
		RewriteRuleSubtreeStream stream_tagClass = new RewriteRuleSubtreeStream(adaptor, "rule tagClass");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:343:14: ( '[' ( tagClass )? classNumber ']' ( taggingMethod )? type -> ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:3: '[' ( tagClass )? classNumber ']' ( taggingMethod )? type
			{
				char_literal228 = (Token) match(input, 154, FOLLOW_154_in_taggedType2400);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_154.add(char_literal228);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:7: ( tagClass )?
				int alt65 = 2;
				int LA65_0 = input.LA(1);

				if ((LA65_0 == 93 || LA65_0 == 136 || LA65_0 == 148)) {
					alt65 = 1;
				}
				switch (alt65) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:7: tagClass
					{
						pushFollow(FOLLOW_tagClass_in_taggedType2402);
						tagClass229 = tagClass();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_tagClass.add(tagClass229.getTree());

					}
					break;

				}


				pushFollow(FOLLOW_classNumber_in_taggedType2405);
				classNumber230 = classNumber();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_classNumber.add(classNumber230.getTree());

				char_literal231 = (Token) match(input, 156, FOLLOW_156_in_taggedType2407);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_156.add(char_literal231);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:33: ( taggingMethod )?
				int alt66 = 2;
				int LA66_0 = input.LA(1);

				if ((LA66_0 == 94 || LA66_0 == 108 || LA66_0 == 117)) {
					alt66 = 1;
				}
				switch (alt66) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:33: taggingMethod
					{
						pushFollow(FOLLOW_taggingMethod_in_taggedType2409);
						taggingMethod232 = taggingMethod();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_taggingMethod.add(taggingMethod232.getTree());

					}
					break;

				}


				pushFollow(FOLLOW_type_in_taggedType2412);
				type233 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type233.getTree());

				// AST REWRITE
				// elements: taggingMethod, classNumber, type, tagClass
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
					// 344:53: -> ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:56: ^( TAGGED_TYPE classNumber ( tagClass )? ( taggingMethod )? type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(TAGGED_TYPE, "TAGGED_TYPE")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_classNumber.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:82: ( tagClass )?
							if (stream_tagClass.hasNext()) {
								adaptor.addChild(root_1, stream_tagClass.nextTree());

							}
							stream_tagClass.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:344:92: ( taggingMethod )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:346:1: classNumber : ( INT | definedValue );
	public final ASN1Parser.classNumber_return classNumber() throws RecognitionException {
		ASN1Parser.classNumber_return retval = new ASN1Parser.classNumber_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token INT234 = null;
		ASN1Parser.definedValue_return definedValue235 = null;


		CommonTree INT234_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:346:15: ( INT | definedValue )
			int alt67 = 2;
			int LA67_0 = input.LA(1);

			if ((LA67_0 == INT)) {
				alt67 = 1;
			} else if ((LA67_0 == ID)) {
				alt67 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 67, 0, input);

				throw nvae;

			}
			switch (alt67) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:347:2: INT
				{
					root_0 = (CommonTree) adaptor.nil();


					INT234 = (Token) match(input, INT, FOLLOW_INT_in_classNumber2439);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						INT234_tree =
						(CommonTree) adaptor.create(INT234)
						;
						adaptor.addChild(root_0, INT234_tree);
					}

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:347:8: definedValue
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_definedValue_in_classNumber2443);
					definedValue235 = definedValue();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, definedValue235.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:349:1: tagClass : ( 'UNIVERSAL' | 'APPLICATION' | 'PRIVATE' );
	public final ASN1Parser.tagClass_return tagClass() throws RecognitionException {
		ASN1Parser.tagClass_return retval = new ASN1Parser.tagClass_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set236 = null;

		CommonTree set236_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:349:10: ( 'UNIVERSAL' | 'APPLICATION' | 'PRIVATE' )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set236 = (Token) input.LT(1);

				if (input.LA(1) == 93 || input.LA(1) == 136 || input.LA(1) == 148) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set236)
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:352:1: realType : 'REAL' ( constraint )? -> ^( REAL ( constraint )? ) ;
	public final ASN1Parser.realType_return realType() throws RecognitionException {
		ASN1Parser.realType_return retval = new ASN1Parser.realType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal237 = null;
		ASN1Parser.constraint_return constraint238 = null;


		CommonTree string_literal237_tree = null;
		RewriteRuleTokenStream stream_138 = new RewriteRuleTokenStream(adaptor, "token 138");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:352:12: ( 'REAL' ( constraint )? -> ^( REAL ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:353:3: 'REAL' ( constraint )?
			{
				string_literal237 = (Token) match(input, 138, FOLLOW_138_in_realType2472);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_138.add(string_literal237);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:353:10: ( constraint )?
				int alt68 = 2;
				int LA68_0 = input.LA(1);

				if ((LA68_0 == 81)) {
					alt68 = 1;
				}
				switch (alt68) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:353:10: constraint
					{
						pushFollow(FOLLOW_constraint_in_realType2474);
						constraint238 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint238.getTree());

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
					// 353:22: -> ^( REAL ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:353:25: ^( REAL ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(REAL, "REAL")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:353:32: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:355:1: integerType : 'INTEGER' ( constraint )? ( '{' namedNumberList '}' )? -> ^( INTEGER ( namedNumberList )? ( constraint )? ) ;
	public final ASN1Parser.integerType_return integerType() throws RecognitionException {
		ASN1Parser.integerType_return retval = new ASN1Parser.integerType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal239 = null;
		Token char_literal241 = null;
		Token char_literal243 = null;
		ASN1Parser.constraint_return constraint240 = null;

		ASN1Parser.namedNumberList_return namedNumberList242 = null;


		CommonTree string_literal239_tree = null;
		CommonTree char_literal241_tree = null;
		CommonTree char_literal243_tree = null;
		RewriteRuleTokenStream stream_161 = new RewriteRuleTokenStream(adaptor, "token 161");
		RewriteRuleTokenStream stream_121 = new RewriteRuleTokenStream(adaptor, "token 121");
		RewriteRuleTokenStream stream_159 = new RewriteRuleTokenStream(adaptor, "token 159");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_namedNumberList = new RewriteRuleSubtreeStream(adaptor, "rule namedNumberList");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:355:15: ( 'INTEGER' ( constraint )? ( '{' namedNumberList '}' )? -> ^( INTEGER ( namedNumberList )? ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:3: 'INTEGER' ( constraint )? ( '{' namedNumberList '}' )?
			{
				string_literal239 = (Token) match(input, 121, FOLLOW_121_in_integerType2496);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_121.add(string_literal239);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:13: ( constraint )?
				int alt69 = 2;
				int LA69_0 = input.LA(1);

				if ((LA69_0 == 81)) {
					alt69 = 1;
				}
				switch (alt69) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:13: constraint
					{
						pushFollow(FOLLOW_constraint_in_integerType2498);
						constraint240 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint240.getTree());

					}
					break;

				}


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:25: ( '{' namedNumberList '}' )?
				int alt70 = 2;
				int LA70_0 = input.LA(1);

				if ((LA70_0 == 159)) {
					alt70 = 1;
				}
				switch (alt70) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:26: '{' namedNumberList '}'
					{
						char_literal241 = (Token) match(input, 159, FOLLOW_159_in_integerType2502);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_159.add(char_literal241);


						pushFollow(FOLLOW_namedNumberList_in_integerType2504);
						namedNumberList242 = namedNumberList();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_namedNumberList.add(namedNumberList242.getTree());

						char_literal243 = (Token) match(input, 161, FOLLOW_161_in_integerType2506);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_161.add(char_literal243);


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
					// 356:52: -> ^( INTEGER ( namedNumberList )? ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:55: ^( INTEGER ( namedNumberList )? ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(INTEGER, "INTEGER")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:65: ( namedNumberList )?
							if (stream_namedNumberList.hasNext()) {
								adaptor.addChild(root_1, stream_namedNumberList.nextTree());

							}
							stream_namedNumberList.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:356:82: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:358:1: namedNumberList : namedNumber ( ',' namedNumber )* -> ^( VEC ( namedNumber )+ ) ;
	public final ASN1Parser.namedNumberList_return namedNumberList() throws RecognitionException {
		ASN1Parser.namedNumberList_return retval = new ASN1Parser.namedNumberList_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal245 = null;
		ASN1Parser.namedNumber_return namedNumber244 = null;

		ASN1Parser.namedNumber_return namedNumber246 = null;


		CommonTree char_literal245_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_namedNumber = new RewriteRuleSubtreeStream(adaptor, "rule namedNumber");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:358:18: ( namedNumber ( ',' namedNumber )* -> ^( VEC ( namedNumber )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:359:3: namedNumber ( ',' namedNumber )*
			{
				pushFollow(FOLLOW_namedNumber_in_namedNumberList2531);
				namedNumber244 = namedNumber();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_namedNumber.add(namedNumber244.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:359:15: ( ',' namedNumber )*
				loop71:
				do {
					int alt71 = 2;
					int LA71_0 = input.LA(1);

					if ((LA71_0 == 83)) {
						alt71 = 1;
					}


					switch (alt71) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:359:16: ',' namedNumber
						{
							char_literal245 = (Token) match(input, 83, FOLLOW_83_in_namedNumberList2534);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal245);


							pushFollow(FOLLOW_namedNumber_in_namedNumberList2536);
							namedNumber246 = namedNumber();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_namedNumber.add(namedNumber246.getTree());

						}
						break;

						default:
							break loop71;
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
					// 359:34: -> ^( VEC ( namedNumber )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:359:37: ^( VEC ( namedNumber )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:361:1: namedNumber : ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) ;
	public final ASN1Parser.namedNumber_return namedNumber() throws RecognitionException {
		ASN1Parser.namedNumber_return retval = new ASN1Parser.namedNumber_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID247 = null;
		Token char_literal248 = null;
		Token INT249 = null;
		Token char_literal250 = null;

		CommonTree ID247_tree = null;
		CommonTree char_literal248_tree = null;
		CommonTree INT249_tree = null;
		CommonTree char_literal250_tree = null;
		RewriteRuleTokenStream stream_INT = new RewriteRuleTokenStream(adaptor, "token INT");
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:361:14: ( ID '(' INT ')' -> ^( NAME_NUMBER_FORM ID INT ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:362:3: ID '(' INT ')'
			{
				ID247 = (Token) match(input, ID, FOLLOW_ID_in_namedNumber2558);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID247);


				char_literal248 = (Token) match(input, 81, FOLLOW_81_in_namedNumber2560);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_81.add(char_literal248);


				INT249 = (Token) match(input, INT, FOLLOW_INT_in_namedNumber2562);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_INT.add(INT249);


				char_literal250 = (Token) match(input, 82, FOLLOW_82_in_namedNumber2564);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_82.add(char_literal250);


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
					// 362:18: -> ^( NAME_NUMBER_FORM ID INT )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:362:21: ^( NAME_NUMBER_FORM ID INT )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:364:1: booleanType : 'BOOLEAN' ( constraint )? -> ^( BOOLEAN ( constraint )? ) ;
	public final ASN1Parser.booleanType_return booleanType() throws RecognitionException {
		ASN1Parser.booleanType_return retval = new ASN1Parser.booleanType_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal251 = null;
		ASN1Parser.constraint_return constraint252 = null;


		CommonTree string_literal251_tree = null;
		RewriteRuleTokenStream stream_98 = new RewriteRuleTokenStream(adaptor, "token 98");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:364:15: ( 'BOOLEAN' ( constraint )? -> ^( BOOLEAN ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:365:3: 'BOOLEAN' ( constraint )?
			{
				string_literal251 = (Token) match(input, 98, FOLLOW_98_in_booleanType2586);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_98.add(string_literal251);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:365:13: ( constraint )?
				int alt72 = 2;
				int LA72_0 = input.LA(1);

				if ((LA72_0 == 81)) {
					alt72 = 1;
				}
				switch (alt72) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:365:13: constraint
					{
						pushFollow(FOLLOW_constraint_in_booleanType2588);
						constraint252 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint252.getTree());

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
					// 365:25: -> ^( BOOLEAN ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:365:28: ^( BOOLEAN ( constraint )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(BOOLEAN, "BOOLEAN")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:365:38: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:368:1: constraint : '(' constraintSpec ( exceptionSpec )? ')' -> ^( CONSTRAINT constraintSpec ( exceptionSpec )? ) ;
	public final ASN1Parser.constraint_return constraint() throws RecognitionException {
		ASN1Parser.constraint_return retval = new ASN1Parser.constraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal253 = null;
		Token char_literal256 = null;
		ASN1Parser.constraintSpec_return constraintSpec254 = null;

		ASN1Parser.exceptionSpec_return exceptionSpec255 = null;


		CommonTree char_literal253_tree = null;
		CommonTree char_literal256_tree = null;
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");
		RewriteRuleSubtreeStream stream_constraintSpec = new RewriteRuleSubtreeStream(adaptor, "rule constraintSpec");
		RewriteRuleSubtreeStream stream_exceptionSpec = new RewriteRuleSubtreeStream(adaptor, "rule exceptionSpec");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:368:14: ( '(' constraintSpec ( exceptionSpec )? ')' -> ^( CONSTRAINT constraintSpec ( exceptionSpec )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:369:3: '(' constraintSpec ( exceptionSpec )? ')'
			{
				char_literal253 = (Token) match(input, 81, FOLLOW_81_in_constraint2612);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_81.add(char_literal253);


				pushFollow(FOLLOW_constraintSpec_in_constraint2614);
				constraintSpec254 = constraintSpec();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_constraintSpec.add(constraintSpec254.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:369:22: ( exceptionSpec )?
				int alt73 = 2;
				int LA73_0 = input.LA(1);

				if ((LA73_0 == 80)) {
					alt73 = 1;
				}
				switch (alt73) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:369:22: exceptionSpec
					{
						pushFollow(FOLLOW_exceptionSpec_in_constraint2616);
						exceptionSpec255 = exceptionSpec();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exceptionSpec.add(exceptionSpec255.getTree());

					}
					break;

				}


				char_literal256 = (Token) match(input, 82, FOLLOW_82_in_constraint2618);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_82.add(char_literal256);


				// AST REWRITE
				// elements: exceptionSpec, constraintSpec
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
					// 370:3: -> ^( CONSTRAINT constraintSpec ( exceptionSpec )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:370:6: ^( CONSTRAINT constraintSpec ( exceptionSpec )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT, "CONSTRAINT")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_constraintSpec.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:370:34: ( exceptionSpec )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:373:1: constraintSpec : elementSetSpecs ;
	public final ASN1Parser.constraintSpec_return constraintSpec() throws RecognitionException {
		ASN1Parser.constraintSpec_return retval = new ASN1Parser.constraintSpec_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.elementSetSpecs_return elementSetSpecs257 = null;


		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:373:18: ( elementSetSpecs )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:374:3: elementSetSpecs
			{
				root_0 = (CommonTree) adaptor.nil();


				pushFollow(FOLLOW_elementSetSpecs_in_constraintSpec2645);
				elementSetSpecs257 = elementSetSpecs();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) adaptor.addChild(root_0, elementSetSpecs257.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:376:1: elementSetSpecs : elementSetSpec ( extensionEndMarker ( ',' elementSetSpec )? )? -> ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? ) ;
	public final ASN1Parser.elementSetSpecs_return elementSetSpecs() throws RecognitionException {
		ASN1Parser.elementSetSpecs_return retval = new ASN1Parser.elementSetSpecs_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal260 = null;
		ASN1Parser.elementSetSpec_return elementSetSpec258 = null;

		ASN1Parser.extensionEndMarker_return extensionEndMarker259 = null;

		ASN1Parser.elementSetSpec_return elementSetSpec261 = null;


		CommonTree char_literal260_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_extensionEndMarker = new RewriteRuleSubtreeStream(adaptor, "rule extensionEndMarker");
		RewriteRuleSubtreeStream stream_elementSetSpec = new RewriteRuleSubtreeStream(adaptor, "rule elementSetSpec");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:376:19: ( elementSetSpec ( extensionEndMarker ( ',' elementSetSpec )? )? -> ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:377:3: elementSetSpec ( extensionEndMarker ( ',' elementSetSpec )? )?
			{
				pushFollow(FOLLOW_elementSetSpec_in_elementSetSpecs2657);
				elementSetSpec258 = elementSetSpec();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_elementSetSpec.add(elementSetSpec258.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:377:18: ( extensionEndMarker ( ',' elementSetSpec )? )?
				int alt75 = 2;
				int LA75_0 = input.LA(1);

				if ((LA75_0 == 83)) {
					alt75 = 1;
				}
				switch (alt75) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:377:19: extensionEndMarker ( ',' elementSetSpec )?
					{
						pushFollow(FOLLOW_extensionEndMarker_in_elementSetSpecs2660);
						extensionEndMarker259 = extensionEndMarker();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_extensionEndMarker.add(extensionEndMarker259.getTree());

						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:377:38: ( ',' elementSetSpec )?
						int alt74 = 2;
						int LA74_0 = input.LA(1);

						if ((LA74_0 == 83)) {
							alt74 = 1;
						}
						switch (alt74) {
							case 1:
								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:377:40: ',' elementSetSpec
							{
								char_literal260 = (Token) match(input, 83, FOLLOW_83_in_elementSetSpecs2664);
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_83.add(char_literal260);


								pushFollow(FOLLOW_elementSetSpec_in_elementSetSpecs2666);
								elementSetSpec261 = elementSetSpec();

								state._fsp--;
								if (state.failed) return retval;
								if (state.backtracking == 0) stream_elementSetSpec.add(elementSetSpec261.getTree());

							}
							break;

						}


					}
					break;

				}


				// AST REWRITE
				// elements: elementSetSpec, extensionEndMarker, elementSetSpec
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
					// 378:3: -> ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:378:6: ^( elementSetSpec ( extensionEndMarker ( elementSetSpec )? )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(stream_elementSetSpec.nextNode(), root_1);

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:378:23: ( extensionEndMarker ( elementSetSpec )? )?
							if (stream_elementSetSpec.hasNext() || stream_extensionEndMarker.hasNext()) {
								adaptor.addChild(root_1, stream_extensionEndMarker.nextTree());

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:378:43: ( elementSetSpec )?
								if (stream_elementSetSpec.hasNext()) {
									adaptor.addChild(root_1, stream_elementSetSpec.nextTree());

								}
								stream_elementSetSpec.reset();

							}
							stream_elementSetSpec.reset();
							stream_extensionEndMarker.reset();

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:380:1: elementSetSpec : ( unions -> ^( UNION unions ) | 'ALL' exclusions -> ^( UNION 'ALL' exclusions ) );
	public final ASN1Parser.elementSetSpec_return elementSetSpec() throws RecognitionException {
		ASN1Parser.elementSetSpec_return retval = new ASN1Parser.elementSetSpec_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal263 = null;
		ASN1Parser.unions_return unions262 = null;

		ASN1Parser.exclusions_return exclusions264 = null;


		CommonTree string_literal263_tree = null;
		RewriteRuleTokenStream stream_92 = new RewriteRuleTokenStream(adaptor, "token 92");
		RewriteRuleSubtreeStream stream_unions = new RewriteRuleSubtreeStream(adaptor, "rule unions");
		RewriteRuleSubtreeStream stream_exclusions = new RewriteRuleSubtreeStream(adaptor, "rule exclusions");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:380:18: ( unions -> ^( UNION unions ) | 'ALL' exclusions -> ^( UNION 'ALL' exclusions ) )
			int alt76 = 2;
			int LA76_0 = input.LA(1);

			if ((LA76_0 == ID || LA76_0 == INT || LA76_0 == REAL_NUMBER || (LA76_0 >= 80 && LA76_0 <= 83) || (LA76_0 >= 96 && LA76_0 <= 100) || (
			                                                                                                                                    LA76_0
			                                                                                                                                    >= 106
			                                                                                                                                    &&
			                                                                                                                                    LA76_0
			                                                                                                                                    <= 107)
			     || LA76_0 == 111 || (LA76_0 >= 113 && LA76_0 <= 115) || (LA76_0 >= 120 && LA76_0 <= 123) || (LA76_0 >= 125 && LA76_0 <= 129)
			     || LA76_0 == 131 || (LA76_0 >= 133 && LA76_0 <= 134) || (LA76_0 >= 137 && LA76_0 <= 141) || LA76_0 == 143 || (LA76_0 >= 145
			                                                                                                                   && LA76_0 <= 147) || (
			                                                                                                                                        LA76_0
			                                                                                                                                        >= 149
			                                                                                                                                        &&
			                                                                                                                                        LA76_0
			                                                                                                                                        <= 154)
			     || LA76_0 == 158 || LA76_0 == 160)) {
				alt76 = 1;
			} else if ((LA76_0 == 92)) {
				alt76 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 76, 0, input);

				throw nvae;

			}
			switch (alt76) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:381:3: unions
				{
					pushFollow(FOLLOW_unions_in_elementSetSpec2698);
					unions262 = unions();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_unions.add(unions262.getTree());

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
						// 381:10: -> ^( UNION unions )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:381:13: ^( UNION unions )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:382:5: 'ALL' exclusions
				{
					string_literal263 = (Token) match(input, 92, FOLLOW_92_in_elementSetSpec2712);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_92.add(string_literal263);


					pushFollow(FOLLOW_exclusions_in_elementSetSpec2714);
					exclusions264 = exclusions();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_exclusions.add(exclusions264.getTree());

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
						// 382:22: -> ^( UNION 'ALL' exclusions )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:382:25: ^( UNION 'ALL' exclusions )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:384:1: exclusions : 'EXCEPT' elements -> ^( elements ) ;
	public final ASN1Parser.exclusions_return exclusions() throws RecognitionException {
		ASN1Parser.exclusions_return retval = new ASN1Parser.exclusions_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal265 = null;
		ASN1Parser.elements_return elements266 = null;


		CommonTree string_literal265_tree = null;
		RewriteRuleTokenStream stream_107 = new RewriteRuleTokenStream(adaptor, "token 107");
		RewriteRuleSubtreeStream stream_elements = new RewriteRuleSubtreeStream(adaptor, "rule elements");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:384:14: ( 'EXCEPT' elements -> ^( elements ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:385:3: 'EXCEPT' elements
			{
				string_literal265 = (Token) match(input, 107, FOLLOW_107_in_exclusions2736);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_107.add(string_literal265);


				pushFollow(FOLLOW_elements_in_exclusions2738);
				elements266 = elements();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_elements.add(elements266.getTree());

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
					// 386:3: -> ^( elements )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:386:6: ^( elements )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:388:1: unions : intersections ( unionMark intersections )* -> ^( VEC ( intersections )+ ) ;
	public final ASN1Parser.unions_return unions() throws RecognitionException {
		ASN1Parser.unions_return retval = new ASN1Parser.unions_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.intersections_return intersections267 = null;

		ASN1Parser.unionMark_return unionMark268 = null;

		ASN1Parser.intersections_return intersections269 = null;


		RewriteRuleSubtreeStream stream_unionMark = new RewriteRuleSubtreeStream(adaptor, "rule unionMark");
		RewriteRuleSubtreeStream stream_intersections = new RewriteRuleSubtreeStream(adaptor, "rule intersections");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:388:11: ( intersections ( unionMark intersections )* -> ^( VEC ( intersections )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:389:3: intersections ( unionMark intersections )*
			{
				pushFollow(FOLLOW_intersections_in_unions2760);
				intersections267 = intersections();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_intersections.add(intersections267.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:389:17: ( unionMark intersections )*
				loop77:
				do {
					int alt77 = 2;
					int LA77_0 = input.LA(1);

					if ((LA77_0 == 147 || LA77_0 == 160)) {
						alt77 = 1;
					}


					switch (alt77) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:389:18: unionMark intersections
						{
							pushFollow(FOLLOW_unionMark_in_unions2763);
							unionMark268 = unionMark();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_unionMark.add(unionMark268.getTree());

							pushFollow(FOLLOW_intersections_in_unions2765);
							intersections269 = intersections();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_intersections.add(intersections269.getTree());

						}
						break;

						default:
							break loop77;
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
					// 390:3: -> ^( VEC ( intersections )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:390:6: ^( VEC ( intersections )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:392:1: intersections : intersectionElement ( intersectionMark intersectionElement )* -> ^( VEC ( intersectionElement )+ ) ;
	public final ASN1Parser.intersections_return intersections() throws RecognitionException {
		ASN1Parser.intersections_return retval = new ASN1Parser.intersections_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.intersectionElement_return intersectionElement270 = null;

		ASN1Parser.intersectionMark_return intersectionMark271 = null;

		ASN1Parser.intersectionElement_return intersectionElement272 = null;


		RewriteRuleSubtreeStream stream_intersectionMark = new RewriteRuleSubtreeStream(adaptor, "rule intersectionMark");
		RewriteRuleSubtreeStream stream_intersectionElement = new RewriteRuleSubtreeStream(adaptor, "rule intersectionElement");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:392:17: ( intersectionElement ( intersectionMark intersectionElement )* -> ^( VEC ( intersectionElement )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:393:3: intersectionElement ( intersectionMark intersectionElement )*
			{
				pushFollow(FOLLOW_intersectionElement_in_intersections2790);
				intersectionElement270 = intersectionElement();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_intersectionElement.add(intersectionElement270.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:393:23: ( intersectionMark intersectionElement )*
				loop78:
				do {
					int alt78 = 2;
					int LA78_0 = input.LA(1);

					if ((LA78_0 == 122 || LA78_0 == 158)) {
						alt78 = 1;
					}


					switch (alt78) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:393:24: intersectionMark intersectionElement
						{
							pushFollow(FOLLOW_intersectionMark_in_intersections2793);
							intersectionMark271 = intersectionMark();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_intersectionMark.add(intersectionMark271.getTree());

							pushFollow(FOLLOW_intersectionElement_in_intersections2795);
							intersectionElement272 = intersectionElement();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_intersectionElement.add(intersectionElement272.getTree());

						}
						break;

						default:
							break loop78;
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
					// 394:3: -> ^( VEC ( intersectionElement )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:394:6: ^( VEC ( intersectionElement )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:396:1: intersectionElement : elements ( exclusions )? -> ^( INTERSECTION_ELEMENT elements ( exclusions )? ) ;
	public final ASN1Parser.intersectionElement_return intersectionElement() throws RecognitionException {
		ASN1Parser.intersectionElement_return retval = new ASN1Parser.intersectionElement_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.elements_return elements273 = null;

		ASN1Parser.exclusions_return exclusions274 = null;


		RewriteRuleSubtreeStream stream_exclusions = new RewriteRuleSubtreeStream(adaptor, "rule exclusions");
		RewriteRuleSubtreeStream stream_elements = new RewriteRuleSubtreeStream(adaptor, "rule elements");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:396:22: ( elements ( exclusions )? -> ^( INTERSECTION_ELEMENT elements ( exclusions )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:397:3: elements ( exclusions )?
			{
				pushFollow(FOLLOW_elements_in_intersectionElement2819);
				elements273 = elements();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_elements.add(elements273.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:397:12: ( exclusions )?
				int alt79 = 2;
				int LA79_0 = input.LA(1);

				if ((LA79_0 == 107)) {
					alt79 = 1;
				}
				switch (alt79) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:397:12: exclusions
					{
						pushFollow(FOLLOW_exclusions_in_intersectionElement2821);
						exclusions274 = exclusions();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_exclusions.add(exclusions274.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: exclusions, elements
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
					// 398:3: -> ^( INTERSECTION_ELEMENT elements ( exclusions )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:398:6: ^( INTERSECTION_ELEMENT elements ( exclusions )? )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(INTERSECTION_ELEMENT, "INTERSECTION_ELEMENT")
							                                        , root_1
							                                        );

							adaptor.addChild(root_1, stream_elements.nextTree());

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:398:38: ( exclusions )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:400:1: elements : ( ( '(' )=> '(' elementSetSpec ')' -> ^( elementSetSpec ) | subtypeElements );
	public final ASN1Parser.elements_return elements() throws RecognitionException {
		ASN1Parser.elements_return retval = new ASN1Parser.elements_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal275 = null;
		Token char_literal277 = null;
		ASN1Parser.elementSetSpec_return elementSetSpec276 = null;

		ASN1Parser.subtypeElements_return subtypeElements278 = null;


		CommonTree char_literal275_tree = null;
		CommonTree char_literal277_tree = null;
		RewriteRuleTokenStream stream_82 = new RewriteRuleTokenStream(adaptor, "token 82");
		RewriteRuleTokenStream stream_81 = new RewriteRuleTokenStream(adaptor, "token 81");
		RewriteRuleSubtreeStream stream_elementSetSpec = new RewriteRuleSubtreeStream(adaptor, "rule elementSetSpec");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:400:12: ( ( '(' )=> '(' elementSetSpec ')' -> ^( elementSetSpec ) | subtypeElements )
			int alt80 = 2;
			int LA80_0 = input.LA(1);

			if ((LA80_0 == 81)) {
				int LA80_1 = input.LA(2);

				if ((synpred6_ASN1())) {
					alt80 = 1;
				} else if ((true)) {
					alt80 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 80, 1, input);

					throw nvae;

				}
			} else if ((LA80_0 == ID || LA80_0 == INT || LA80_0 == REAL_NUMBER || LA80_0 == 80 || (LA80_0 >= 82 && LA80_0 <= 83) || (LA80_0 >= 96
			                                                                                                                         && LA80_0 <= 100)
			            || (LA80_0 >= 106 && LA80_0 <= 107) || LA80_0 == 111 || (LA80_0 >= 113 && LA80_0 <= 115) || (LA80_0 >= 120 && LA80_0 <= 123)
			            || (LA80_0 >= 125 && LA80_0 <= 129) || LA80_0 == 131 || (LA80_0 >= 133 && LA80_0 <= 134) || (LA80_0 >= 137 && LA80_0 <= 141)
			            || LA80_0 == 143 || (LA80_0 >= 145 && LA80_0 <= 147) || (LA80_0 >= 149 && LA80_0 <= 154) || LA80_0 == 158 || LA80_0 == 160)) {
				alt80 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 80, 0, input);

				throw nvae;

			}
			switch (alt80) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:401:3: ( '(' )=> '(' elementSetSpec ')'
				{
					char_literal275 = (Token) match(input, 81, FOLLOW_81_in_elements2853);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_81.add(char_literal275);


					pushFollow(FOLLOW_elementSetSpec_in_elements2855);
					elementSetSpec276 = elementSetSpec();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_elementSetSpec.add(elementSetSpec276.getTree());

					char_literal277 = (Token) match(input, 82, FOLLOW_82_in_elements2857);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_82.add(char_literal277);


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
						// 401:35: -> ^( elementSetSpec )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:401:38: ^( elementSetSpec )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:402:4: subtypeElements
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_subtypeElements_in_elements2868);
					subtypeElements278 = subtypeElements();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, subtypeElements278.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:404:1: subtypeElements : ( ( value )=> value -> ^( CONSTRAINT_VALUE value ) | valueRange | sizeConstraint | typeConstraint | innerTypeConstraint | patternConstraint );
	public final ASN1Parser.subtypeElements_return subtypeElements() throws RecognitionException {
		ASN1Parser.subtypeElements_return retval = new ASN1Parser.subtypeElements_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		ASN1Parser.value_return value279 = null;

		ASN1Parser.valueRange_return valueRange280 = null;

		ASN1Parser.sizeConstraint_return sizeConstraint281 = null;

		ASN1Parser.typeConstraint_return typeConstraint282 = null;

		ASN1Parser.innerTypeConstraint_return innerTypeConstraint283 = null;

		ASN1Parser.patternConstraint_return patternConstraint284 = null;


		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:404:19: ( ( value )=> value -> ^( CONSTRAINT_VALUE value ) | valueRange | sizeConstraint | typeConstraint | innerTypeConstraint | patternConstraint )
			int alt81 = 6;
			switch (input.LA(1)) {
				case 145: {
					int LA81_1 = input.LA(2);

					if ((LA81_1 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_1 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_1 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_1 == 122 || LA81_1 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_1 == 147 || LA81_1 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_1 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_1 == 85 || LA81_1 == 90)) {
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
				}
				break;
				case 111: {
					int LA81_2 = input.LA(2);

					if ((LA81_2 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_2 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_2 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_2 == 122 || LA81_2 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_2 == 147 || LA81_2 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_2 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_2 == 85 || LA81_2 == 90)) {
						alt81 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 2, input);

						throw nvae;

					}
				}
				break;
				case 134: {
					int LA81_3 = input.LA(2);

					if ((LA81_3 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_3 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_3 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_3 == 122 || LA81_3 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_3 == 147 || LA81_3 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_3 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_3 == 85 || LA81_3 == 90)) {
						alt81 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 3, input);

						throw nvae;

					}
				}
				break;
				case 126: {
					int LA81_4 = input.LA(2);

					if ((LA81_4 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_4 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_4 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_4 == 122 || LA81_4 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_4 == 147 || LA81_4 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_4 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_4 == 85 || LA81_4 == 90)) {
						alt81 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 4, input);

						throw nvae;

					}
				}
				break;
				case ID: {
					int LA81_5 = input.LA(2);

					if ((LA81_5 == 85 || LA81_5 == 90)) {
						alt81 = 2;
					} else if ((synpred7_ASN1())) {
						alt81 = 1;
					} else if ((true)) {
						alt81 = 4;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 5, input);

						throw nvae;

					}
				}
				break;
				case INT: {
					int LA81_6 = input.LA(2);

					if ((LA81_6 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_6 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_6 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_6 == 122 || LA81_6 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_6 == 147 || LA81_6 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_6 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_6 == 85 || LA81_6 == 90)) {
						alt81 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 6, input);

						throw nvae;

					}
				}
				break;
				case REAL_NUMBER: {
					int LA81_7 = input.LA(2);

					if ((LA81_7 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_7 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_7 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_7 == 122 || LA81_7 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_7 == 147 || LA81_7 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_7 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_7 == 85 || LA81_7 == 90)) {
						alt81 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 7, input);

						throw nvae;

					}
				}
				break;
				case 131: {
					int LA81_8 = input.LA(2);

					if ((LA81_8 == 83) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_8 == 80) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_8 == 82) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_8 == 122 || LA81_8 == 158) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_8 == 147 || LA81_8 == 160) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_8 == 107) && (synpred7_ASN1())) {
						alt81 = 1;
					} else if ((LA81_8 == 85 || LA81_8 == 90)) {
						alt81 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 81, 8, input);

						throw nvae;

					}
				}
				break;
				case 125: {
					alt81 = 2;
				}
				break;
				case 141: {
					alt81 = 3;
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
					alt81 = 4;
				}
				break;
				case 153: {
					alt81 = 5;
				}
				break;
				case 133: {
					alt81 = 6;
				}
				break;
				default:
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:405:3: ( value )=> value
				{
					pushFollow(FOLLOW_value_in_subtypeElements2884);
					value279 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_value.add(value279.getTree());

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
						// 405:18: -> ^( CONSTRAINT_VALUE value )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:405:21: ^( CONSTRAINT_VALUE value )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:406:4: valueRange
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_valueRange_in_subtypeElements2897);
					valueRange280 = valueRange();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, valueRange280.getTree());

				}
				break;
				case 3:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:407:4: sizeConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_sizeConstraint_in_subtypeElements2902);
					sizeConstraint281 = sizeConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, sizeConstraint281.getTree());

				}
				break;
				case 4:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:408:4: typeConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_typeConstraint_in_subtypeElements2907);
					typeConstraint282 = typeConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, typeConstraint282.getTree());

				}
				break;
				case 5:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:409:4: innerTypeConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_innerTypeConstraint_in_subtypeElements2912);
					innerTypeConstraint283 = innerTypeConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, innerTypeConstraint283.getTree());

				}
				break;
				case 6:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:410:4: patternConstraint
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_patternConstraint_in_subtypeElements2917);
					patternConstraint284 = patternConstraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, patternConstraint284.getTree());

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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:412:1: innerTypeConstraint : ( 'WITH' 'COMPONENT' constraint -> ^( CONSTRAINT_INNER_TYPE constraint ) | 'WITH' 'COMPONENTS' '{' ( '...' ',' )? typeConstraints '}' -> ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints ) );
	public final ASN1Parser.innerTypeConstraint_return innerTypeConstraint() throws RecognitionException {
		ASN1Parser.innerTypeConstraint_return retval = new ASN1Parser.innerTypeConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal285 = null;
		Token string_literal286 = null;
		Token string_literal288 = null;
		Token string_literal289 = null;
		Token char_literal290 = null;
		Token string_literal291 = null;
		Token char_literal292 = null;
		Token char_literal294 = null;
		ASN1Parser.constraint_return constraint287 = null;

		ASN1Parser.typeConstraints_return typeConstraints293 = null;


		CommonTree string_literal285_tree = null;
		CommonTree string_literal286_tree = null;
		CommonTree string_literal288_tree = null;
		CommonTree string_literal289_tree = null;
		CommonTree char_literal290_tree = null;
		CommonTree string_literal291_tree = null;
		CommonTree char_literal292_tree = null;
		CommonTree char_literal294_tree = null;
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
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:412:22: ( 'WITH' 'COMPONENT' constraint -> ^( CONSTRAINT_INNER_TYPE constraint ) | 'WITH' 'COMPONENTS' '{' ( '...' ',' )? typeConstraints '}' -> ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints ) )
			int alt83 = 2;
			int LA83_0 = input.LA(1);

			if ((LA83_0 == 153)) {
				int LA83_1 = input.LA(2);

				if ((LA83_1 == 101)) {
					alt83 = 1;
				} else if ((LA83_1 == 102)) {
					alt83 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 83, 1, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 83, 0, input);

				throw nvae;

			}
			switch (alt83) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:413:3: 'WITH' 'COMPONENT' constraint
				{
					string_literal285 = (Token) match(input, 153, FOLLOW_153_in_innerTypeConstraint2928);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_153.add(string_literal285);


					string_literal286 = (Token) match(input, 101, FOLLOW_101_in_innerTypeConstraint2930);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_101.add(string_literal286);


					pushFollow(FOLLOW_constraint_in_innerTypeConstraint2932);
					constraint287 = constraint();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_constraint.add(constraint287.getTree());

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
						// 413:33: -> ^( CONSTRAINT_INNER_TYPE constraint )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:413:36: ^( CONSTRAINT_INNER_TYPE constraint )
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:414:4: 'WITH' 'COMPONENTS' '{' ( '...' ',' )? typeConstraints '}'
				{
					string_literal288 = (Token) match(input, 153, FOLLOW_153_in_innerTypeConstraint2945);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_153.add(string_literal288);


					string_literal289 = (Token) match(input, 102, FOLLOW_102_in_innerTypeConstraint2947);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_102.add(string_literal289);


					char_literal290 = (Token) match(input, 159, FOLLOW_159_in_innerTypeConstraint2949);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_159.add(char_literal290);


					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:414:28: ( '...' ',' )?
					int alt82 = 2;
					int LA82_0 = input.LA(1);

					if ((LA82_0 == 86)) {
						alt82 = 1;
					}
					switch (alt82) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:414:29: '...' ','
						{
							string_literal291 = (Token) match(input, 86, FOLLOW_86_in_innerTypeConstraint2952);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_86.add(string_literal291);


							char_literal292 = (Token) match(input, 83, FOLLOW_83_in_innerTypeConstraint2954);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal292);


						}
						break;

					}


					pushFollow(FOLLOW_typeConstraints_in_innerTypeConstraint2958);
					typeConstraints293 = typeConstraints();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_typeConstraints.add(typeConstraints293.getTree());

					char_literal294 = (Token) match(input, 161, FOLLOW_161_in_innerTypeConstraint2960);
					if (state.failed) return retval;
					if (state.backtracking == 0) stream_161.add(char_literal294);


					// AST REWRITE
					// elements: typeConstraints, 86
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
						// 415:3: -> ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints )
						{
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:415:6: ^( CONSTRAINT_INNER_TYPE ( '...' )? typeConstraints )
							{
								CommonTree root_1 = (CommonTree) adaptor.nil();
								root_1 = (CommonTree) adaptor.becomeRoot(
								                                        (CommonTree) adaptor.create(CONSTRAINT_INNER_TYPE, "CONSTRAINT_INNER_TYPE")
								                                        , root_1
								                                        );

								// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:415:30: ( '...' )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:417:1: typeConstraints : namedConstraint ( ',' namedConstraint )* -> ^( VEC ( namedConstraint )+ ) ;
	public final ASN1Parser.typeConstraints_return typeConstraints() throws RecognitionException {
		ASN1Parser.typeConstraints_return retval = new ASN1Parser.typeConstraints_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal296 = null;
		ASN1Parser.namedConstraint_return namedConstraint295 = null;

		ASN1Parser.namedConstraint_return namedConstraint297 = null;


		CommonTree char_literal296_tree = null;
		RewriteRuleTokenStream stream_83 = new RewriteRuleTokenStream(adaptor, "token 83");
		RewriteRuleSubtreeStream stream_namedConstraint = new RewriteRuleSubtreeStream(adaptor, "rule namedConstraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:417:19: ( namedConstraint ( ',' namedConstraint )* -> ^( VEC ( namedConstraint )+ ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:418:3: namedConstraint ( ',' namedConstraint )*
			{
				pushFollow(FOLLOW_namedConstraint_in_typeConstraints2986);
				namedConstraint295 = namedConstraint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_namedConstraint.add(namedConstraint295.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:418:19: ( ',' namedConstraint )*
				loop84:
				do {
					int alt84 = 2;
					int LA84_0 = input.LA(1);

					if ((LA84_0 == 83)) {
						alt84 = 1;
					}


					switch (alt84) {
						case 1:
							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:418:20: ',' namedConstraint
						{
							char_literal296 = (Token) match(input, 83, FOLLOW_83_in_typeConstraints2989);
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_83.add(char_literal296);


							pushFollow(FOLLOW_namedConstraint_in_typeConstraints2991);
							namedConstraint297 = namedConstraint();

							state._fsp--;
							if (state.failed) return retval;
							if (state.backtracking == 0) stream_namedConstraint.add(namedConstraint297.getTree());

						}
						break;

						default:
							break loop84;
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
					// 419:3: -> ^( VEC ( namedConstraint )+ )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:419:6: ^( VEC ( namedConstraint )+ )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:421:1: namedConstraint : ID ( constraint )? ( presenceConstraint )? -> ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? ) ;
	public final ASN1Parser.namedConstraint_return namedConstraint() throws RecognitionException {
		ASN1Parser.namedConstraint_return retval = new ASN1Parser.namedConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token ID298 = null;
		ASN1Parser.constraint_return constraint299 = null;

		ASN1Parser.presenceConstraint_return presenceConstraint300 = null;


		CommonTree ID298_tree = null;
		RewriteRuleTokenStream stream_ID = new RewriteRuleTokenStream(adaptor, "token ID");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		RewriteRuleSubtreeStream stream_presenceConstraint = new RewriteRuleSubtreeStream(adaptor, "rule presenceConstraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:421:19: ( ID ( constraint )? ( presenceConstraint )? -> ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:422:3: ID ( constraint )? ( presenceConstraint )?
			{
				ID298 = (Token) match(input, ID, FOLLOW_ID_in_namedConstraint3017);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_ID.add(ID298);


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:422:6: ( constraint )?
				int alt85 = 2;
				int LA85_0 = input.LA(1);

				if ((LA85_0 == 81)) {
					alt85 = 1;
				}
				switch (alt85) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:422:6: constraint
					{
						pushFollow(FOLLOW_constraint_in_namedConstraint3019);
						constraint299 = constraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_constraint.add(constraint299.getTree());

					}
					break;

				}


				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:422:18: ( presenceConstraint )?
				int alt86 = 2;
				int LA86_0 = input.LA(1);

				if ((LA86_0 == 91 || LA86_0 == 132 || LA86_0 == 135)) {
					alt86 = 1;
				}
				switch (alt86) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:422:18: presenceConstraint
					{
						pushFollow(FOLLOW_presenceConstraint_in_namedConstraint3022);
						presenceConstraint300 = presenceConstraint();

						state._fsp--;
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_presenceConstraint.add(presenceConstraint300.getTree());

					}
					break;

				}


				// AST REWRITE
				// elements: presenceConstraint, constraint, ID
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
					// 423:3: -> ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:423:6: ^( NAMED_CONSTRAINT ID ( presenceConstraint )? ( constraint )? )
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

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:423:28: ( presenceConstraint )?
							if (stream_presenceConstraint.hasNext()) {
								adaptor.addChild(root_1, stream_presenceConstraint.nextTree());

							}
							stream_presenceConstraint.reset();

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:423:48: ( constraint )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:425:1: presenceConstraint : ( 'PRESENT' | 'ABSENT' | 'OPTIONAL' );
	public final ASN1Parser.presenceConstraint_return presenceConstraint() throws RecognitionException {
		ASN1Parser.presenceConstraint_return retval = new ASN1Parser.presenceConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set301 = null;

		CommonTree set301_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:425:21: ( 'PRESENT' | 'ABSENT' | 'OPTIONAL' )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set301 = (Token) input.LT(1);

				if (input.LA(1) == 91 || input.LA(1) == 132 || input.LA(1) == 135) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set301)
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:428:1: typeConstraint : ( 'INCLUDES' )? type -> ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type ) ;
	public final ASN1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
		ASN1Parser.typeConstraint_return retval = new ASN1Parser.typeConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal302 = null;
		ASN1Parser.type_return type303 = null;


		CommonTree string_literal302_tree = null;
		RewriteRuleTokenStream stream_120 = new RewriteRuleTokenStream(adaptor, "token 120");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(adaptor, "rule type");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:428:18: ( ( 'INCLUDES' )? type -> ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:429:3: ( 'INCLUDES' )? type
			{
				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:429:3: ( 'INCLUDES' )?
				int alt87 = 2;
				int LA87_0 = input.LA(1);

				if ((LA87_0 == 120)) {
					alt87 = 1;
				}
				switch (alt87) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:429:3: 'INCLUDES'
					{
						string_literal302 = (Token) match(input, 120, FOLLOW_120_in_typeConstraint3071);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_120.add(string_literal302);


					}
					break;

				}


				pushFollow(FOLLOW_type_in_typeConstraint3074);
				type303 = type();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_type.add(type303.getTree());

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
					// 430:3: -> ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:430:6: ^( CONSTRAINT_TYPE ( 'INCLUDES' )? type )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(CONSTRAINT_TYPE, "CONSTRAINT_TYPE")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:430:24: ( 'INCLUDES' )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:432:1: valueRange : lowerEndPoint '..' upperEndPoint -> ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint ) ;
	public final ASN1Parser.valueRange_return valueRange() throws RecognitionException {
		ASN1Parser.valueRange_return retval = new ASN1Parser.valueRange_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal305 = null;
		ASN1Parser.lowerEndPoint_return lowerEndPoint304 = null;

		ASN1Parser.upperEndPoint_return upperEndPoint306 = null;


		CommonTree string_literal305_tree = null;
		RewriteRuleTokenStream stream_85 = new RewriteRuleTokenStream(adaptor, "token 85");
		RewriteRuleSubtreeStream stream_upperEndPoint = new RewriteRuleSubtreeStream(adaptor, "rule upperEndPoint");
		RewriteRuleSubtreeStream stream_lowerEndPoint = new RewriteRuleSubtreeStream(adaptor, "rule lowerEndPoint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:432:14: ( lowerEndPoint '..' upperEndPoint -> ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:433:3: lowerEndPoint '..' upperEndPoint
			{
				pushFollow(FOLLOW_lowerEndPoint_in_valueRange3099);
				lowerEndPoint304 = lowerEndPoint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_lowerEndPoint.add(lowerEndPoint304.getTree());

				string_literal305 = (Token) match(input, 85, FOLLOW_85_in_valueRange3101);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_85.add(string_literal305);


				pushFollow(FOLLOW_upperEndPoint_in_valueRange3103);
				upperEndPoint306 = upperEndPoint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_upperEndPoint.add(upperEndPoint306.getTree());

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
					// 434:3: -> ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:434:6: ^( CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:436:1: lowerEndPoint : lowerEndValue ( '<' )? -> ^( ENDPOINT ( '<' )? lowerEndValue ) ;
	public final ASN1Parser.lowerEndPoint_return lowerEndPoint() throws RecognitionException {
		ASN1Parser.lowerEndPoint_return retval = new ASN1Parser.lowerEndPoint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal308 = null;
		ASN1Parser.lowerEndValue_return lowerEndValue307 = null;


		CommonTree char_literal308_tree = null;
		RewriteRuleTokenStream stream_90 = new RewriteRuleTokenStream(adaptor, "token 90");
		RewriteRuleSubtreeStream stream_lowerEndValue = new RewriteRuleSubtreeStream(adaptor, "rule lowerEndValue");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:436:17: ( lowerEndValue ( '<' )? -> ^( ENDPOINT ( '<' )? lowerEndValue ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:437:3: lowerEndValue ( '<' )?
			{
				pushFollow(FOLLOW_lowerEndValue_in_lowerEndPoint3127);
				lowerEndValue307 = lowerEndValue();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_lowerEndValue.add(lowerEndValue307.getTree());

				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:437:17: ( '<' )?
				int alt88 = 2;
				int LA88_0 = input.LA(1);

				if ((LA88_0 == 90)) {
					alt88 = 1;
				}
				switch (alt88) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:437:17: '<'
					{
						char_literal308 = (Token) match(input, 90, FOLLOW_90_in_lowerEndPoint3129);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_90.add(char_literal308);


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
					// 438:3: -> ^( ENDPOINT ( '<' )? lowerEndValue )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:438:6: ^( ENDPOINT ( '<' )? lowerEndValue )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(ENDPOINT, "ENDPOINT")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:438:17: ( '<' )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:440:1: upperEndPoint : ( '<' )? upperEndValue -> ^( ENDPOINT ( '<' )? upperEndValue ) ;
	public final ASN1Parser.upperEndPoint_return upperEndPoint() throws RecognitionException {
		ASN1Parser.upperEndPoint_return retval = new ASN1Parser.upperEndPoint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token char_literal309 = null;
		ASN1Parser.upperEndValue_return upperEndValue310 = null;


		CommonTree char_literal309_tree = null;
		RewriteRuleTokenStream stream_90 = new RewriteRuleTokenStream(adaptor, "token 90");
		RewriteRuleSubtreeStream stream_upperEndValue = new RewriteRuleSubtreeStream(adaptor, "rule upperEndValue");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:440:17: ( ( '<' )? upperEndValue -> ^( ENDPOINT ( '<' )? upperEndValue ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:441:3: ( '<' )? upperEndValue
			{
				// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:441:3: ( '<' )?
				int alt89 = 2;
				int LA89_0 = input.LA(1);

				if ((LA89_0 == 90)) {
					alt89 = 1;
				}
				switch (alt89) {
					case 1:
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:441:3: '<'
					{
						char_literal309 = (Token) match(input, 90, FOLLOW_90_in_upperEndPoint3155);
						if (state.failed) return retval;
						if (state.backtracking == 0) stream_90.add(char_literal309);


					}
					break;

				}


				pushFollow(FOLLOW_upperEndValue_in_upperEndPoint3158);
				upperEndValue310 = upperEndValue();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_upperEndValue.add(upperEndValue310.getTree());

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
					// 442:3: -> ^( ENDPOINT ( '<' )? upperEndValue )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:442:6: ^( ENDPOINT ( '<' )? upperEndValue )
						{
							CommonTree root_1 = (CommonTree) adaptor.nil();
							root_1 = (CommonTree) adaptor.becomeRoot(
							                                        (CommonTree) adaptor.create(ENDPOINT, "ENDPOINT")
							                                        , root_1
							                                        );

							// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:442:17: ( '<' )?
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:444:1: lowerEndValue : ( value | 'MIN' );
	public final ASN1Parser.lowerEndValue_return lowerEndValue() throws RecognitionException {
		ASN1Parser.lowerEndValue_return retval = new ASN1Parser.lowerEndValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal312 = null;
		ASN1Parser.value_return value311 = null;


		CommonTree string_literal312_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:444:17: ( value | 'MIN' )
			int alt90 = 2;
			int LA90_0 = input.LA(1);

			if ((LA90_0 == ID || LA90_0 == INT || LA90_0 == REAL_NUMBER || LA90_0 == 111 || LA90_0 == 126 || LA90_0 == 131 || LA90_0 == 134
			     || LA90_0 == 145)) {
				alt90 = 1;
			} else if ((LA90_0 == 125)) {
				alt90 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 90, 0, input);

				throw nvae;

			}
			switch (alt90) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:445:3: value
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_value_in_lowerEndValue3183);
					value311 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, value311.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:446:5: 'MIN'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal312 = (Token) match(input, 125, FOLLOW_125_in_lowerEndValue3190);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal312_tree =
						(CommonTree) adaptor.create(string_literal312)
						;
						adaptor.addChild(root_0, string_literal312_tree);
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:448:1: upperEndValue : ( value | 'MAX' );
	public final ASN1Parser.upperEndValue_return upperEndValue() throws RecognitionException {
		ASN1Parser.upperEndValue_return retval = new ASN1Parser.upperEndValue_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal314 = null;
		ASN1Parser.value_return value313 = null;


		CommonTree string_literal314_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:448:17: ( value | 'MAX' )
			int alt91 = 2;
			int LA91_0 = input.LA(1);

			if ((LA91_0 == ID || LA91_0 == INT || LA91_0 == REAL_NUMBER || LA91_0 == 111 || LA91_0 == 126 || LA91_0 == 131 || LA91_0 == 134
			     || LA91_0 == 145)) {
				alt91 = 1;
			} else if ((LA91_0 == 124)) {
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
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:449:3: value
				{
					root_0 = (CommonTree) adaptor.nil();


					pushFollow(FOLLOW_value_in_upperEndValue3202);
					value313 = value();

					state._fsp--;
					if (state.failed) return retval;
					if (state.backtracking == 0) adaptor.addChild(root_0, value313.getTree());

				}
				break;
				case 2:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:450:5: 'MAX'
				{
					root_0 = (CommonTree) adaptor.nil();


					string_literal314 = (Token) match(input, 124, FOLLOW_124_in_upperEndValue3209);
					if (state.failed) return retval;
					if (state.backtracking == 0) {
						string_literal314_tree =
						(CommonTree) adaptor.create(string_literal314)
						;
						adaptor.addChild(root_0, string_literal314_tree);
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:452:1: sizeConstraint : 'SIZE' constraint -> ^( CONSTRAINT_SIZE constraint ) ;
	public final ASN1Parser.sizeConstraint_return sizeConstraint() throws RecognitionException {
		ASN1Parser.sizeConstraint_return retval = new ASN1Parser.sizeConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal315 = null;
		ASN1Parser.constraint_return constraint316 = null;


		CommonTree string_literal315_tree = null;
		RewriteRuleTokenStream stream_141 = new RewriteRuleTokenStream(adaptor, "token 141");
		RewriteRuleSubtreeStream stream_constraint = new RewriteRuleSubtreeStream(adaptor, "rule constraint");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:452:18: ( 'SIZE' constraint -> ^( CONSTRAINT_SIZE constraint ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:453:3: 'SIZE' constraint
			{
				string_literal315 = (Token) match(input, 141, FOLLOW_141_in_sizeConstraint3221);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_141.add(string_literal315);


				pushFollow(FOLLOW_constraint_in_sizeConstraint3223);
				constraint316 = constraint();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_constraint.add(constraint316.getTree());

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
					// 453:21: -> ^( CONSTRAINT_SIZE constraint )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:453:24: ^( CONSTRAINT_SIZE constraint )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:455:1: patternConstraint : 'PATTERN' value -> ^( CONSTRAINT_PATTERN value ) ;
	public final ASN1Parser.patternConstraint_return patternConstraint() throws RecognitionException {
		ASN1Parser.patternConstraint_return retval = new ASN1Parser.patternConstraint_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token string_literal317 = null;
		ASN1Parser.value_return value318 = null;


		CommonTree string_literal317_tree = null;
		RewriteRuleTokenStream stream_133 = new RewriteRuleTokenStream(adaptor, "token 133");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(adaptor, "rule value");
		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:455:20: ( 'PATTERN' value -> ^( CONSTRAINT_PATTERN value ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:456:3: 'PATTERN' value
			{
				string_literal317 = (Token) match(input, 133, FOLLOW_133_in_patternConstraint3242);
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_133.add(string_literal317);


				pushFollow(FOLLOW_value_in_patternConstraint3244);
				value318 = value();

				state._fsp--;
				if (state.failed) return retval;
				if (state.backtracking == 0) stream_value.add(value318.getTree());

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
					// 456:19: -> ^( CONSTRAINT_PATTERN value )
					{
						// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:456:22: ^( CONSTRAINT_PATTERN value )
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
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:458:1: unionMark : ( '|' | 'UNION' ) ;
	public final ASN1Parser.unionMark_return unionMark() throws RecognitionException {
		ASN1Parser.unionMark_return retval = new ASN1Parser.unionMark_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set319 = null;

		CommonTree set319_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:458:13: ( ( '|' | 'UNION' ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set319 = (Token) input.LT(1);

				if (input.LA(1) == 147 || input.LA(1) == 160) {
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
	// $ANTLR end "unionMark"


	public static class intersectionMark_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() { return tree; }
	}

	;


	// $ANTLR start "intersectionMark"
	// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:461:1: intersectionMark : ( '^' | 'INTERSECTION' ) ;
	public final ASN1Parser.intersectionMark_return intersectionMark() throws RecognitionException {
		ASN1Parser.intersectionMark_return retval = new ASN1Parser.intersectionMark_return();
		retval.start = input.LT(1);


		CommonTree root_0 = null;

		Token set320 = null;

		CommonTree set320_tree = null;

		try {
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:461:20: ( ( '^' | 'INTERSECTION' ) )
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:
			{
				root_0 = (CommonTree) adaptor.nil();


				set320 = (Token) input.LT(1);

				if (input.LA(1) == 122 || input.LA(1) == 158) {
					input.consume();
					if (state.backtracking == 0) {
						adaptor.addChild(
						                root_0,
						                (CommonTree) adaptor.create(set320)
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
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:169:3: ( ( CLASS_DEF )? ID '::=' )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:169:4: ( CLASS_DEF )? ID '::='
		{
			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:169:4: ( CLASS_DEF )?
			int alt92 = 2;
			int LA92_0 = input.LA(1);

			if ((LA92_0 == CLASS_DEF)) {
				alt92 = 1;
			}
			switch (alt92) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:169:4: CLASS_DEF
				{
					match(input, CLASS_DEF, FOLLOW_CLASS_DEF_in_synpred1_ASN1784);
					if (state.failed) return;

				}
				break;

			}


			match(input, ID, FOLLOW_ID_in_synpred1_ASN1787);
			if (state.failed) return;

			match(input, 88, FOLLOW_88_in_synpred1_ASN1789);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_ASN1

	// $ANTLR start synpred2_ASN1
	public final void synpred2_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:203:4: ( 'SEQUENCE' ( constraint )? 'OF' )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:203:5: 'SEQUENCE' ( constraint )? 'OF'
		{
			match(input, 139, FOLLOW_139_in_synpred2_ASN11090);
			if (state.failed) return;

			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:203:16: ( constraint )?
			int alt93 = 2;
			int LA93_0 = input.LA(1);

			if ((LA93_0 == 81)) {
				alt93 = 1;
			}
			switch (alt93) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:203:16: constraint
				{
					pushFollow(FOLLOW_constraint_in_synpred2_ASN11092);
					constraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;

			}


			match(input, 130, FOLLOW_130_in_synpred2_ASN11095);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_ASN1

	// $ANTLR start synpred3_ASN1
	public final void synpred3_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:205:4: ( 'SET' ( constraint )? 'OF' )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:205:5: 'SET' ( constraint )? 'OF'
		{
			match(input, 140, FOLLOW_140_in_synpred3_ASN11128);
			if (state.failed) return;

			// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:205:11: ( constraint )?
			int alt94 = 2;
			int LA94_0 = input.LA(1);

			if ((LA94_0 == 81)) {
				alt94 = 1;
			}
			switch (alt94) {
				case 1:
					// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:205:11: constraint
				{
					pushFollow(FOLLOW_constraint_in_synpred3_ASN11130);
					constraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;

			}


			match(input, 130, FOLLOW_130_in_synpred3_ASN11133);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_ASN1

	// $ANTLR start synpred4_ASN1
	public final void synpred4_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:232:3: ( namedNumber )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:232:4: namedNumber
		{
			pushFollow(FOLLOW_namedNumber_in_synpred4_ASN11424);
			namedNumber();

			state._fsp--;
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_ASN1

	// $ANTLR start synpred5_ASN1
	public final void synpred5_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:293:4: ( VALUE_ID )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:293:5: VALUE_ID
		{
			match(input, VALUE_ID, FOLLOW_VALUE_ID_in_synpred5_ASN11889);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_ASN1

	// $ANTLR start synpred6_ASN1
	public final void synpred6_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:401:3: ( '(' )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:401:4: '('
		{
			match(input, 81, FOLLOW_81_in_synpred6_ASN12848);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_ASN1

	// $ANTLR start synpred7_ASN1
	public final void synpred7_ASN1_fragment() throws RecognitionException {
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:405:3: ( value )
		// /home/lastrix/dev/java/ASN1S/antlr/ASN1.g:405:4: value
		{
			pushFollow(FOLLOW_value_in_synpred7_ASN12881);
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
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_definitiveIdentifier394                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definitiveObjIdComponent_in_definitiveIdentifier396                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_definitiveIdentifier400                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_definitiveObjIdComponent420                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definitiveObjIdComponent425                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_definitiveObjIdComponent438                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_110_in_extensionDefault458                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0040000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_118_in_extensionDefault460                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_taggingMethod_in_tagDefault478                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000010000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_144_in_tagDefault480                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_109_in_exports523                                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000010000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_92_in_exports525                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_exports527                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_109_in_exports540                                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolList_in_exports542                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_exports544                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbol_in_symbolList564                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_symbolList568                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbol_in_symbolList570                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_symbol595                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_119_in_imports616                                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolsFromModuleList_in_imports618                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_imports620                                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolsFromModule_in_symbolsFromModuleList639                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_symbolList_in_symbolsFromModule662                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0001000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_112_in_symbolsFromModule664                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_globalModuleReference_in_symbolsFromModule666                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_globalModuleReference688                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000008L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_assignedIdentifier_in_globalModuleReference690                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_objectIdentifierValue_in_assignedIdentifier711                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedValue_in_assignedIdentifier715                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedValue731                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000100000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_84_in_definedValue733                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedValue737                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_assignment_in_assignmentList761                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000202L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_typeAssignment_in_assignment794                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_valueAssignment_in_assignment799                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_valueAssignment811                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_valueAssignment813                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_valueAssignment815                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_valueAssignment817                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000002000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_89_in_valueAssignment819                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_booleanValue_in_value845                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_numberValue_in_value858                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_objectIdentifierValue_in_value871                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_134_in_numberValue892                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_126_in_numberValue905                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_numberValue918                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_numberValue932                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_REAL_NUMBER_in_numberValue947                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_131_in_objectIdentifierValue966                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_145_in_booleanValue975                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_111_in_booleanValue986                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_CLASS_DEF_in_typeAssignment1004                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_typeAssignment1007                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_typeAssignment1009                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_typeAssignment1011                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_booleanType_in_type1037                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_realType_in_type1050                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_integerType_in_type1063                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_taggedType_in_type1076                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sequenceOfType_in_type1101                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sequenceType_in_type1114                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_setOfType_in_type1138                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_setType_in_type1151                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_choiceType_in_type1164                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_128_in_type1177                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0010000000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_116_in_type1179                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_characterStringType_in_type1192                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_bitStringType_in_type1205                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumeratedType_in_type1218                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_129_in_type1231                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000004000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_142_in_type1233                                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_type1235                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedType_in_type1251                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_selectionType_in_type1264                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedType1286                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000100000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_84_in_definedType1288                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_definedType1292                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_definedType1294                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_restrictedStringType_in_definedType1315                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_definedType1317                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_selectionType1341                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000004000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_90_in_selectionType1343                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_selectionType1345                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_106_in_enumeratedType1367                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_enumeratedType1369                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumerations_in_enumeratedType1371                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_enumeratedType1373                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumerationItem_in_enumerations1395                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_enumerations1398                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_enumerationItem_in_enumerations1400                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_enumerationItem1429                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_enumerationItem1434                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_96_in_bitStringType1454                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000004000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_142_in_bitStringType1456                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedBitList_in_bitStringType1458                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_namedBitList1479                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_namedBitList1481                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_namedBitList1484                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_namedBitList1486                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_namedBitList1490                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_nameNumberForm1514                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_nameNumberForm1516                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_nameNumberForm1518                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_nameNumberForm1520                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_99_in_characterStringType1541                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000004000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_142_in_characterStringType1543                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_characterStringType1545                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_97_in_restrictedStringType1573                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_113_in_restrictedStringType1578                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_114_in_restrictedStringType1583                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_115_in_restrictedStringType1588                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_123_in_restrictedStringType1593                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_127_in_restrictedStringType1598                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_137_in_restrictedStringType1603                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_146_in_restrictedStringType1608                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_143_in_restrictedStringType1613                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_150_in_restrictedStringType1618                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_149_in_restrictedStringType1623                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_151_in_restrictedStringType1628                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_152_in_restrictedStringType1633                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_100_in_choiceType1645                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_choiceType1647                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_alternativesTypeLists_in_choiceType1649                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_choiceType1651                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_choiceType1653                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_alternativeTypeList_in_alternativesTypeLists1676                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_alternativesTypeLists1679                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAndException_in_alternativesTypeLists1681                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_alternativesTypeLists1684                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternativesList_in_alternativesTypeLists1686         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_alternativesTypeLists1690                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_alternativeTypeList1723                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_alternativeTypeList1726                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_alternativeTypeList1728                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1748  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionAdditionAlternativesList1751                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternative_in_extensionAdditionAlternativesList1753  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionAlternativesGroup_in_extensionAdditionAlternative1774 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_extensionAdditionAlternative1778                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_155_in_extensionAdditionAlternativesGroup1787                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_extensionAdditionAlternativesGroup1790                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000800000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_87_in_extensionAdditionAlternativesGroup1792                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_alternativeTypeList_in_extensionAdditionAlternativesGroup1797          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000020000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_157_in_extensionAdditionAlternativesGroup1799                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_140_in_setType1826                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_setType1828                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000400000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeLists_in_setType1830                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_setType1833                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_setType1835                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_140_in_setOfType1861                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_setOfType1863                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_setOfType1866                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sOfComponentType_in_setOfType1868                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_sOfComponentType1892                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_sOfComponentType1896                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_139_in_sequenceType1909                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_sequenceType1911                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000400000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeLists_in_sequenceType1913                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_sequenceType1916                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_sequenceType1918                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeList_in_componentTypeLists1942                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_componentTypeLists1945                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAndException_in_componentTypeLists1947                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditions_in_componentTypeLists1949                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_componentTypeLists1953                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000002L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeList_in_componentTypeLists1955                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAndException_in_componentTypeLists2006                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditions_in_componentTypeLists2008                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_componentTypeLists2011                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentType_in_componentTypeList2040                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_componentTypeList2043                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentType_in_componentTypeList2045                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedType_in_componentType2069                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000008000000000L,
	                                                                                                                               0x0000000000000010L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeOption_in_componentType2071                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_102_in_componentType2090                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_componentType2092                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_componentType2094                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_132_in_componentTypeOption2114                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_103_in_componentTypeOption2126                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_componentTypeOption2128                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionAdditions2149                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAddition_in_extensionAdditions2151                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionAdditions2154                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L,
	                                                                                                                               0x0000000008000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAddition_in_extensionAdditions2156                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentType_in_extensionAddition2181                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionAdditionGroup_in_extensionAddition2185                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_155_in_extensionAdditionGroup2196                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_extensionAdditionGroup2199                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000800000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_87_in_extensionAdditionGroup2201                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_componentTypeList_in_extensionAdditionGroup2205                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000020000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_157_in_extensionAdditionGroup2207                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_extensionEndMarker2230                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_86_in_extensionEndMarker2232                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_86_in_extensionAndException2251                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000010000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exceptionSpec_in_extensionAndException2253                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_80_in_exceptionSpec2276                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedValue_in_exceptionSpec2278                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_80_in_exceptionSpec2296                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_exceptionSpec2298                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000800000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_87_in_exceptionSpec2300                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_exceptionSpec2302                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_80_in_exceptionSpec2322                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_exceptionSpec2324                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_139_in_sequenceOfType2348                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_sequenceOfType2350                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_sequenceOfType2353                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sOfComponentType_in_sequenceOfType2355                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_namedType2376                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_namedType2378                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_154_in_taggedType2400                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L,
	                                                                                                                               0x0000000020000000L,
	                                                                                                                               0x0000000000100100L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_tagClass_in_taggedType2402                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_classNumber_in_taggedType2405                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000010000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_156_in_taggedType2407                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A2E141F40020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_taggingMethod_in_taggedType2409                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_taggedType2412                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_classNumber2439                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_definedValue_in_classNumber2443                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_138_in_realType2472                                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_realType2474                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_121_in_integerType2496                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_integerType2498                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_integerType2502                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumberList_in_integerType2504                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_integerType2506                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_namedNumberList2531                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_namedNumberList2534                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_namedNumberList2536                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_namedNumber2558                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_namedNumber2560                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_INT_in_namedNumber2562                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_namedNumber2564                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_98_in_booleanType2586                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_booleanType2588                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_constraint2612                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F10020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraintSpec_in_constraint2614                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000050000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exceptionSpec_in_constraint2616                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_constraint2618                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpecs_in_constraintSpec2645                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpec_in_elementSetSpecs2657                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_extensionEndMarker_in_elementSetSpecs2660                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_elementSetSpecs2664                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F10020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpec_in_elementSetSpecs2666                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_unions_in_elementSetSpec2698                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_92_in_elementSetSpec2712                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000080000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exclusions_in_elementSetSpec2714                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_107_in_exclusions2736                                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F00020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elements_in_exclusions2738                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersections_in_unions2760                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000100080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_unionMark_in_unions2763                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F00020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersections_in_unions2765                                            = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000100080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersectionElement_in_intersections2790                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0400000000000000L,
	                                                                                                                               0x0000000040000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersectionMark_in_intersections2793                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F00020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_intersectionElement_in_intersections2795                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0400000000000000L,
	                                                                                                                               0x0000000040000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elements_in_intersectionElement2819                                    = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000080000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_exclusions_in_intersectionElement2821                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_elements2853                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0xEB0E841F10020000L,
	                                                                                                                               0x0000000007E6BE6BL
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_elementSetSpec_in_elements2855                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000040000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_82_in_elements2857                                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_subtypeElements_in_elements2868                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_subtypeElements2884                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_valueRange_in_subtypeElements2897                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_sizeConstraint_in_subtypeElements2902                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_typeConstraint_in_subtypeElements2907                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_innerTypeConstraint_in_subtypeElements2912                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_patternConstraint_in_subtypeElements2917                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_153_in_innerTypeConstraint2928                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000002000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_101_in_innerTypeConstraint2930                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_innerTypeConstraint2932                                  = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_153_in_innerTypeConstraint2945                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000004000000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_102_in_innerTypeConstraint2947                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000080000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_159_in_innerTypeConstraint2949                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x0000000000400000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_86_in_innerTypeConstraint2952                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_innerTypeConstraint2954                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_typeConstraints_in_innerTypeConstraint2958                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000200000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_161_in_innerTypeConstraint2960                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedConstraint_in_typeConstraints2986                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_83_in_typeConstraints2989                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedConstraint_in_typeConstraints2991                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000000080000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_namedConstraint3017                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000008020000L,
	                                                                                                                               0x0000000000000090L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_namedConstraint3019                                      = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000008000000L,
	                                                                                                                               0x0000000000000090L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_presenceConstraint_in_namedConstraint3022                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_120_in_typeConstraint3071                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L,
	                                                                                                                               0x8A0E041F00020000L,
	                                                                                                                               0x0000000005E49E03L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_type_in_typeConstraint3074                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_lowerEndPoint_in_valueRange3099                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000200000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_85_in_valueRange3101                                                   = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x5000800004000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_upperEndPoint_in_valueRange3103                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_lowerEndValue_in_lowerEndPoint3127                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L,
	                                                                                                                               0x0000000004000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_90_in_lowerEndPoint3129                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_90_in_upperEndPoint3155                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x5000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_upperEndValue_in_upperEndPoint3158                                     = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_lowerEndValue3183                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_125_in_lowerEndValue3190                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_upperEndValue3202                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_124_in_upperEndValue3209                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_141_in_sizeConstraint3221                                              = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_sizeConstraint3223                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_133_in_patternConstraint3242                                           = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0100004800000000L,
	                                                                                                                               0x4000800000000000L,
	                                                                                                                               0x0000000000020048L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_patternConstraint3244                                         = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_CLASS_DEF_in_synpred1_ASN1784                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000800000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_ID_in_synpred1_ASN1787                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000001000000L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_88_in_synpred1_ASN1789                                                 = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_139_in_synpred2_ASN11090                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_synpred2_ASN11092                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_synpred2_ASN11095                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_140_in_synpred3_ASN11128                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000020000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_constraint_in_synpred3_ASN11130                                        = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000000L,
	                                                                                                                               0x0000000000000004L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_130_in_synpred3_ASN11133                                               = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_namedNumber_in_synpred4_ASN11424                                       = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_VALUE_ID_in_synpred5_ASN11889                                          = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_81_in_synpred6_ASN12848                                                = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);
	public static final BitSet FOLLOW_value_in_synpred7_ASN12881                                             = new BitSet(
	                                                                                                                     new long[]{
	                                                                                                                               0x0000000000000002L
	                                                                                                                     }
	);

}