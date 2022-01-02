// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone

object Sysz_const {
    // Enums corresponding to SystemZ condition codes
    const val SYSZ_CC_INVALID = 0
    const val SYSZ_CC_O = 1
    const val SYSZ_CC_H = 2
    const val SYSZ_CC_NLE = 3
    const val SYSZ_CC_L = 4
    const val SYSZ_CC_NHE = 5
    const val SYSZ_CC_LH = 6
    const val SYSZ_CC_NE = 7
    const val SYSZ_CC_E = 8
    const val SYSZ_CC_NLH = 9
    const val SYSZ_CC_HE = 10
    const val SYSZ_CC_NL = 11
    const val SYSZ_CC_LE = 12
    const val SYSZ_CC_NH = 13
    const val SYSZ_CC_NO = 14

    // Operand type for instruction's operands
    const val SYSZ_OP_INVALID = 0
    const val SYSZ_OP_REG = 1
    const val SYSZ_OP_IMM = 2
    const val SYSZ_OP_MEM = 3
    const val SYSZ_OP_ACREG = 64

    // SystemZ registers
    const val SYSZ_REG_INVALID = 0
    const val SYSZ_REG_0 = 1
    const val SYSZ_REG_1 = 2
    const val SYSZ_REG_2 = 3
    const val SYSZ_REG_3 = 4
    const val SYSZ_REG_4 = 5
    const val SYSZ_REG_5 = 6
    const val SYSZ_REG_6 = 7
    const val SYSZ_REG_7 = 8
    const val SYSZ_REG_8 = 9
    const val SYSZ_REG_9 = 10
    const val SYSZ_REG_10 = 11
    const val SYSZ_REG_11 = 12
    const val SYSZ_REG_12 = 13
    const val SYSZ_REG_13 = 14
    const val SYSZ_REG_14 = 15
    const val SYSZ_REG_15 = 16
    const val SYSZ_REG_CC = 17
    const val SYSZ_REG_F0 = 18
    const val SYSZ_REG_F1 = 19
    const val SYSZ_REG_F2 = 20
    const val SYSZ_REG_F3 = 21
    const val SYSZ_REG_F4 = 22
    const val SYSZ_REG_F5 = 23
    const val SYSZ_REG_F6 = 24
    const val SYSZ_REG_F7 = 25
    const val SYSZ_REG_F8 = 26
    const val SYSZ_REG_F9 = 27
    const val SYSZ_REG_F10 = 28
    const val SYSZ_REG_F11 = 29
    const val SYSZ_REG_F12 = 30
    const val SYSZ_REG_F13 = 31
    const val SYSZ_REG_F14 = 32
    const val SYSZ_REG_F15 = 33
    const val SYSZ_REG_R0L = 34
    const val SYSZ_REG_ENDING = 35

