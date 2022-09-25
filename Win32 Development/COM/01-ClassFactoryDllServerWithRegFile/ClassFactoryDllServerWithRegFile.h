#pragma once

class ISum : public IUnknown {
public:
	virtual HRESULT __stdcall SumOfTwoIntergers(int, int, int*) = 0;
};

class ISubstract : public IUnknown {
public:
	virtual HRESULT __stdcall SubstractionOfTwoIntegers(int, int, int*) = 0;
};

// {653C0965-359B-449b-B89A-3A23309A0B61}
const CLSID CLSID_SumSubstract = { 0x653c0965, 0x359b, 0x449b, 0xb8, 0x9a, 0x3a, 0x23, 0x30, 0x9a, 0xb, 0x61 };

// {AEAF99B9-0519-4141-BE2C-FEE9A5467762}
const IID IID_ISum = { 0xaeaf99b9, 0x519, 0x4141, 0xbe, 0x2c, 0xfe, 0xe9, 0xa5, 0x46, 0x77, 0x62 };

// {D3687370-99C5-4504-9118-A2EAE798F7A5}
const IID IID_ISubstract = { 0xd3687370, 0x99c5, 0x4504, 0x91, 0x18, 0xa2, 0xea, 0xe7, 0x98, 0xf7, 0xa5 };