    // SystemZ instruction
    const val SYSZ_INS_INVALID = 0
    const val SYSZ_INS_A = 1
    const val SYSZ_INS_ADB = 2
    const val SYSZ_INS_ADBR = 3
    const val SYSZ_INS_AEB = 4
    const val SYSZ_INS_AEBR = 5
    const val SYSZ_INS_AFI = 6
    const val SYSZ_INS_AG = 7
    const val SYSZ_INS_AGF = 8
    const val SYSZ_INS_AGFI = 9
    const val SYSZ_INS_AGFR = 10
    const val SYSZ_INS_AGHI = 11
    const val SYSZ_INS_AGHIK = 12
    const val SYSZ_INS_AGR = 13
    const val SYSZ_INS_AGRK = 14
    const val SYSZ_INS_AGSI = 15
    const val SYSZ_INS_AH = 16
    const val SYSZ_INS_AHI = 17
    const val SYSZ_INS_AHIK = 18
    const val SYSZ_INS_AHY = 19
    const val SYSZ_INS_AIH = 20
    const val SYSZ_INS_AL = 21
    const val SYSZ_INS_ALC = 22
    const val SYSZ_INS_ALCG = 23
    const val SYSZ_INS_ALCGR = 24
    const val SYSZ_INS_ALCR = 25
    const val SYSZ_INS_ALFI = 26
    const val SYSZ_INS_ALG = 27
    const val SYSZ_INS_ALGF = 28
    const val SYSZ_INS_ALGFI = 29
    const val SYSZ_INS_ALGFR = 30
    const val SYSZ_INS_ALGHSIK = 31
    const val SYSZ_INS_ALGR = 32
    const val SYSZ_INS_ALGRK = 33
    const val SYSZ_INS_ALHSIK = 34
    const val SYSZ_INS_ALR = 35
    const val SYSZ_INS_ALRK = 36
    const val SYSZ_INS_ALY = 37
    const val SYSZ_INS_AR = 38
    const val SYSZ_INS_ARK = 39
    const val SYSZ_INS_ASI = 40
    const val SYSZ_INS_AXBR = 41
    const val SYSZ_INS_AY = 42
    const val SYSZ_INS_BCR = 43
    const val SYSZ_INS_BRC = 44
    const val SYSZ_INS_BRCL = 45
    const val SYSZ_INS_CGIJ = 46
    const val SYSZ_INS_CGRJ = 47
    const val SYSZ_INS_CIJ = 48
    const val SYSZ_INS_CLGIJ = 49
    const val SYSZ_INS_CLGRJ = 50
    const val SYSZ_INS_CLIJ = 51
    const val SYSZ_INS_CLRJ = 52
    const val SYSZ_INS_CRJ = 53
    const val SYSZ_INS_BER = 54
    const val SYSZ_INS_JE = 55
    const val SYSZ_INS_JGE = 56
    const val SYSZ_INS_LOCE = 57
    const val SYSZ_INS_LOCGE = 58
    const val SYSZ_INS_LOCGRE = 59
    const val SYSZ_INS_LOCRE = 60
    const val SYSZ_INS_STOCE = 61
    const val SYSZ_INS_STOCGE = 62
    const val SYSZ_INS_BHR = 63
    const val SYSZ_INS_BHER = 64
    const val SYSZ_INS_JHE = 65
    const val SYSZ_INS_JGHE = 66
    const val SYSZ_INS_LOCHE = 67
    const val SYSZ_INS_LOCGHE = 68
    const val SYSZ_INS_LOCGRHE = 69
    const val SYSZ_INS_LOCRHE = 70
    const val SYSZ_INS_STOCHE = 71
    const val SYSZ_INS_STOCGHE = 72
    const val SYSZ_INS_JH = 73
    const val SYSZ_INS_JGH = 74
    const val SYSZ_INS_LOCH = 75
    const val SYSZ_INS_LOCGH = 76
    const val SYSZ_INS_LOCGRH = 77
    const val SYSZ_INS_LOCRH = 78
    const val SYSZ_INS_STOCH = 79
    const val SYSZ_INS_STOCGH = 80
    const val SYSZ_INS_CGIJNLH = 81
    const val SYSZ_INS_CGRJNLH = 82
    const val SYSZ_INS_CIJNLH = 83
    const val SYSZ_INS_CLGIJNLH = 84
    const val SYSZ_INS_CLGRJNLH = 85
    const val SYSZ_INS_CLIJNLH = 86
    const val SYSZ_INS_CLRJNLH = 87
    const val SYSZ_INS_CRJNLH = 88
    const val SYSZ_INS_CGIJE = 89
    const val SYSZ_INS_CGRJE = 90
    const val SYSZ_INS_CIJE = 91
    const val SYSZ_INS_CLGIJE = 92
    const val SYSZ_INS_CLGRJE = 93
    const val SYSZ_INS_CLIJE = 94
    const val SYSZ_INS_CLRJE = 95
    const val SYSZ_INS_CRJE = 96
    const val SYSZ_INS_CGIJNLE = 97
    const val SYSZ_INS_CGRJNLE = 98
    const val SYSZ_INS_CIJNLE = 99
    const val SYSZ_INS_CLGIJNLE = 100
    const val SYSZ_INS_CLGRJNLE = 101
    const val SYSZ_INS_CLIJNLE = 102
    const val SYSZ_INS_CLRJNLE = 103
    const val SYSZ_INS_CRJNLE = 104
    const val SYSZ_INS_CGIJH = 105
    const val SYSZ_INS_CGRJH = 106
    const val SYSZ_INS_CIJH = 107
    const val SYSZ_INS_CLGIJH = 108
    const val SYSZ_INS_CLGRJH = 109
    const val SYSZ_INS_CLIJH = 110
    const val SYSZ_INS_CLRJH = 111
    const val SYSZ_INS_CRJH = 112
    const val SYSZ_INS_CGIJNL = 113
    const val SYSZ_INS_CGRJNL = 114
    const val SYSZ_INS_CIJNL = 115
    const val SYSZ_INS_CLGIJNL = 116
    const val SYSZ_INS_CLGRJNL = 117
    const val SYSZ_INS_CLIJNL = 118
    const val SYSZ_INS_CLRJNL = 119
    const val SYSZ_INS_CRJNL = 120
    const val SYSZ_INS_CGIJHE = 121
    const val SYSZ_INS_CGRJHE = 122
    const val SYSZ_INS_CIJHE = 123
    const val SYSZ_INS_CLGIJHE = 124
    const val SYSZ_INS_CLGRJHE = 125
    const val SYSZ_INS_CLIJHE = 126
    const val SYSZ_INS_CLRJHE = 127
    const val SYSZ_INS_CRJHE = 128
    const val SYSZ_INS_CGIJNHE = 129
    const val SYSZ_INS_CGRJNHE = 130
    const val SYSZ_INS_CIJNHE = 131
    const val SYSZ_INS_CLGIJNHE = 132
    const val SYSZ_INS_CLGRJNHE = 133
    const val SYSZ_INS_CLIJNHE = 134
    const val SYSZ_INS_CLRJNHE = 135
    const val SYSZ_INS_CRJNHE = 136
    const val SYSZ_INS_CGIJL = 137
    const val SYSZ_INS_CGRJL = 138
    const val SYSZ_INS_CIJL = 139
    const val SYSZ_INS_CLGIJL = 140
    const val SYSZ_INS_CLGRJL = 141
    const val SYSZ_INS_CLIJL = 142
    const val SYSZ_INS_CLRJL = 143
    const val SYSZ_INS_CRJL = 144
    const val SYSZ_INS_CGIJNH = 145
    const val SYSZ_INS_CGRJNH = 146
    const val SYSZ_INS_CIJNH = 147
    const val SYSZ_INS_CLGIJNH = 148
    const val SYSZ_INS_CLGRJNH = 149
    const val SYSZ_INS_CLIJNH = 150
    const val SYSZ_INS_CLRJNH = 151
    const val SYSZ_INS_CRJNH = 152
    const val SYSZ_INS_CGIJLE = 153
    const val SYSZ_INS_CGRJLE = 154
    const val SYSZ_INS_CIJLE = 155
    const val SYSZ_INS_CLGIJLE = 156
    const val SYSZ_INS_CLGRJLE = 157
    const val SYSZ_INS_CLIJLE = 158
    const val SYSZ_INS_CLRJLE = 159
    const val SYSZ_INS_CRJLE = 160
    const val SYSZ_INS_CGIJNE = 161
    const val SYSZ_INS_CGRJNE = 162
    const val SYSZ_INS_CIJNE = 163
    const val SYSZ_INS_CLGIJNE = 164
    const val SYSZ_INS_CLGRJNE = 165
    const val SYSZ_INS_CLIJNE = 166
    const val SYSZ_INS_CLRJNE = 167
    const val SYSZ_INS_CRJNE = 168
    const val SYSZ_INS_CGIJLH = 169
    const val SYSZ_INS_CGRJLH = 170
    const val SYSZ_INS_CIJLH = 171
    const val SYSZ_INS_CLGIJLH = 172
    const val SYSZ_INS_CLGRJLH = 173
    const val SYSZ_INS_CLIJLH = 174
    const val SYSZ_INS_CLRJLH = 175
    const val SYSZ_INS_CRJLH = 176
    const val SYSZ_INS_BLR = 177
    const val SYSZ_INS_BLER = 178
    const val SYSZ_INS_JLE = 179
    const val SYSZ_INS_JGLE = 180
    const val SYSZ_INS_LOCLE = 181
    const val SYSZ_INS_LOCGLE = 182
    const val SYSZ_INS_LOCGRLE = 183
    const val SYSZ_INS_LOCRLE = 184
    const val SYSZ_INS_STOCLE = 185
    const val SYSZ_INS_STOCGLE = 186
    const val SYSZ_INS_BLHR = 187
    const val SYSZ_INS_JLH = 188
    const val SYSZ_INS_JGLH = 189
    const val SYSZ_INS_LOCLH = 190
    const val SYSZ_INS_LOCGLH = 191
    const val SYSZ_INS_LOCGRLH = 192
    const val SYSZ_INS_LOCRLH = 193
    const val SYSZ_INS_STOCLH = 194
    const val SYSZ_INS_STOCGLH = 195
    const val SYSZ_INS_JL = 196
    const val SYSZ_INS_JGL = 197
    const val SYSZ_INS_LOCL = 198
    const val SYSZ_INS_LOCGL = 199
    const val SYSZ_INS_LOCGRL = 200
    const val SYSZ_INS_LOCRL = 201
    const val SYSZ_INS_LOC = 202
    const val SYSZ_INS_LOCG = 203
    const val SYSZ_INS_LOCGR = 204
    const val SYSZ_INS_LOCR = 205
    const val SYSZ_INS_STOCL = 206
    const val SYSZ_INS_STOCGL = 207
    const val SYSZ_INS_BNER = 208
    const val SYSZ_INS_JNE = 209
    const val SYSZ_INS_JGNE = 210
    const val SYSZ_INS_LOCNE = 211
    const val SYSZ_INS_LOCGNE = 212
    const val SYSZ_INS_LOCGRNE = 213
    const val SYSZ_INS_LOCRNE = 214
    const val SYSZ_INS_STOCNE = 215
    const val SYSZ_INS_STOCGNE = 216
    const val SYSZ_INS_BNHR = 217
    const val SYSZ_INS_BNHER = 218
    const val SYSZ_INS_JNHE = 219
    const val SYSZ_INS_JGNHE = 220
    const val SYSZ_INS_LOCNHE = 221
    const val SYSZ_INS_LOCGNHE = 222
    const val SYSZ_INS_LOCGRNHE = 223
    const val SYSZ_INS_LOCRNHE = 224
    const val SYSZ_INS_STOCNHE = 225
    const val SYSZ_INS_STOCGNHE = 226
    const val SYSZ_INS_JNH = 227
    const val SYSZ_INS_JGNH = 228
    const val SYSZ_INS_LOCNH = 229
    const val SYSZ_INS_LOCGNH = 230
    const val SYSZ_INS_LOCGRNH = 231
    const val SYSZ_INS_LOCRNH = 232
    const val SYSZ_INS_STOCNH = 233
    const val SYSZ_INS_STOCGNH = 234
    const val SYSZ_INS_BNLR = 235
    const val SYSZ_INS_BNLER = 236
    const val SYSZ_INS_JNLE = 237
    const val SYSZ_INS_JGNLE = 238
    const val SYSZ_INS_LOCNLE = 239
    const val SYSZ_INS_LOCGNLE = 240
    const val SYSZ_INS_LOCGRNLE = 241
    const val SYSZ_INS_LOCRNLE = 242
    const val SYSZ_INS_STOCNLE = 243
    const val SYSZ_INS_STOCGNLE = 244
    const val SYSZ_INS_BNLHR = 245
    const val SYSZ_INS_JNLH = 246
    const val SYSZ_INS_JGNLH = 247
    const val SYSZ_INS_LOCNLH = 248
    const val SYSZ_INS_LOCGNLH = 249
    const val SYSZ_INS_LOCGRNLH = 250
    const val SYSZ_INS_LOCRNLH = 251
    const val SYSZ_INS_STOCNLH = 252
    const val SYSZ_INS_STOCGNLH = 253
    const val SYSZ_INS_JNL = 254
    const val SYSZ_INS_JGNL = 255
    const val SYSZ_INS_LOCNL = 256
    const val SYSZ_INS_LOCGNL = 257
    const val SYSZ_INS_LOCGRNL = 258
    const val SYSZ_INS_LOCRNL = 259
    const val SYSZ_INS_STOCNL = 260
    const val SYSZ_INS_STOCGNL = 261
    const val SYSZ_INS_BNOR = 262
    const val SYSZ_INS_JNO = 263
    const val SYSZ_INS_JGNO = 264
    const val SYSZ_INS_LOCNO = 265
    const val SYSZ_INS_LOCGNO = 266
    const val SYSZ_INS_LOCGRNO = 267
    const val SYSZ_INS_LOCRNO = 268
    const val SYSZ_INS_STOCNO = 269
    const val SYSZ_INS_STOCGNO = 270
    const val SYSZ_INS_BOR = 271
    const val SYSZ_INS_JO = 272
    const val SYSZ_INS_JGO = 273
    const val SYSZ_INS_LOCO = 274
    const val SYSZ_INS_LOCGO = 275
    const val SYSZ_INS_LOCGRO = 276
    const val SYSZ_INS_LOCRO = 277
    const val SYSZ_INS_STOCO = 278
    const val SYSZ_INS_STOCGO = 279
    const val SYSZ_INS_STOC = 280
    const val SYSZ_INS_STOCG = 281
    const val SYSZ_INS_BASR = 282
    const val SYSZ_INS_BR = 283
    const val SYSZ_INS_BRAS = 284
    const val SYSZ_INS_BRASL = 285
    const val SYSZ_INS_J = 286
    const val SYSZ_INS_JG = 287
    const val SYSZ_INS_BRCT = 288
    const val SYSZ_INS_BRCTG = 289
    const val SYSZ_INS_C = 290
    const val SYSZ_INS_CDB = 291
    const val SYSZ_INS_CDBR = 292
    const val SYSZ_INS_CDFBR = 293
    const val SYSZ_INS_CDGBR = 294
    const val SYSZ_INS_CDLFBR = 295
    const val SYSZ_INS_CDLGBR = 296
    const val SYSZ_INS_CEB = 297
    const val SYSZ_INS_CEBR = 298
    const val SYSZ_INS_CEFBR = 299
    const val SYSZ_INS_CEGBR = 300
    const val SYSZ_INS_CELFBR = 301
    const val SYSZ_INS_CELGBR = 302
    const val SYSZ_INS_CFDBR = 303
    const val SYSZ_INS_CFEBR = 304
    const val SYSZ_INS_CFI = 305
    const val SYSZ_INS_CFXBR = 306
    const val SYSZ_INS_CG = 307
    const val SYSZ_INS_CGDBR = 308
    const val SYSZ_INS_CGEBR = 309
    const val SYSZ_INS_CGF = 310
    const val SYSZ_INS_CGFI = 311
    const val SYSZ_INS_CGFR = 312
    const val SYSZ_INS_CGFRL = 313
    const val SYSZ_INS_CGH = 314
    const val SYSZ_INS_CGHI = 315
    const val SYSZ_INS_CGHRL = 316
    const val SYSZ_INS_CGHSI = 317
    const val SYSZ_INS_CGR = 318
    const val SYSZ_INS_CGRL = 319
    const val SYSZ_INS_CGXBR = 320
    const val SYSZ_INS_CH = 321
    const val SYSZ_INS_CHF = 322
    const val SYSZ_INS_CHHSI = 323
    const val SYSZ_INS_CHI = 324
    const val SYSZ_INS_CHRL = 325
    const val SYSZ_INS_CHSI = 326
    const val SYSZ_INS_CHY = 327
    const val SYSZ_INS_CIH = 328
    const val SYSZ_INS_CL = 329
    const val SYSZ_INS_CLC = 330
    const val SYSZ_INS_CLFDBR = 331
    const val SYSZ_INS_CLFEBR = 332
    const val SYSZ_INS_CLFHSI = 333
    const val SYSZ_INS_CLFI = 334
    const val SYSZ_INS_CLFXBR = 335
    const val SYSZ_INS_CLG = 336
    const val SYSZ_INS_CLGDBR = 337
    const val SYSZ_INS_CLGEBR = 338
    const val SYSZ_INS_CLGF = 339
    const val SYSZ_INS_CLGFI = 340
    const val SYSZ_INS_CLGFR = 341
    const val SYSZ_INS_CLGFRL = 342
    const val SYSZ_INS_CLGHRL = 343
    const val SYSZ_INS_CLGHSI = 344
    const val SYSZ_INS_CLGR = 345
    const val SYSZ_INS_CLGRL = 346
    const val SYSZ_INS_CLGXBR = 347
    const val SYSZ_INS_CLHF = 348
    const val SYSZ_INS_CLHHSI = 349
    const val SYSZ_INS_CLHRL = 350
    const val SYSZ_INS_CLI = 351
    const val SYSZ_INS_CLIH = 352
    const val SYSZ_INS_CLIY = 353
    const val SYSZ_INS_CLR = 354
    const val SYSZ_INS_CLRL = 355
    const val SYSZ_INS_CLST = 356
    const val SYSZ_INS_CLY = 357
    const val SYSZ_INS_CPSDR = 358
    const val SYSZ_INS_CR = 359
    const val SYSZ_INS_CRL = 360
    const val SYSZ_INS_CS = 361
    const val SYSZ_INS_CSG = 362
    const val SYSZ_INS_CSY = 363
    const val SYSZ_INS_CXBR = 364
    const val SYSZ_INS_CXFBR = 365
    const val SYSZ_INS_CXGBR = 366
    const val SYSZ_INS_CXLFBR = 367
    const val SYSZ_INS_CXLGBR = 368
    const val SYSZ_INS_CY = 369
    const val SYSZ_INS_DDB = 370
    const val SYSZ_INS_DDBR = 371
    const val SYSZ_INS_DEB = 372
    const val SYSZ_INS_DEBR = 373
    const val SYSZ_INS_DL = 374
    const val SYSZ_INS_DLG = 375
    const val SYSZ_INS_DLGR = 376
    const val SYSZ_INS_DLR = 377
    const val SYSZ_INS_DSG = 378
    const val SYSZ_INS_DSGF = 379
    const val SYSZ_INS_DSGFR = 380
    const val SYSZ_INS_DSGR = 381
    const val SYSZ_INS_DXBR = 382
    const val SYSZ_INS_EAR = 383
    const val SYSZ_INS_FIDBR = 384
    const val SYSZ_INS_FIDBRA = 385
    const val SYSZ_INS_FIEBR = 386
    const val SYSZ_INS_FIEBRA = 387
    const val SYSZ_INS_FIXBR = 388
    const val SYSZ_INS_FIXBRA = 389
    const val SYSZ_INS_FLOGR = 390
    const val SYSZ_INS_IC = 391
    const val SYSZ_INS_ICY = 392
    const val SYSZ_INS_IIHF = 393
    const val SYSZ_INS_IIHH = 394
    const val SYSZ_INS_IIHL = 395
    const val SYSZ_INS_IILF = 396
    const val SYSZ_INS_IILH = 397
    const val SYSZ_INS_IILL = 398
    const val SYSZ_INS_IPM = 399
    const val SYSZ_INS_L = 400
    const val SYSZ_INS_LA = 401
    const val SYSZ_INS_LAA = 402
    const val SYSZ_INS_LAAG = 403
    const val SYSZ_INS_LAAL = 404
    const val SYSZ_INS_LAALG = 405
    const val SYSZ_INS_LAN = 406
    const val SYSZ_INS_LANG = 407
    const val SYSZ_INS_LAO = 408
    const val SYSZ_INS_LAOG = 409
    const val SYSZ_INS_LARL = 410
    const val SYSZ_INS_LAX = 411
    const val SYSZ_INS_LAXG = 412
    const val SYSZ_INS_LAY = 413
    const val SYSZ_INS_LB = 414
    const val SYSZ_INS_LBH = 415
    const val SYSZ_INS_LBR = 416
    const val SYSZ_INS_LCDBR = 417
    const val SYSZ_INS_LCEBR = 418
    const val SYSZ_INS_LCGFR = 419
    const val SYSZ_INS_LCGR = 420
    const val SYSZ_INS_LCR = 421
    const val SYSZ_INS_LCXBR = 422
    const val SYSZ_INS_LD = 423
    const val SYSZ_INS_LDEB = 424
    const val SYSZ_INS_LDEBR = 425
    const val SYSZ_INS_LDGR = 426
    const val SYSZ_INS_LDR = 427
    const val SYSZ_INS_LDXBR = 428
    const val SYSZ_INS_LDXBRA = 429
    const val SYSZ_INS_LDY = 430
    const val SYSZ_INS_LE = 431
    const val SYSZ_INS_LEDBR = 432
    const val SYSZ_INS_LEDBRA = 433
    const val SYSZ_INS_LER = 434
    const val SYSZ_INS_LEXBR = 435
    const val SYSZ_INS_LEXBRA = 436
    const val SYSZ_INS_LEY = 437
    const val SYSZ_INS_LFH = 438
    const val SYSZ_INS_LG = 439
    const val SYSZ_INS_LGB = 440
    const val SYSZ_INS_LGBR = 441
    const val SYSZ_INS_LGDR = 442
    const val SYSZ_INS_LGF = 443
    const val SYSZ_INS_LGFI = 444
    const val SYSZ_INS_LGFR = 445
    const val SYSZ_INS_LGFRL = 446
    const val SYSZ_INS_LGH = 447
    const val SYSZ_INS_LGHI = 448
    const val SYSZ_INS_LGHR = 449
    const val SYSZ_INS_LGHRL = 450
    const val SYSZ_INS_LGR = 451
    const val SYSZ_INS_LGRL = 452
    const val SYSZ_INS_LH = 453
    const val SYSZ_INS_LHH = 454
    const val SYSZ_INS_LHI = 455
    const val SYSZ_INS_LHR = 456
    const val SYSZ_INS_LHRL = 457
    const val SYSZ_INS_LHY = 458
    const val SYSZ_INS_LLC = 459
    const val SYSZ_INS_LLCH = 460
    const val SYSZ_INS_LLCR = 461
    const val SYSZ_INS_LLGC = 462
    const val SYSZ_INS_LLGCR = 463
    const val SYSZ_INS_LLGF = 464
    const val SYSZ_INS_LLGFR = 465
    const val SYSZ_INS_LLGFRL = 466
    const val SYSZ_INS_LLGH = 467
    const val SYSZ_INS_LLGHR = 468
    const val SYSZ_INS_LLGHRL = 469
    const val SYSZ_INS_LLH = 470
    const val SYSZ_INS_LLHH = 471
    const val SYSZ_INS_LLHR = 472
    const val SYSZ_INS_LLHRL = 473
    const val SYSZ_INS_LLIHF = 474
    const val SYSZ_INS_LLIHH = 475
    const val SYSZ_INS_LLIHL = 476
    const val SYSZ_INS_LLILF = 477
    const val SYSZ_INS_LLILH = 478
    const val SYSZ_INS_LLILL = 479
    const val SYSZ_INS_LMG = 480
    const val SYSZ_INS_LNDBR = 481
    const val SYSZ_INS_LNEBR = 482
    const val SYSZ_INS_LNGFR = 483
    const val SYSZ_INS_LNGR = 484
    const val SYSZ_INS_LNR = 485
    const val SYSZ_INS_LNXBR = 486
    const val SYSZ_INS_LPDBR = 487
    const val SYSZ_INS_LPEBR = 488
    const val SYSZ_INS_LPGFR = 489
    const val SYSZ_INS_LPGR = 490
    const val SYSZ_INS_LPR = 491
    const val SYSZ_INS_LPXBR = 492
    const val SYSZ_INS_LR = 493
    const val SYSZ_INS_LRL = 494
    const val SYSZ_INS_LRV = 495
    const val SYSZ_INS_LRVG = 496
    const val SYSZ_INS_LRVGR = 497
    const val SYSZ_INS_LRVR = 498
    const val SYSZ_INS_LT = 499
    const val SYSZ_INS_LTDBR = 500
    const val SYSZ_INS_LTEBR = 501
    const val SYSZ_INS_LTG = 502
    const val SYSZ_INS_LTGF = 503
    const val SYSZ_INS_LTGFR = 504
    const val SYSZ_INS_LTGR = 505
    const val SYSZ_INS_LTR = 506
    const val SYSZ_INS_LTXBR = 507
    const val SYSZ_INS_LXDB = 508
    const val SYSZ_INS_LXDBR = 509
    const val SYSZ_INS_LXEB = 510
    const val SYSZ_INS_LXEBR = 511
    const val SYSZ_INS_LXR = 512
    const val SYSZ_INS_LY = 513
    const val SYSZ_INS_LZDR = 514
    const val SYSZ_INS_LZER = 515
    const val SYSZ_INS_LZXR = 516
    const val SYSZ_INS_MADB = 517
    const val SYSZ_INS_MADBR = 518
    const val SYSZ_INS_MAEB = 519
    const val SYSZ_INS_MAEBR = 520
    const val SYSZ_INS_MDB = 521
    const val SYSZ_INS_MDBR = 522
    const val SYSZ_INS_MDEB = 523
    const val SYSZ_INS_MDEBR = 524
    const val SYSZ_INS_MEEB = 525
    const val SYSZ_INS_MEEBR = 526
    const val SYSZ_INS_MGHI = 527
    const val SYSZ_INS_MH = 528
    const val SYSZ_INS_MHI = 529
    const val SYSZ_INS_MHY = 530
    const val SYSZ_INS_MLG = 531
    const val SYSZ_INS_MLGR = 532
    const val SYSZ_INS_MS = 533
    const val SYSZ_INS_MSDB = 534
    const val SYSZ_INS_MSDBR = 535
    const val SYSZ_INS_MSEB = 536
    const val SYSZ_INS_MSEBR = 537
    const val SYSZ_INS_MSFI = 538
    const val SYSZ_INS_MSG = 539
    const val SYSZ_INS_MSGF = 540
    const val SYSZ_INS_MSGFI = 541
    const val SYSZ_INS_MSGFR = 542
    const val SYSZ_INS_MSGR = 543
    const val SYSZ_INS_MSR = 544
    const val SYSZ_INS_MSY = 545
    const val SYSZ_INS_MVC = 546
    const val SYSZ_INS_MVGHI = 547
    const val SYSZ_INS_MVHHI = 548
    const val SYSZ_INS_MVHI = 549
    const val SYSZ_INS_MVI = 550
    const val SYSZ_INS_MVIY = 551
    const val SYSZ_INS_MVST = 552
    const val SYSZ_INS_MXBR = 553
    const val SYSZ_INS_MXDB = 554
    const val SYSZ_INS_MXDBR = 555
    const val SYSZ_INS_N = 556
    const val SYSZ_INS_NC = 557
    const val SYSZ_INS_NG = 558
    const val SYSZ_INS_NGR = 559
    const val SYSZ_INS_NGRK = 560
    const val SYSZ_INS_NI = 561
    const val SYSZ_INS_NIHF = 562
    const val SYSZ_INS_NIHH = 563
    const val SYSZ_INS_NIHL = 564
    const val SYSZ_INS_NILF = 565
    const val SYSZ_INS_NILH = 566
    const val SYSZ_INS_NILL = 567
    const val SYSZ_INS_NIY = 568
    const val SYSZ_INS_NR = 569
    const val SYSZ_INS_NRK = 570
    const val SYSZ_INS_NY = 571
    const val SYSZ_INS_O = 572
    const val SYSZ_INS_OC = 573
    const val SYSZ_INS_OG = 574
    const val SYSZ_INS_OGR = 575
    const val SYSZ_INS_OGRK = 576
    const val SYSZ_INS_OI = 577
    const val SYSZ_INS_OIHF = 578
    const val SYSZ_INS_OIHH = 579
    const val SYSZ_INS_OIHL = 580
    const val SYSZ_INS_OILF = 581
    const val SYSZ_INS_OILH = 582
    const val SYSZ_INS_OILL = 583
    const val SYSZ_INS_OIY = 584
    const val SYSZ_INS_OR = 585
    const val SYSZ_INS_ORK = 586
    const val SYSZ_INS_OY = 587
    const val SYSZ_INS_PFD = 588
    const val SYSZ_INS_PFDRL = 589
    const val SYSZ_INS_RISBG = 590
    const val SYSZ_INS_RISBHG = 591
    const val SYSZ_INS_RISBLG = 592
    const val SYSZ_INS_RLL = 593
    const val SYSZ_INS_RLLG = 594
    const val SYSZ_INS_RNSBG = 595
    const val SYSZ_INS_ROSBG = 596
    const val SYSZ_INS_RXSBG = 597
    const val SYSZ_INS_S = 598
    const val SYSZ_INS_SDB = 599
    const val SYSZ_INS_SDBR = 600
    const val SYSZ_INS_SEB = 601
    const val SYSZ_INS_SEBR = 602
    const val SYSZ_INS_SG = 603
    const val SYSZ_INS_SGF = 604
    const val SYSZ_INS_SGFR = 605
    const val SYSZ_INS_SGR = 606
    const val SYSZ_INS_SGRK = 607
    const val SYSZ_INS_SH = 608
    const val SYSZ_INS_SHY = 609
    const val SYSZ_INS_SL = 610
    const val SYSZ_INS_SLB = 611
    const val SYSZ_INS_SLBG = 612
    const val SYSZ_INS_SLBR = 613
    const val SYSZ_INS_SLFI = 614
    const val SYSZ_INS_SLG = 615
    const val SYSZ_INS_SLBGR = 616
    const val SYSZ_INS_SLGF = 617
    const val SYSZ_INS_SLGFI = 618
    const val SYSZ_INS_SLGFR = 619
    const val SYSZ_INS_SLGR = 620
    const val SYSZ_INS_SLGRK = 621
    const val SYSZ_INS_SLL = 622
    const val SYSZ_INS_SLLG = 623
    const val SYSZ_INS_SLLK = 624
    const val SYSZ_INS_SLR = 625
    const val SYSZ_INS_SLRK = 626
    const val SYSZ_INS_SLY = 627
    const val SYSZ_INS_SQDB = 628
    const val SYSZ_INS_SQDBR = 629
    const val SYSZ_INS_SQEB = 630
    const val SYSZ_INS_SQEBR = 631
    const val SYSZ_INS_SQXBR = 632
    const val SYSZ_INS_SR = 633
    const val SYSZ_INS_SRA = 634
    const val SYSZ_INS_SRAG = 635
    const val SYSZ_INS_SRAK = 636
    const val SYSZ_INS_SRK = 637
    const val SYSZ_INS_SRL = 638
    const val SYSZ_INS_SRLG = 639
    const val SYSZ_INS_SRLK = 640
    const val SYSZ_INS_SRST = 641
    const val SYSZ_INS_ST = 642
    const val SYSZ_INS_STC = 643
    const val SYSZ_INS_STCH = 644
    const val SYSZ_INS_STCY = 645
    const val SYSZ_INS_STD = 646
    const val SYSZ_INS_STDY = 647
    const val SYSZ_INS_STE = 648
    const val SYSZ_INS_STEY = 649
    const val SYSZ_INS_STFH = 650
    const val SYSZ_INS_STG = 651
    const val SYSZ_INS_STGRL = 652
    const val SYSZ_INS_STH = 653
    const val SYSZ_INS_STHH = 654
    const val SYSZ_INS_STHRL = 655
    const val SYSZ_INS_STHY = 656
    const val SYSZ_INS_STMG = 657
    const val SYSZ_INS_STRL = 658
    const val SYSZ_INS_STRV = 659
    const val SYSZ_INS_STRVG = 660
    const val SYSZ_INS_STY = 661
    const val SYSZ_INS_SXBR = 662
    const val SYSZ_INS_SY = 663
    const val SYSZ_INS_TM = 664
    const val SYSZ_INS_TMHH = 665
    const val SYSZ_INS_TMHL = 666
    const val SYSZ_INS_TMLH = 667
    const val SYSZ_INS_TMLL = 668
    const val SYSZ_INS_TMY = 669
    const val SYSZ_INS_X = 670
    const val SYSZ_INS_XC = 671
    const val SYSZ_INS_XG = 672
    const val SYSZ_INS_XGR = 673
    const val SYSZ_INS_XGRK = 674
    const val SYSZ_INS_XI = 675
    const val SYSZ_INS_XIHF = 676
    const val SYSZ_INS_XILF = 677
    const val SYSZ_INS_XIY = 678
    const val SYSZ_INS_XR = 679
    const val SYSZ_INS_XRK = 680
    const val SYSZ_INS_XY = 681
    const val SYSZ_INS_ENDING = 682

    // Group of SystemZ instructions
    const val SYSZ_GRP_INVALID = 0

    // Generic groups
    const val SYSZ_GRP_JUMP = 1

    // Architecture-specific groups
    const val SYSZ_GRP_DISTINCTOPS = 128
    const val SYSZ_GRP_FPEXTENSION = 129
    const val SYSZ_GRP_HIGHWORD = 130
    const val SYSZ_GRP_INTERLOCKEDACCESS1 = 131
    const val SYSZ_GRP_LOADSTOREONCOND = 132
    const val SYSZ_GRP_ENDING = 133
}